SUMMARY = "Linux CAN network development utilities"
DESCRIPTION = "Linux CAN network development"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit autotools pkgconfig

DEPENDS = "libsocketcan"

SRC_URI = "git://git.gitorious.org/linux-can/can-utils.git;protocol=git;branch=master"
SRCREV = "16c970d40e6c19dde705bad4751bab1a3a4f3a0d"

S="${WORKDIR}/git"

do_install () {
    oe_runmake DESTDIR="${D}" install
}

