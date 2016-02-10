DESCRIPTION = "Freescale Image - Adds Qt5"
LICENSE = "MIT"

require recipes-fsl/images/fsl-image-qt5-validation-imx.bb

export IMAGE_BASENAME = "fsl-image-qt5"

# Add packagegroup-qt5-webengine to QT5_IMAGE_INSTALL_mx6 if qtwebengine needs to installed to rootfs
