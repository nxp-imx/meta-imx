SUMMARY = "Wayland IVI Extension"
DESCRIPTION = "GENIVI Layer Management API based on Wayland IVI Extension"
HOMEPAGE = "http://projects.genivi.org/wayland-ivi-extension"
BUGTRACKER = "http://bugs.genivi.org/enter_bug.cgi?product=Wayland%20IVI%20Extension"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1f1a56bb2dadf5f2be8eb342acf4ed79"

PR = "r0"

SRCREV = "b13e438cbc6ca24fb5e070c125b3dcd8f120b4c2"
SRC_URI = "git://github.com/GENIVI/${BPN}.git;protocol=http;branch=master \
    "
PV = "2.2.0+git${SRCPV}"
S = "${WORKDIR}/git"

DEPENDS = "weston wayland-native"

inherit cmake

EXTRA_OECMAKE := "-DWITH_ILM_INPUT=1"

FILES_${PN} += " \
        ${libdir}/weston/* \
        ${datadir}/wayland-protocols \
    "
FILES_${PN}-dbg += "${libdir}/weston/.debug/*"
INSANE_SKIP_${PN} = "dev-deps"

EXTRA_OECMAKE += "-DLIB_SUFFIX=${@d.getVar('baselib', True).replace('lib', '')}"

