require imx-secure-enclave.inc

SUMMARY += "SECO"
DESCRIPTION += "SECO"

PLAT = "seco"

do_install:append() {
    # Remove common content that is to be installed by imx-secure-enclave
    rm -rf ${D}${bindir}
    rm -rf ${D}${datadir}
    rm -rf ${D}${sysconfdir}
}

COMPATIBLE_MACHINE = "(mx95-nxp-bsp)"
