DESCRIPTION = "Kernel module for dpdk"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "${DPDK_EXTRAS_SRC};branch=${SRCBRANCH}"
DPDK_EXTRAS_SRC ?= "git://github.com/nxp-qoriq/dpdk-extras.git;protocol=https"
SRCBRANCH = "main"
SRCREV = "8ccef82e082d88122e27c3be30a9a0ffc2d96552"

inherit module

B = "${S}/linux"

EXTRA_OEMAKE += " -C ${STAGING_KERNEL_BUILDDIR} M=${B}"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx8-nxp-bsp|mx9-nxp-bsp)"
