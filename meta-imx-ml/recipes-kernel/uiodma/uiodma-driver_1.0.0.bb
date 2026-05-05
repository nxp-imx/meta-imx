SUMMARY = "Linux kernel driver providing userspace I/O (UIO) access to DMA-capable memory regions."
DESCRIPTION = "Builds the uiodma kernel module for the ARA SDK against the custom Linux kernel"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "git://github.com/nxp-imx-support/uiodma-driver.git;branch=main;protocol=https"
SRCREV = "ba17c6a82dd98d74abc434291059c5d27a96ea96"

S = "${UNPACKDIR}/${BPN}-${PV}/uiodma_cache_management"

inherit module

# Suppress incompatible-pointer-types errors (kernel API changed in 6.x)
EXTRA_OEMAKE += "ccflags-y='-Wno-error=incompatible-pointer-types -Wno-error=missing-prototypes'"
do_install() {
    # Install to standard kernel module location
    install -d ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/extra
    install -m 0644 ${B}/uiodma.ko ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/extra/
}

FILES:${PN} = "${nonarch_base_libdir}/modules/${KERNEL_VERSION}/extra/uiodma.ko"

