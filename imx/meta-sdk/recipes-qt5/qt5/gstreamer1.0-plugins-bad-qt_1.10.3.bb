include recipes-multimedia/gstreamer/gstreamer1.0-plugins-bad.inc
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# Add extra patch directory to find needed patch
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"

LIC_FILES_CHKSUM = "file://COPYING;md5=73a5855a8119deb017f5f13cf327095d \
                    file://COPYING.LIB;md5=21682e4e8fea52413fd26c60acb907e5 \
                    file://gst/tta/crc32.h;beginline=12;endline=29;md5=27db269c575d1e5317fffca2d33b3b50 \
                    file://gst/tta/filters.h;beginline=12;endline=29;md5=8a08270656f2f8ad7bb3655b83138e5a"

SRC_URI[md5sum] = "e59798c86a670041de2e61856ea43d2a"
SRC_URI[sha256sum] = "24099351fb6984c9e7560de06e072ff2e33d0b2db38b8fcc7afefb536e5094e7"

#qt5 configuratin only support "--disable-qt"
#and in default, it is disabled, need to remove the default setting to enable it.
EXTRA_OECONF_remove = "--disable-qt"

# The QT_PATH & QT_HOST_PATH which help to access to moc uic rcc tools are incorrect,
# need to passing STAGING_DIR to update the QT PATH
EXTRA_OECONF += "STAGING_DIR=${STAGING_DIR_NATIVE}"

PACKAGECONFIG += "qt5"

PACKAGECONFIG += " ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', '', d)} "

PACKAGECONFIG += "${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'gles2', '', d)}"

#revert poky fido commit:cdc2c8aeaa96b07dfc431a4cf0bf51ef7f8802a3: move EGL to Wayland
PACKAGECONFIG[gles2]   = "--enable-gles2 --enable-egl,--disable-gles2 --disable-egl,virtual/libgles2 virtual/egl"
PACKAGECONFIG[wayland] = "--disable-wayland --disable-x11,--disable-wayland,wayland qtwayland"
PACKAGECONFIG[qt5] = ",--disable-qt,qtbase qtdeclarative qtx11extras"

SRC_URI = " \
    http://gstreamer.freedesktop.org/src/gst-plugins-bad/gst-plugins-bad-${PV}.tar.xz \
    file://configure-allow-to-disable-libssh2.patch \
    file://0001-gst-plugins-bad-fix-moc-uic-rcc-incorrect-dir.patch \
    file://0002-Fix-for-gl-plugin-not-built-in-wayland-backend.patch \
    file://0003-Support-fb-backend-for-gl-plugins.patch \
    file://0004-qmlglplugin-Add-i.mx-specific-code.patch \
    file://0005-qmlglsrc-some-enhancements-for-qmlglsrc.patch \
    file://0006-Make-qmlglsrc-be-compatible-with-GLES2.0.patch \
"

# remove the duplicate libs except qtsink
do_install_append() {
    rm -rf ${D}/usr
    if [ -e ${WORKDIR}/build/ext/qt/.libs/libgstqmlgl.so ]; then
        mkdir -p ${D}${libdir}/gstreamer-1.0/
        install -m 0755 ${WORKDIR}/build/ext/qt/.libs/libgstqmlgl.so ${D}${libdir}/gstreamer-1.0/
        install -m 0755 ${WORKDIR}/build/ext/qt/.libs/libgstqmlgl.lai ${D}${libdir}/gstreamer-1.0/libgstqmlgl.la
    fi
}

S = "${WORKDIR}/gst-plugins-bad-1.10.3"

INSANE_SKIP_gstreamer1.0-plugins-bad-qt-qmlgl += "build-deps"

# Need qtsink for SoCs that have hardware GPU3D
COMPATIBLE_MACHINE = "(mx6sx|mx6dl|mx6q|mx7ulp|mx8)"
