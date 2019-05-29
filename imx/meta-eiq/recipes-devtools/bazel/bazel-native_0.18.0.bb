DESCRIPTION = "Bazel build and test tool"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI[md5sum] = "1c61644d37ed4496c73698180dfbcd68"
SRC_URI[sha256sum] = "d0e86d2f7881ec8742a9823a986017452d2da0dfe4e989111da787cb89257155"

SRC_URI = " https://github.com/bazelbuild/bazel/releases/download/${PV}/bazel-${PV}-dist.zip "

inherit native

S = "${WORKDIR}"

INHIBIT_SYSROOT_STRIP = "1"

do_compile () {
    export JAVA_HOME="${bindir}/openjdk-1.8-native/"
    ./compile.sh
}

do_install () {
        install -d ${D}${bindir}
        cp -Rf \
        ${S}/output/* \
        ${D}${bindir}
}

DEPENDS += "openjdk-8-native"
RDEPENDS_${PN}-native += "openjdk-8-native"
