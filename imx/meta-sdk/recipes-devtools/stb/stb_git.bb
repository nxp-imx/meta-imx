SUMMARY = "single-file public domain (or MIT licensed) libraries for C/C++"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;md5=42144ce827adcfa5170032f0ea03c227"

PV = "2.31"

BRANCH = "master"
SRCREV = "e6afb9cbae4064da8c3e69af3ff5c4629579c1d2"

SRC_URI = "git://github.com/nothings/stb.git;branch=${BRANCH}"

S = "${WORKDIR}/git"

do_install() {
    install -d ${D}${includedir}
    for hdr in ${S}/*.h
    do
        install -m 0644 $hdr ${D}${includedir}
    done
}

PACKAGES = "${PN}"
FILES_${PN} += "${includedir}"
