SUMMARY = "Vulkan benchmarking suite."
DESCRIPTION = "vkmark is an extensible Vulkan benchmarking suite with \
               targeted, configurable scenes."
SECTION = "graphics"

LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING-LGPL2.1;md5=4fbd65380cdd255951079008b364516c"

inherit meson

S = "${WORKDIR}/git"

SRCREV = "1ebd49364f03372a710f010c01dedd0d79456413"
SRC_URI = "git://github.com/vkmark/vkmark;protocol=https"
SRC_URI += "file://0001-scenes-Use-depth-format-supported-by-i.MX.patch"

VKMARK_INSTALL_DIR = "${WORKDIR}/vm-install"

DEPENDS = " vulkan-headers vulkan-loader imx-gpu-viv assimp glm ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', '', \
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
