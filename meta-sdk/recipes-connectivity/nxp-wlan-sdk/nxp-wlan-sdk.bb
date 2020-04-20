require recipes-kernel/kernel-modules/kernel-module-mwifiex_git.inc

SUMMARY = "NXP WiFi SDK"

EXTRA_OEMAKE += " \
    KERNELDIR=${STAGING_KERNEL_BUILDDIR} \
"

do_compile () {
    # Change build folder to SDK folder
    cd ${S}/mxm_wifiex/wlan_src

    export ARCH=arm64
    export CROSS_COMPILE=aarch64-poky-linux-

    oe_runmake build
}

do_install () {
   # install ko and configs to rootfs
   install -d ${D}${datadir}/nxp_wireless
   cp -rf ${S}/mxm_wifiex/bin_mxm_wifiex ${D}${datadir}/nxp_wireless
}


FILES_${PN} = "${datadir}/nxp_wireless"

INSANE_SKIP_${PN} = "ldflags"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
