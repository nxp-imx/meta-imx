require kernel-module-mwifiex_git.inc

SUMMARY = "Marvell WiFi driver for PCIE module 8997"

EXTRA_OEMAKE += " \
    KERNELDIR=${STAGING_KERNEL_BUILDDIR} \
"

do_compile_prepend () {
    # Change build folder to 8997 folder
    cd ${S}/mwifiex_8997

    export ARCH=arm64
    export CROSS_COMPILE=aarch64-poky-linux-

    oe_runmake build
}

do_install () {
   # install ko and configs to rootfs
   install -d ${D}${datadir}/mrvl_wireless
   cp -rf ${S}/bin_pcie8997 ${D}${datadir}/mrvl_wireless
}


FILES_${PN} = "${datadir}/mrvl_wireless"

INSANE_SKIP_${PN} = "ldflags"
