require recipes-connectivity/nxp-wlan-sdk/nxp-wlan-sdk_git.inc

SUMMARY = "NXP Wi-Fi driver for module 88w8997/8987"

inherit module

do_compile () {
    # Change build folder to src folder
	cd ${S}/mxm_wifiex/wlan_src
	oe_runmake -C ${STAGING_KERNEL_BUILDDIR} M=$(pwd)
}

do_install () {
    # install ko to rootfs
    oe_runmake modules_install -C ${STAGING_KERNEL_BUILDDIR} M=${S}/mxm_wifiex/wlan_src INSTALL_MOD_PATH=${D}
}
