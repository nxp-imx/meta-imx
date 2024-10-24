SUMMARY = "EDID and DisplayID library."
HOMEPAGE = "https://gitlab.freedesktop.org/emersion/libdisplay-info"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e4426409957080ee0352128354cea2de"

SRC_URI = "git://gitlab.freedesktop.org/emersion/libdisplay-info.git;branch=main;protocol=https"

DEPENDS = "hwdata-native"

S = "${WORKDIR}/git"
PV = "0.1.1"
SRCREV = "92b031749c0fe84ef5cdf895067b84a829920e25"

inherit meson pkgconfig

PACKAGECONFIG ?= ""
PACKAGECONFIG[test] = ",,edid-decode-native"

BBCLASSEXTEND = "native"
