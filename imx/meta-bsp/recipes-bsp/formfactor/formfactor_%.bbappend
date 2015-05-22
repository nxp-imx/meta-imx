# Append path for freescale to include costom matchconfig
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PACKAGE_ARCH_mx7 = "${MACHINE_ARCH}"
PACKAGE_ARCH_mx6ul = "${MACHINE_ARCH}"
