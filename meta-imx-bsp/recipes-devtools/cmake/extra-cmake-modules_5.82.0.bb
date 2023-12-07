SUMMARY = "Extra modules and scripts for CMake"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1"

SRCREV = "77e9318d5245c6782e4381699d6f485876e8e9cd"

SRC_URI = " \
    git://github.com/KDE/extra-cmake-modules;protocol=https;branch=master \
"
S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DBUILD_TESTING=off"

inherit cmake

FILES:${PN} += "${datadir}/ECM"
