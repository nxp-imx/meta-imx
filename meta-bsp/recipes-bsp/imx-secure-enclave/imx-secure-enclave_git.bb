require imx-secure-enclave.inc

PLAT = "ele"

FILES:${PN} += "${datadir}/se"
RDEPENDS:${PN} += "bash"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx9-nxp-bsp)"
