require imx-secure-enclave.inc

PLAT = "ele"

FILES:${PN} += "${datadir}/se"
RDEPENDS:${PN} += "bash"
RDEPENDS:${PN}:append:mx95-nxp-bsp = " imx-secure-enclave-seco"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx9-nxp-bsp)"
