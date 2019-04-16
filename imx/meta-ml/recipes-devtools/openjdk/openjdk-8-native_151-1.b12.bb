DESCRIPTION = "Java runtime based upon the OpenJDK Project"
LICENSE = "GPL-2.0-with-classpath-exception"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=6133e6794362eff6641708cfcc075b80"

inherit native

INHIBIT_SYSROOT_STRIP = "1"

SRC_URI[md5sum] = "5573dd4caaebce2167ef4c8b7889915a"
SRC_URI[sha256sum] = "5dccd3d05f489cd6dc5fe645e5f71b3bd29c9f2f8cfac66c6f4d95bba362e639"
SRC_URI = " \
    https://github.com/ojdkbuild/ojdkbuild/releases/download/1.8.0.151-1/java-1.8.0-openjdk-1.8.0.151-1.b12.el6_9.x86_64.zip \
"

S = "${WORKDIR}/java-1.8.0-openjdk-1.8.0.151-1.b12.el6_9.x86_64"

do_install () {
    install -d ${D}${bindir}/openjdk-1.8-native
    cp -Rf \
        ${S}/* \
        ${D}${bindir}/openjdk-1.8-native

    cd ${D}${bindir}
    ln -sf openjdk-1.8-native openjdk-native
    for TOOL in $(cd openjdk-native/bin; ls); do
        ln -sf openjdk-native/bin/${TOOL} ${TOOL}
    done
}
