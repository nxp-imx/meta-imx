require imx-secure-enclave.inc

inherit systemd

SYSTEMD_AUTO_ENABLE = "disable"
SYSTEMD_SERVICE:${PN} = "nvm_daemon.service"

PLAT = "ele"

RDEPENDS:${PN} += "bash"
RDEPENDS:${PN}:append:mx95-nxp-bsp = " imx-secure-enclave-seco"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx9-nxp-bsp)"
