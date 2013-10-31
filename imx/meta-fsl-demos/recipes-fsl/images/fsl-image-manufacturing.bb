require recipes-core/images/core-image-minimal-mtdutils.bb

inherit image_types_fsl

DESCRIPTION = "Small image capable of booting a device with support for the \
Minimal MTD Utilities, which let the user interact with the MTD subsystem in \
the kernel to perform operations on flash devices."

IMAGE_INSTALL += "busybox procps imx-uuc bash util-linux e2fsprogs-mke2fs udev udev-extraconf-mfgtool dosfstools"
IMAGE_INSTALL += "imx-kobs"

IMAGE_FSTYPES = "${INITRAMFS_FSTYPES} ext3"

export IMAGE_BASENAME = "fsl-image-manufacturing"
