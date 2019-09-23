DESCRIPTION = "NXP Image - Adds Qt5"
LICENSE = "MIT"

require recipes-fsl/images/imx-image-full.bb

IMAGE_INSTALL += " \
    packagegroup-qt5-imx \
"
