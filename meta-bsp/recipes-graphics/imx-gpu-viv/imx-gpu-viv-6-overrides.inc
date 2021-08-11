require recipes-graphics/imx-gpu-viv/imx-gpu-viv-6.inc

PACKAGECONFIG ?= "valgrind"
PACKAGES_remove = " \
	libwayland-viv-imx libwayland-viv-imx-dev \
	libgc-wayland-protocol-imx libgc-wayland-protocol-imx-dev \
	libnn-imx-dev \
"

INHIBIT_SYSROOT_STRIP = "1"
INSANE_SKIP_${BPN}_remove = "already-stripped"

IMX_SOC        = "IMX_SOC_NOT_SET"
IMX_SOC_mx8qm  = "mx8qm"
IMX_SOC_mx8mp  = "mx8mp"
IMX_SOC_mx8mq  = "mx8mq"
IMX_SOC_mx8qxp = "mx8qxp"
IMX_SOC_mx8mn  = "mx8mn"
IMX_SOC_mx8ulp = "mx8ulp"

do_install_append() {
    if [ -d ${S}/gpu-core/usr/lib/${IMX_SOC} ]; then
        cp -r ${S}/gpu-core/usr/lib/${IMX_SOC}/* ${D}${libdir}
    fi
    # Undo removals
    for header in ${GLES3_HEADER_REMOVALS}; do
        cp ${S}/gpu-core/usr/include/GLES3/${header} ${D}${includedir}/GLES3
    done
}

FILES_libclc-imx += "${includedir}/CL/cl_viv_vx_ext.h"

RDEPENDS_libopenvg-imx += "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'systemd-gpuconfig', '', d)}"

FILES_libnn-imx_remove = "${libdir}/libnn*${SOLIBS} ${libdir}/libneuralnetworks${SOLIBS}"

FILES_libvulkan-imx += "${libdir}/libvulkan_VSI${SOLIBS}"
INSANE_SKIP_libvulkan-imx += "dev-so"
FILES_libopenvx-imx += "${libdir}/libOpenVX${SOLIBS}"
INSANE_SKIP_libopenvx-imx += "dev-so dev-deps"
FILES_libopencl-imx += "${libdir}/libOpenCL${SOLIBS}"
INSANE_SKIP_libopencl-imx += "dev-so dev-deps"
FILES_libopenvg-imx += "${libdir}/libOpenVG*${SOLIBS}"
INSANE_SKIP_libopenvg-imx += "dev-so"
FILES_libvdk-imx += "${libdir}/libVDK*${SOLIBS}"
INSANE_SKIP_libvdk-imx += "dev-so"
