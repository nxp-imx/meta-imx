DESCRIPTION = "Kernel module for dpdk"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${S}/../../LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit module

DPDK_EXTRAS_SRC ?= "git://github.com/nxp-qoriq/dpdk-extras.git;protocol=https"
SRC_URI = "${DPDK_EXTRAS_SRC};nobranch=1"
SRCREV = "e53931e22a15858c5469f9cb0b631f40c3ec8db3"

S = "${WORKDIR}/git/linux/kpage_ncache"
EXTRA_OEMAKE += "-C ${STAGING_KERNEL_BUILDDIR} M=${S}"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx8-nxp-bsp|mx9-nxp-bsp)"
