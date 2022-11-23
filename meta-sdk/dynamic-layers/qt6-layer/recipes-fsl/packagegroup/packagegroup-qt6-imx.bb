# Copyright 2019-20 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Package group for i.MX Qt6"
LICENSE = "MIT"

PACKAGE_ARCH = "${TUNE_PKGARCH}"

inherit packagegroup

RDEPENDS:${PN} = "${QT6_IMAGE_INSTALL}"

QT6_IMAGE_INSTALL          = ""
QT6_IMAGE_INSTALL:imxpxp   = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', '${QT6_IMAGE_INSTALL_COMMON}', \
                                                   'qtbase qtbase-plugins', d)}"
QT6_IMAGE_INSTALL:imxgpu2d = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', '${QT6_IMAGE_INSTALL_COMMON}', \
                                                   'qtbase qtbase-plugins', d)}"
QT6_IMAGE_INSTALL:imxgpu3d = " \
    ${QT6_IMAGE_INSTALL_COMMON}"

QT6_IMAGE_INSTALL_COMMON = " \
    packagegroup-qt6-demos \
    ${QT6_IMAGE_INSTALL_APPS} \
    ${QT6_IMAGE_INSTALL_FONTS} \
    ${QT6_IMAGE_INSTALL_QUICK3D} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11',     'libxkbcommon', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'nxp-demo-experience', '', d)}\
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'qtwayland qtwayland-plugins', '', d)}"

QT6_IMAGE_INSTALL_APPS = ""
#QT6_IMAGE_INSTALL_APPS:imxgpu3d = "${@bb.utils.contains("MACHINE_GSTREAMER_1_0_PLUGIN", "imx-gst1.0-plugin", "imx-qtapplications", "", d)}"


QT6_IMAGE_INSTALL_FONTS = "ttf-dejavu-common ttf-dejavu-sans ttf-dejavu-sans-mono ttf-dejavu-serif "

QT6_IMAGE_INSTALL_QUICK3D = "qtquick3d qtquick3d-dev qtquick3d-examples"

