require recipes-core/images/core-image-minimal-mtdutils.bb

inherit image_types_fsl

DESCRIPTION = "Small image capable of booting a device with support for the \
Minimal MTD Utilities, which let the user interact with the MTD subsystem in \
the kernel to perform operations on flash devices."

IMAGE_INSTALL += "coreutils procps imx-uuc bash util-linux udev udev-extraconf-mfgtool dosfstools"
IMAGE_INSTALL += "imx-kobs mtd-utils mtd-utils-ubifs"
IMAGE_INSTALL += "e2fsprogs e2fsprogs-e2fsck e2fsprogs-mke2fs"

IMAGE_FSTYPES = "${INITRAMFS_FSTYPES} ext3"

export IMAGE_BASENAME = "fsl-image-manufacturing"
