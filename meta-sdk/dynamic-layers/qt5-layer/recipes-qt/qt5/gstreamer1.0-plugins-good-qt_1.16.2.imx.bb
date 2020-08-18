require recipes-multimedia/gstreamer/gstreamer1.0-plugins-good_1.16.2.bb

FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/meta-imx/meta-sdk/dynamic-layers/qt5-layer/recipes-qt/qt5/${PN}:"
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"

DEPENDS += "gstreamer1.0-plugins-base virtual/kernel libcap zlib bzip2 \
            ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'qtwayland', '', d)} \
"

GST1.0-PLUGINS-GOOD_SRC ?= "gitsm://source.codeaurora.org/external/imx/gst-plugins-good.git;protocol=https"
SRCBRANCH = "MM_04.05.06_2008_L5.4.47"

SRC_URI = " \
    ${GST1.0-PLUGINS-GOOD_SRC};branch=${SRCBRANCH} \
    file://0001-configure.ac-Add-prefix-to-correct-the-QT_PATH.patch \
"
SRCREV = "a1ba15d53aab342dd921261148562f47eeed7d98" 

S = "${WORKDIR}/git"

# Make sure kernel sources are available
do_configure[depends] += "virtual/kernel:do_shared_workdir"

PACKAGECONFIG += "qt5"
PACKAGECONFIG[qt5] = '--enable-qt \
                      --with-moc="${STAGING_DIR_NATIVE}/usr/bin/moc" \
                      --with-uic="${STAGING_DIR_NATIVE}/usr/bin/uic" \
                      --with-rcc="${STAGING_DIR_NATIVE}/usr/bin/rcc" \
                     ,--disable-qt,qtbase qtdeclarative qtbase-native qtx11extras'

# Qt5 configuratin only support "--disable-qt"
# And in default, it is disabled, need to remove the default setting to enable it.
# Fix: unrecognised options: --disable-sunaudio [unknown-configure-option]
EXTRA_OECONF_remove = "--disable-qt \
                       --disable-sdl --disable-nas --disable-libvisual --disable-xvid --disable-mimic \
                       --disable-pvr --disable-sdltest --disable-wininet --disable-timidity \
                       --disable-linsys --disable-sndio --disable-apexsink \
                       --disable-sunaudio \
"

# The QT_PATH & QT_HOST_PATH which help to access to moc uic rcc tools are incorrect,
# need to passing STAGING_DIR to update the QT PATH
EXTRA_OECONF += "STAGING_DIR=${STAGING_DIR_NATIVE}"

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

# Need qtsink for SoCs that have hardware GPU3D
COMPATIBLE_MACHINE = "(mx6sx|mx6dl|mx6q|mx7ulp|mx8)"
