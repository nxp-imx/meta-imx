DESCRIPTION = "A barebones image that contains a small package set to \
boot up. It is intended as a starting point for product development."

LICENSE = "MIT"

require recipes-core/images/core-image-minimal.bb

PACKAGE_ARCH = "${MACHINE_ARCH}"

CORE_IMAGE_EXTRA_INSTALL += "udev-extraconf lsb"

export IMAGE_BASENAME = "fsl-image-minimal"
