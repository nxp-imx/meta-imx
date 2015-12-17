DESCRIPTION = "Freescale Image - Adds Qt5"
LICENSE = "MIT"

require recipes-fsl/images/fsl-image-validation-imx.bb

inherit distro_features_check

CONFLICT_DISTRO_FEATURES = "directfb"

X11_IMAGE_INSTALL = "${@base_contains('DISTRO_FEATURES', 'x11', \
    'libxkbcommon', '', d)}"

WLD_IMAGE_INSTALL = "${@base_contains('DISTRO_FEATURES', 'x11', \
                base_contains('DISTRO_FEATURES', 'wayland', 'qtwayland qtwayland-plugins', '', d), \
                  base_contains('DISTRO_FEATURES', 'wayland', 'qtwayland qtwayland-plugins','', d), d)}"

# Install Freescale QT demo applications
MACHINE_QT5_MULTIMEDIA_PLAYER = ""
MACHINE_QT5_MULTIMEDIA_PLAYER_mx6q = "${@base_contains("MACHINE_GSTREAMER_1_0_PLUGIN", "gst1.0-fsl-plugin", "fslqtapplications", "", d)}"
MACHINE_QT5_MULTIMEDIA_PLAYER_mx6dl = "${@base_contains("MACHINE_GSTREAMER_1_0_PLUGIN", "gst1.0-fsl-plugin", "fslqtapplications", "", d)}"
# Install Freescale QT demo applications for X11 backend only
MACHINE_QT5_MULTIMEDIA_APPS = "${@base_contains('DISTRO_FEATURES', 'x11', base_contains('DISTRO_FEATURES', 'wayland', \
                                 '', '${MACHINE_QT5_MULTIMEDIA_PLAYER}', d), '', d)}"
QT5_IMAGE_INSTALL = ""
QT5_IMAGE_INSTALL_common = " \
    packagegroup-qt5-toolchain-target \
    packagegroup-qt5-demos \
    ${X11_IMAGE_INSTALL} \
    ${WLD_IMAGE_INSTALL} \
    ${MACHINE_QT5_MULTIMEDIA_APPS} \
    "
QT5_IMAGE_INSTALL_mx6 = " \
    ${QT5_IMAGE_INSTALL_common} \
    "
QT5_IMAGE_INSTALL_mx6sl = "${@base_contains('DISTRO_FEATURES', 'x11','${QT5_IMAGE_INSTALL_common}', \
    'qtbase qtbase-fonts qtbase-plugins', d)}"

QT5_IMAGE_INSTALL_remove = " packagegroup-qt5-webengine"

IMAGE_INSTALL += " \
${QT5_IMAGE_INSTALL} \
"
#export IMAGE_BASENAME = "fsl-image-qt5"

# Add packagegroup-qt5-webengine to QT5_IMAGE_INSTALL_mx6 if qtwebengine needs to installed to rootfs
