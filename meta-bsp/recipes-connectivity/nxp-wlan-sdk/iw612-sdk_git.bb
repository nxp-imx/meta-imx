require iw612-sdk_git.inc

SUMMARY = "NXP Wi-Fi SDK for IW612"

inherit module-base

TARGET_CC_ARCH += "${LDFLAGS}"

do_compile () {
    oe_runmake appsbuild
}

do_install () {
    install -d ${D}${datadir}/nxp_wireless

    cp -r bin_sdw61x/* ${D}${datadir}/nxp_wireless
}

FILES:${PN} = "${datadir}/nxp_wireless"

COMPATIBLE_MACHINE = "(mx93-nxp-bsp)"
