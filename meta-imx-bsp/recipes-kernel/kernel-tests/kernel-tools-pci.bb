# Copyright 2025 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Kernel test PCI tools for Linux"
DESCRIPTION = "Kernel test PCI tools for Linux"
LICENSE = "GPL-2.0-only"

require kernel-tools.inc

KERNEL_PCITEST_SRC = "tools/testing/selftests"

KERNEL_TOOLS_SRC:append = " ${KERNEL_PCITEST_SRC}"

DEPENDS:append = " rsync-native"
do_compile() {
    oe_runmake -C ${S}/${KERNEL_PCITEST_SRC} TARGETS="pci_endpoint"
}

do_install() {
    oe_runmake -C ${S}/${KERNEL_PCITEST_SRC} INSTALL_PATH=${D}/${bindir} TARGETS="pci_endpoint" install
    chown root:root  -R ${D}/${bindir}
}

