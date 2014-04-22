DESCRIPTION = "Freescale Image - Adds Qt5"
LICENSE = "MIT"

require recipes-fsl/images/fsl-image-gui.bb

IMAGE_INSTALL += " \
    packagegroup-qt5-core \
    packagegroup-qt5-qtdeclarative \
    packagegroup-qt5-qtdeclarative-qml \
    packagegroup-qt5-demos \
    libxkbcommon \
"

export IMAGE_BASENAME = "fsl-image-qt5"


