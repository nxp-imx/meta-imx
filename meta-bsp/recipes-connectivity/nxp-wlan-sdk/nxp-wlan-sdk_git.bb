require nxp-wlan-sdk_git.inc

SUMMARY = "NXP Wi-Fi SDK"

TARGET_CC_ARCH += "${LDFLAGS}"

EXTRA_OEMAKE += "CROSS_COMPILE=${HOST_PREFIX}"

do_compile () {
    oe_runmake build
}

do_install () {
   install -d ${D}${datadir}/nxp_wireless
   cp -rf mapp/mlanutl/mlanutl ${D}${datadir}/nxp_wireless
   cp -rf script/load ${D}${datadir}/nxp_wireless
   cp -rf script/unload ${D}${datadir}/nxp_wireless
   cp -rf README_MLAN ${D}${datadir}/nxp_wireless
}


FILES_${PN} = "${datadir}/nxp_wireless"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
