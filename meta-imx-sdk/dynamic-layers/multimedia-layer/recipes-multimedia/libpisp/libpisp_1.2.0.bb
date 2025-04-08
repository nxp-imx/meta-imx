SUMMARY = "Run-time configuration for the Raspberry Pi ISP (PiSP)"
DESCRIPTION = "\
A helper library to generate run-time configuration for the \
Raspberry Pi Image Signal Processor (PiSP), consisting of the \
Frontend and Backend hardware components"
HOMEPAGE = "https://github.com/raspberrypi/libpisp"
SECTION = "libs/devel"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3417a46e992fdf62e5759fba9baef7a7"

DEPENDS = "nlohmann-json"

SRC_URI = "git://github.com/raspberrypi/libpisp.git;branch=main;protocol=https"
SRCREV = "50426319aa1a9ba4672f91977429365ad4e335a2"

S = "${WORKDIR}/git"

inherit meson pkgconfig

EXTRA_OEMESON = "-Dlogging=disabled"
