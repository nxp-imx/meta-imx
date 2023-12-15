require imx-secure-enclave.inc

SUMMARY += "SECO"
DESCRIPTION += "SECO"

PLAT = "seco"

FILES:${PN} += "${datadir}/se"

COMPATIBLE_MACHINE = "(mx95-nxp-bsp)"
