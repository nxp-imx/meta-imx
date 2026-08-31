
SRCBRANCH = "lf-6.18.37_2.1.0"
SRCREV = "eb3856c7d1a761cf613ee859c6529a1b06254d7d"

do_install:append() {
    install -d ${D}${bindir}
    for bin in ${S}/npu_utils/*; do
        [ -f "$bin" ] || continue
        install -m 0755 "$bin" ${D}${bindir}/
    done
}

PACKAGES =+ "${PN}-npu-utils"

FILES:${PN}-npu-utils = "${bindir}/neutron_* ${bindir}/npu_*"

RDEPENDS:${PN}-npu-utils = "bash python3 python3-numpy"

COMPATIBLE_MACHINE = "(mx93-nxp-bsp|mx95-nxp-bsp|mx943-nxp-bsp|mx952-nxp-bsp)"
