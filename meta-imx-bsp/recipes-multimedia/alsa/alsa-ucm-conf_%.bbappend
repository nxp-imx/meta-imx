FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append:imx-nxp-bsp = " file://0001-ucm2-NXP-add-alsa-ucm-support.patch \
                               file://0002-ucm2-NXP-Add-audmix-wm8962-conf-files.patch \
                               file://0003-ucm2-NXP-Add-conf-files-for-rpmsg-sound-cards.patch \
                             "
