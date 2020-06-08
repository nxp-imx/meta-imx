FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0001-ui_features.gni-Do-not-enable-use_xkbcommon-for-non-.patch;patchdir=src/3rdparty"

PACKAGECONFIG += "examples"
PACKAGECONFIG[examples] = ",,qtsvg"

PARALLEL_MAKEINST = ""
PARALLEL_MAKE_task-install = "${PARALLEL_MAKEINST}"

do_install_append() {
if ls ${D}${libdir}/pkgconfig/Qt5*.pc >/dev/null 2>&1; then
    sed -i 's,-L${STAGING_DIR_HOST}/usr/lib,,' ${D}${libdir}/pkgconfig/Qt5*.pc
fi
}
