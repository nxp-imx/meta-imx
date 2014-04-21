DESCRIPTION = "Freescale Image - Adds Qt5"
LICENSE = "MIT"

require recipes-fsl/images/fsl-image-gui.bb

IMAGE_INSTALL += " \
    packagegroup-fsl-qt5-core \
    packagegroup-fsl-qt5-qtdeclarative \
    packagegroup-fsl-qt5-demos \
"

export IMAGE_BASENAME = "fsl-image-qt5"


