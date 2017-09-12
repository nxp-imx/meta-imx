require recipes-graphics/imx-gpu-viv/imx-gpu-viv-v6.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

DEPENDS += "${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'libxcb libxshmfence', '', d)}"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

PACKAGE_FP_TYPE = "hardfp"

do_install_prepend_imxgpu3d () {
    install -d ${D}${libdir}/pkgconfig
    if [ "${USE_X11}" = "yes" ]; then
        install -m 0644 ${S}/gpu-core/usr/lib/pkgconfig/gbm.pc ${D}${libdir}/pkgconfig/gbm.pc
    elif [ "${USE_WL}" = "no" ]; then
        install -m 0644 ${S}/gpu-core/usr/lib/pkgconfig/gbm.pc ${D}${libdir}/pkgconfig/gbm.pc
    fi
}
