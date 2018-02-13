SUMMARY = "Vulkan benchmarking suite."
DESCRIPTION = "vkmark is an extensible Vulkan benchmarking suite with \
               targeted, configurable scenes."
SECTION = "graphics"

LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING-LGPL2.1;md5=4fbd65380cdd255951079008b364516c"

inherit meson

S = "${WORKDIR}/git"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/vkmark/vkmark;protocol=https"

VKMARK_INSTALL_DIR = "${WORKDIR}/vm-install"

DEPENDS = " vulkan imx-gpu-viv assimp glm ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', '', \
                bb.utils.contains('DISTRO_FEATURES', 'x11', ' libxcb','libdrm libgbm', d), d)}"
do_compile() {

    ninja -C ${WORKDIR}/build
}

do_install() {

    DESTDIR=${VKMARK_INSTALL_DIR} ninja -C ${WORKDIR}/build install
    install -d ${D}${bindir}
    install -d ${D}${datadir}
    install -d ${D}${libdir}
    cp -r ${VKMARK_INSTALL_DIR}${bindir}/* ${D}${bindir}/
    cp -r ${VKMARK_INSTALL_DIR}${datadir}/* ${D}${datadir}/
    cp -r ${VKMARK_INSTALL_DIR}${libdir}/* ${D}${libdir}/
}

FILES_${PN} += "${bindir} ${datadir}"

COMPATIBLE_MACHINE = "(mx8)"
