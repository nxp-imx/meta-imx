SUMMARY = "Linux CAN network development utilities"
DESCRIPTION = "Linux CAN network development"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit autotools pkgconfig

DEPENDS = "libsocketcan"

SRC_URI = "git://git.gitorious.org/linux-can/can-utils.git;protocol=git;branch=master"
SRCREV = "67a2bdcd336e6becfa5784742e18c88dbeddc973"

S="${WORKDIR}/git"

