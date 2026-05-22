
SRCBRANCH = "master"
SRCREV = "9ac4ff6598031e2c6d3d5e99290866b11e67e259"

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
