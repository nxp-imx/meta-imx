SUMMARY = "single-file public domain libraries for C/C++"
SECTION = "libs"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    git://github.com/nothings/stb;protocol=https \
"
SRCREV = "e6afb9cbae4064da8c3e69af3ff5c4629579c1d2"
S = "${WORKDIR}/git"

do_install () {
    install -d ${D}${includedir}
    cp -r ${S}/stb_dxt.h ${D}${includedir}
    cp -r ${S}/stb_image.h ${D}${includedir}
    cp -r ${S}/stb_image_resize.h ${D}${includedir}
    cp -r ${S}/stb_image_write.h ${D}${includedir}
}
