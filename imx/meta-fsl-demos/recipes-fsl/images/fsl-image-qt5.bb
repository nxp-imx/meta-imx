DESCRIPTION = "Freescale Image - Adds Qt5"
LICENSE = "MIT"

require recipes-fsl/images/fsl-image-gui.bb

inherit distro_features_check

CONFLICT_DISTRO_FEATURES = "directfb"

X11_IMAGE_INSTALL = "${@base_contains('DISTRO_FEATURES', 'x11', \
    'libxkbcommon', '', d)}"

IMAGE_INSTALL += " \
    packagegroup-qt5-core \
    packagegroup-qt5-qtdeclarative \
    packagegroup-qt5-qtdeclarative-qml \
    packagegroup-qt5-demos \
    ${X11_IMAGE_INSTALL} \
    "

export IMAGE_BASENAME = "fsl-image-qt5"


