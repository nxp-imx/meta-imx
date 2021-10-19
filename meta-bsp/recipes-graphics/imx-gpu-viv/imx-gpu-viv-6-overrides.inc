require recipes-graphics/imx-gpu-viv/imx-gpu-viv-6.inc

PACKAGECONFIG ?= "valgrind"

INHIBIT_SYSROOT_STRIP = "1"

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

# dri and libVDK.so are removed, make a workaround so base install is not broken
do_install_prepend() {
    mkdir -p ${S}/gpu-core/usr/lib/dri
    mkdir -p ${S}/gpu-core/usr/lib/fb
    touch ${S}/gpu-core/usr/lib/fb/libVDK.so.1.2.0
}
do_install_append() {
    rm -rf ${D}${libdir}/dri
    rm -f ${D}${libdir}/libVDK-fb.so.1.2.0
}

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
