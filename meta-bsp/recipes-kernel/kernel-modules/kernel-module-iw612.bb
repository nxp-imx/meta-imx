require recipes-connectivity/nxp-wlan-sdk/iw612-sdk_git.inc

SUMMARY = "NXP Wi-Fi driver for module IW612"

inherit module

EXTRA_OEMAKE += "-C ${STAGING_KERNEL_BUILDDIR} M=${S}"
