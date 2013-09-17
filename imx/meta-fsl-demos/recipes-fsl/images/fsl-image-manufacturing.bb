require recipes-core/images/core-image-minimal.bb

DESCRIPTION = "Small image capable of booting a device with support for the \
Minimal MTD Utilities, which let the user interact with the MTD subsystem in \
the kernel to perform operations on flash devices."

IMAGE_INSTALL += "busybox mtd-utils procps imx-uuc bash"

IMAGE_FSTYPES = "${INITRAMFS_FSTYPES} ext3"

export IMAGE_BASENAME = "fsl-image-manufacturing"
