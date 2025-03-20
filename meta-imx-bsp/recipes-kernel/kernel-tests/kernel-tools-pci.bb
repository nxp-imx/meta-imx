# Copyright 2025 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Kernel test PCI tools for Linux"
DESCRIPTION = "Kernel test PCI tools for Linux"
LICENSE = "GPL-2.0-only"

require kernel-tools.inc

KERNEL_PCITEST_SRC = "tools/pci"

KERNEL_TOOLS_SRC:append = " ${KERNEL_PCITEST_SRC}"

do_compile() {
    unset CFLAGS
    oe_runmake -C ${S}/${KERNEL_PCITEST_SRC}
}

do_install() {
    unset CFLAGS
    oe_runmake -C ${S}/${KERNEL_PCITEST_SRC} install
}

