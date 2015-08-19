require fsl-image-mfgtool.bb

SUMMARY = "Small image to be used for evaluating the Freescale socs"
DESCRIPTION = "Small image which includes some helpful tools and \
Freescale-specific packages. It is much more embedded-oriented \
than fsl-image-full to evaluate the Freescale socs."

LICENSE = "MIT"

IMAGE_INSTALL_append = " \
    packagegroup-fsl-tools-core \
    packagegroup-fsl-benchmark-core \
    packagegroup-fsl-networking-core \
"

export IMAGE_BASENAME = "fsl-image-core"

