SUMMARY = "Linux CAN network development utilities"
DESCRIPTION = "Linux CAN network development"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

inherit autotools pkgconfig

DEPENDS = "libsocketcan" 

SRC_URI = "git://git.gitorious.org/linux-can/can-utils.git;protocol=git"
SRCREV = "16c970d"

S="${WORKDIR}/git"

do_install () {
    oe_runmake DESTDIR="${D}" install
}



