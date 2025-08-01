SUMMARY = "Initramfs for NXP CRRM"
DESCRIPTION = "Initramfs designed for NXP Cyber Resilient Recovery Module support"
LICENSE = "MIT"

INITRAMFS_SCRIPTS ?= "initramfs-framework-base initramfs-module-udev"

PACKAGE_INSTALL = " \
    ${INITRAMFS_SCRIPTS} \
    base-passwd \
    bash \
    busybox \
    firmware-ele-imx \
    imx-secure-enclave-crrm \
    imx-uuc \
    libssl \
"

# Ensure the initramfs only contains the bare minimum
IMAGE_FEATURES = ""
IMAGE_LINGUAS = ""

# Don't allow the initramfs to contain a kernel
PACKAGE_EXCLUDE = "kernel-image-*"

IMAGE_FSTYPES = "cpio.zst.u-boot"
IMAGE_NAME_SUFFIX ?= ""
IMAGE_ROOTFS_SIZE = "8192"
IMAGE_ROOTFS_EXTRA_SPACE = "0"

inherit image
