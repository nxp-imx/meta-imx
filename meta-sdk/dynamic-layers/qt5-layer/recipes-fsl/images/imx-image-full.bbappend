# Install qt5 packages

inherit ${@bb.utils.contains('BBFILE_COLLECTIONS', 'qt5-layer', 'populate_sdk_qt5', '', d)}

IMAGE_INSTALL += " \
    packagegroup-qt5-imx \
"
