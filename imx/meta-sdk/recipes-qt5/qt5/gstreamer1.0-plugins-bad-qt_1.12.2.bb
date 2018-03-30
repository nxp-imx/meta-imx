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
PACKAGECONFIG[qt5] = '--enable-qt \
                      --with-moc="${STAGING_DIR_NATIVE}/usr/bin/qt5/moc" \
                      --with-uic="${STAGING_DIR_NATIVE}/usr/bin/qt5/uic" \
                      --with-rcc="${STAGING_DIR_NATIVE}/usr/bin/qt5/rcc" \
                     ,--disable-qt,qtbase qtdeclarative qtbase-native'

# Use i.MX fork of GST for customizations
GST1.0-PLUGINS-BAD_SRC ?= "gitsm://source.codeaurora.org/external/imx/gst-plugins-bad.git;protocol=https"
SRCBRANCH = "MM_04.03.05_1804_L4.9.88_MX7ULP_GA"

SRC_URI = " \
    ${GST1.0-PLUGINS-BAD_SRC};branch=${SRCBRANCH} \
    file://configure-allow-to-disable-libssh2.patch \
    file://0001-configure.ac-Add-prefix-to-correct-the-QT_PATH.patch \
"
SRCREV = "3bf09ef9cda8220b53459b45fe5384a99a7b1c6b"

# This remove "--exclude=autopoint" option from autoreconf argument to avoid
# configure.ac:30: error: required file './ABOUT-NLS' not found
EXTRA_AUTORECONF = ""

# remove the duplicate libs except qtsink
do_install_append() {
    rm -rf ${D}/usr
    if [ -e ${WORKDIR}/build/ext/qt/.libs/libgstqmlgl.so ]; then
        mkdir -p ${D}${libdir}/gstreamer-1.0/
        install -m 0755 ${WORKDIR}/build/ext/qt/.libs/libgstqmlgl.so ${D}${libdir}/gstreamer-1.0/
        install -m 0755 ${WORKDIR}/build/ext/qt/.libs/libgstqmlgl.lai ${D}${libdir}/gstreamer-1.0/libgstqmlgl.la
    fi
}

S = "${WORKDIR}/git"

INSANE_SKIP_gstreamer1.0-plugins-bad-qt-qmlgl += "build-deps file-rdeps"

# Need qtsink for SoCs that have hardware GPU3D
COMPATIBLE_MACHINE = "(mx6sx|mx6dl|mx6q|mx7ulp|mx8)"
