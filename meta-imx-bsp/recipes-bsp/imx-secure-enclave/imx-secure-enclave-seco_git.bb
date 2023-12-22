require imx-secure-enclave.inc

SUMMARY += "SECO"
DESCRIPTION += "SECO"

PLAT = "seco"

do_install:append() {
    # Remove common content that is to be installed by imx-secure-enclave
    for i in common hsm nvm.h; do
        rm -rf ${D}${includedir}/$i
    done
    rm ${D}${datadir}/se/README
}

COMPATIBLE_MACHINE = "(mx95-nxp-bsp)"
