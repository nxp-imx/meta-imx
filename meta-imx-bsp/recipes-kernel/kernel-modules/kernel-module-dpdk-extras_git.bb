DESCRIPTION = "Kernel module for dpdk"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${S}/../LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "${DPDK_EXTRAS_SRC};branch=${SRCBRANCH}"
DPDK_EXTRAS_SRC ?= "git://github.com/nxp-qoriq/dpdk-extras.git;protocol=https"
SRCBRANCH = "main"
SRCREV = "a9cc86880da2e0059d5a727eb8fcdabd528d8c4c"

S = "${WORKDIR}/git/linux"

inherit module

EXTRA_OEMAKE += " -C ${STAGING_KERNEL_BUILDDIR} M=${S}"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx8-nxp-bsp|mx9-nxp-bsp)"

