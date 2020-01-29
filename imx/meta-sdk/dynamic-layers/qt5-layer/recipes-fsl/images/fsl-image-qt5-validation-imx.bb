DESCRIPTION = "NXP Image - Adds Qt5"
LICENSE = "MIT"

require recipes-fsl/images/imx-image-full.bb

inherit ${@bb.utils.contains('BBFILE_COLLECTIONS', 'qt5-layer', 'populate_sdk_qt5', '', d)}

IMAGE_INSTALL += " \
    packagegroup-qt5-imx \
"
