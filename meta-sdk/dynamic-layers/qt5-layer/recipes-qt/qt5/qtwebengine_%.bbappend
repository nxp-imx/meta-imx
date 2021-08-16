FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " file://0001-ui_features.gni-Do-not-enable-use_xkbcommon-for-non-.patch;patchdir=src/3rdparty"

PACKAGECONFIG += "examples"
PACKAGECONFIG[examples] = ",,qtsvg"

PARALLEL_MAKEINST = ""
PARALLEL_MAKE:task-install = "${PARALLEL_MAKEINST}"

do_install:append() {
if ls ${D}${libdir}/pkgconfig/Qt5*.pc >/dev/null 2>&1; then
    sed -i 's,-L${STAGING_DIR_HOST}/usr/lib,,' ${D}${libdir}/pkgconfig/Qt5*.pc
fi
}
