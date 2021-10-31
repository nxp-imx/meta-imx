require recipes-graphics/imx-gpu-viv/imx-gpu-viv-6.inc

PACKAGECONFIG ?= "valgrind"

IMX_SOC        = "IMX_SOC_NOT_SET"
IMX_SOC:mx8qm  = "mx8qm"
IMX_SOC:mx8mp  = "mx8mp"
IMX_SOC:mx8mq  = "mx8mq"
IMX_SOC:mx8qxp = "mx8qxp"
IMX_SOC:mx8mn  = "mx8mn"
IMX_SOC:mx8ulp = "mx8ulp"

do_install:append() {
    if [ -d ${S}/gpu-core/usr/lib/${IMX_SOC} ]; then
        cp -r ${S}/gpu-core/usr/lib/${IMX_SOC}/* ${D}${libdir}
    fi
    # Undo removals
    for header in ${GLES3_HEADER_REMOVALS}; do
        cp ${S}/gpu-core/usr/include/GLES3/${header} ${D}${includedir}/GLES3
    done
}

# dri and libVDK.so are removed, make a workaround so base install is not broken
do_install:prepend() {
    mkdir -p ${S}/gpu-core/usr/lib/dri
    mkdir -p ${S}/gpu-core/usr/lib/fb
    touch ${S}/gpu-core/usr/lib/fb/libVDK.so.1.2.0
}
do_install:append() {
    rm -rf ${D}${libdir}/dri
    rm -f ${D}${libdir}/libVDK-fb.so.1.2.0
}

RDEPENDS:libopenvg-imx += "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'systemd-gpuconfig', '', d)}"

# FIXME: Don't add .so to main package
FILES:libvulkan-imx += "${libdir}/libvulkan_VSI${SOLIBS}"
INSANE_SKIP:libvulkan-imx += "dev-so"
FILES:libopenvx-imx += "${libdir}/libOpenVX${SOLIBS}"
INSANE_SKIP:libopenvx-imx += "dev-so dev-deps"
FILES:libopencl-imx += "${libdir}/libOpenCL${SOLIBS}"
INSANE_SKIP:libopencl-imx += "dev-so dev-deps"
FILES:libopenvg-imx += "${libdir}/libOpenVG*${SOLIBS}"
INSANE_SKIP:libopenvg-imx += "dev-so"
FILES:libvdk-imx += "${libdir}/libVDK*${SOLIBS}"
INSANE_SKIP:libvdk-imx += "dev-so"
