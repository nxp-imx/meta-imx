include recipes-multimedia/gstreamer/gstreamer1.0-plugins-bad.inc
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/meta-fsl-bsp-release/imx/meta-sdk/recipes-qt5/qt5/${PN}:"

# Add extra patch directory to find needed patch
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/meta-fsl-mpu-internal/meta-next/recipes-qt5/qt5/${PN}:"

LIC_FILES_CHKSUM = "file://COPYING;md5=73a5855a8119deb017f5f13cf327095d \
                    file://COPYING.LIB;md5=21682e4e8fea52413fd26c60acb907e5 \
"
SRC_URI[md5sum] = "5683f0ea91f9e1e0613b0f6f729980a7"
SRC_URI[sha256sum] = "9c2c7edde4f59d74eb414e0701c55131f562e5c605a3ce9b091754f106c09e37"

#qt5 configuratin only support "--disable-qt"
#and in default, it is disabled, need to remove the default setting to enable it.
EXTRA_OECONF_remove = "--disable-qt \
                       --disable-sdl --disable-nas --disable-libvisual --disable-xvid --disable-mimic \
                       --disable-pvr --disable-sdltest --disable-wininet --disable-timidity \
                       --disable-linsys --disable-sndio --disable-apexsink \
"

# The QT_PATH & QT_HOST_PATH which help to access to moc uic rcc tools are incorrect,
# need to passing STAGING_DIR to update the QT PATH
EXTRA_OECONF += "STAGING_DIR=${STAGING_DIR_NATIVE} --disable-introspection"

# Need libdrm_fourcc.h for DMA buf support in opengl plugins
DEPENDS_append_mx7ulp = " libdrm"
DEPENDS_append_mx8 = " libdrm"

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
    file://0001-configure.ac-Add-prefix-to-correct-the-QT_PATH.patch \
    file://0002-Fix-for-gl-plugin-not-built-in-wayland-backend.patch \
    file://0003-qml-add-EGL-platform-support-for-x11-backend.patch \
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

S = "${WORKDIR}/gst-plugins-bad-1.12.2"

INSANE_SKIP_gstreamer1.0-plugins-bad-qt-qmlgl += "build-deps"

# Need qtsink for SoCs that have hardware GPU3D
COMPATIBLE_MACHINE = "(mx6sx|mx6dl|mx6q|mx7ulp|mx8)"
