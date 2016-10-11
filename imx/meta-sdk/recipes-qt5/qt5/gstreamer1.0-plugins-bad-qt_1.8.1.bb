include recipes-multimedia/gstreamer/gstreamer1.0-plugins-bad.inc
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# Add extra patch directory to find needed patch
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/gstreamer1.0-plugins-bad:"

LIC_FILES_CHKSUM = "file://COPYING;md5=73a5855a8119deb017f5f13cf327095d \
                    file://COPYING.LIB;md5=21682e4e8fea52413fd26c60acb907e5 \
                    file://gst/tta/crc32.h;beginline=12;endline=29;md5=27db269c575d1e5317fffca2d33b3b50 \
                    file://gst/tta/filters.h;beginline=12;endline=29;md5=8a08270656f2f8ad7bb3655b83138e5a"

SRC_URI[md5sum] = "e508da2a8a5c3d12264fe3415be2f451"
SRC_URI[sha256sum] = "0bbd58f363734fc0c4a620b2d6fb01d427fdafdbda7b90b4e15d03b751ca40f5"

#qt5 configuratin only support "--disable-qt"
#and in default, it is disabled, need to remove the default setting to enable it.
EXTRA_OECONF_remove = "--disable-qt"

# The QT_PATH & QT_HOST_PATH which help to access to moc uic rcc tools are incorrect,
# need to passing STAGING_DIR to update the QT PATH
EXTRA_OECONF += "STAGING_DIR=${STAGING_DIR_NATIVE}"

PACKAGECONFIG_mx6q += "qt5"
PACKAGECONFIG_mx6dl += "qt5"
PACKAGECONFIG_mx6sx += "qt5"
PACKAGECONFIG_mx8 += "qt5"

PACKAGECONFIG_mx6q += " ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', '', d)} "
PACKAGECONFIG_mx6dl += " ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', '', d)} "
PACKAGECONFIG_mx6sx += " ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', '', d)} "
PACKAGECONFIG_mx8 += " ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', '', d)} "

PACKAGECONFIG_mx6q += "${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'gles2', '', d)}"
PACKAGECONFIG_mx6dl += "${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'gles2', '', d)}"
PACKAGECONFIG_mx6sx += "${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'gles2', '', d)}"
PACKAGECONFIG_mx8 += "${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'gles2', '', d)}"

#revert poky fido commit:cdc2c8aeaa96b07dfc431a4cf0bf51ef7f8802a3: move EGL to Wayland
PACKAGECONFIG[gles2]   = "--enable-gles2 --enable-egl,--disable-gles2 --disable-egl,virtual/libgles2 virtual/egl"
PACKAGECONFIG[wayland] = "--enable-wayland --disable-x11,--disable-wayland,wayland qtwayland"
PACKAGECONFIG[qt5] = ",--disable-qt,qtbase qtdeclarative qtx11extras"

SRC_URI = " \
    http://gstreamer.freedesktop.org/src/gst-plugins-bad/gst-plugins-bad-${PV}.tar.xz \
    file://0001-gst-plugins-bad-fix-moc-uic-rcc-incorrect-dir.patch \
    file://0004-qmlglsink-check-qt_context_-first-in-Gst.patch \
"

GPU_PATCHES = " file://0001-MMFMWK-6990-Support-fb-backend-in-qmlglsink.patch \
                file://0008-Fix-for-gl-plugin-not-built-in-wayland-backend.patch \
                file://0009-glplugin-Support-fb-backend-for-gl-plugins.patch \
                file://0010-qtglplugin-qmlgisink-Add-Wayland-support.patch \
                file://0002-qt-implement-qmlglsrc-for-qml-view-grab.patch \
                file://0003-qmlglplugin-Add-i.mx-specific-code.patch \
"

SRC_URI_append_mx6 = "${GPU_PATCHES}"
SRC_URI_remove_mx6sl = "${GPU_PATCHES}"
SRC_URI_append_mx8 = "${GPU_PATCHES}"

# remove the duplicate libs except qtsink
do_install_append() {
    rm -rf ${D}/usr
    if [ -e ${WORKDIR}/build/ext/qt/.libs/libgstqmlgl.so ]; then
        mkdir -p ${D}${libdir}/gstreamer-1.0/
        install -m 0755 ${WORKDIR}/build/ext/qt/.libs/libgstqmlgl.so ${D}${libdir}/gstreamer-1.0/
        install -m 0755 ${WORKDIR}/build/ext/qt/.libs/libgstqmlgl.lai ${D}${libdir}/gstreamer-1.0/libgstqmlgl.la
    fi
}

S = "${WORKDIR}/gst-plugins-bad-1.8.1"

# Need qtsink for SoCs that have hardware GPU3D
COMPATIBLE_MACHINE = "(mx6sx|mx6dl|mx6q|mx8)"
