
SRCBRANCH = "lf-6.18.37_2.1.0"
SRCREV = "9bdf0da1fe2c439f34006044004f2c7f182f371c" 

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
