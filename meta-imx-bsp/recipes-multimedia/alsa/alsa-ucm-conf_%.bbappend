FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append:imx-nxp-bsp = " file://0001-ucm2-NXP-add-alsa-ucm-support.patch"
