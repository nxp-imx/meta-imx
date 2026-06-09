
SRCBRANCH = "lf-6.18.20_2.0.0"
SRCREV = "67cce2905b4343fd9d87b273905a53dc4357348b"

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
