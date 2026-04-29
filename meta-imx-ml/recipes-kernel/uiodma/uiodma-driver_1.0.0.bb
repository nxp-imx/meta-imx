SUMMARY = "arasdk-module"
DESCRIPTION = "Builds the uiodma kernel module for the ARA SDK against the custom Linux kernel"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

inherit module

SRC_URI = "git://github.com/nxp-imx-support/uiodma-driver.git;branch=main;protocol=https"
SRCREV = "ba17c6a82dd98d74abc434291059c5d27a96ea96"

S = "${UNPACKDIR}/${BPN}-${PV}/uiodma_cache_management"

DEPENDS += "virtual/kernel"

# Suppress incompatible-pointer-types errors (kernel API changed in 6.x)
EXTRA_OEMAKE += "ccflags-y='-Wno-error=incompatible-pointer-types -Wno-error=missing-prototypes'"

# CRITICAL: Prevent Yocto from stripping the kernel module
# Stripping corrupts kernel modules when installed to non-standard paths
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

do_install:append() {
    install -d ${D}/usr/share/rt-sdk-ara240/driver/
    install -m 0644 ${B}/uiodma.ko ${D}/usr/share/rt-sdk-ara240/driver/
}

FILES:${PN} += " \
    /usr/share/rt-sdk-ara240/driver/uiodma.ko \
"
