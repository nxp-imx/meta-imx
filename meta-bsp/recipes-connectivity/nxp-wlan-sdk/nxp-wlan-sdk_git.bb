require nxp-wlan-sdk_git.inc

SUMMARY = "NXP Wi-Fi SDK"

TARGET_CC_ARCH += "${LDFLAGS}"

do_compile () {
    # Change build folder to SDK folder
    cd ${S}/mxm_wifiex/wlan_src/mapp/mlanutl

    oe_runmake
}

do_install () {
   # install ko and configs to rootfs
   install -d ${D}${datadir}/nxp_wireless
   cp -rf ${S}/mxm_wifiex/wlan_src/mapp/mlanutl/mlanutl ${D}${datadir}/nxp_wireless
   cp -rf ${S}/mxm_wifiex/wlan_src/script/load ${D}${datadir}/nxp_wireless
   cp -rf ${S}/mxm_wifiex/wlan_src/script/unload ${D}${datadir}/nxp_wireless
   cp -rf ${S}/mxm_wifiex/wlan_src/README_MLAN ${D}${datadir}/nxp_wireless
}


FILES_${PN} = "${datadir}/nxp_wireless"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
