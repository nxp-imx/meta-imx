DESCRIPTION = "Kernel module for dpdk"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${S}/../LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit module

DPDK_EXTRAS_SRC ?= "git://github.com/nxp-qoriq/dpdk-extras.git;protocol=https"
SRC_URI = "${DPDK_EXTRAS_SRC};nobranch=1"
SRCREV = "c84c5a8bfe30dadcaded73d048095b511c2f8935"

S = "${WORKDIR}/git/linux"

EXTRA_OEMAKE += " -C ${STAGING_KERNEL_BUILDDIR} M=${S}"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx8-nxp-bsp|mx9-nxp-bsp)"

