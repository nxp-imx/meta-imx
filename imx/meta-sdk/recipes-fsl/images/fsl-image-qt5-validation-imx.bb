DESCRIPTION = "Freescale Image - Adds Qt5"
LICENSE = "MIT"

require recipes-fsl/images/fsl-image-validation-imx.bb

inherit distro_features_check

CONFLICT_DISTRO_FEATURES = "directfb"

# Install Freescale QT demo applications
QT5_IMAGE_INSTALL_APPS = ""
QT5_IMAGE_INSTALL_APPS_mx6q = "${@bb.utils.contains("MACHINE_GSTREAMER_1_0_PLUGIN", "imx-gst1.0-plugin", "imx-qtapplications", "", d)}"
QT5_IMAGE_INSTALL_APPS_mx6dl = "${@bb.utils.contains("MACHINE_GSTREAMER_1_0_PLUGIN", "imx-gst1.0-plugin", "imx-qtapplications", "", d)}"

# Install Freescale QT demo applications for X11 backend only
MACHINE_QT5_MULTIMEDIA_APPS = ""
QT5_IMAGE_INSTALL = ""
QT5_IMAGE_INSTALL_common = " \
    packagegroup-qt5-toolchain-target \
    packagegroup-qt5-demos \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'libxkbcommon', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'qtwayland qtwayland-plugins', \  
       bb.utils.contains('DISTRO_FEATURES',     'x11', '${QT5_IMAGE_INSTALL_APPS}', \
                                                       '', d), d)} \
    "
QT5_IMAGE_INSTALL_mx6 = " \
    ${QT5_IMAGE_INSTALL_common} \
    gstreamer1.0-plugins-bad-qt \
    "
QT5_IMAGE_INSTALL_mx6sl = "${@bb.utils.contains('DISTRO_FEATURES', 'x11','${QT5_IMAGE_INSTALL_common}', \
    'qtbase qtbase-fonts qtbase-plugins', d)}"

QT5_IMAGE_INSTALL_mx6ul = "${@bb.utils.contains('DISTRO_FEATURES', 'x11','${QT5_IMAGE_INSTALL_common}', \
    'qtbase qtbase-examples qtbase-fonts qtbase-plugins', d)}"

QT5_IMAGE_INSTALL_mx7 = "${@bb.utils.contains('DISTRO_FEATURES', 'x11','${QT5_IMAGE_INSTALL_common}', \
    'qtbase qtbase-examples qtbase-fonts qtbase-plugins', d)}"

QT5_IMAGE_INSTALL_mx8 = " \
    ${QT5_IMAGE_INSTALL_common} \
    gstreamer1.0-plugins-bad-qt \
    "
# Add packagegroup-qt5-webengine to QT5_IMAGE_INSTALL_mx6 and comment out the line below to install qtwebengine to the rootfs.
QT5_IMAGE_INSTALL_remove = " packagegroup-qt5-webengine"

IMAGE_INSTALL += " \
${QT5_IMAGE_INSTALL} \
"
