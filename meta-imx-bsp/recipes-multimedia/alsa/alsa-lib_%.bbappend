# override meta-freescale/recipes-multimedia/alsa/alsa-lib_%.bbappend
GLIBC_64BIT_TIME_FLAGS:arm:imx-nxp-bsp = " -D_TIME_BITS=64 -D_FILE_OFFSET_BITS=64"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRC_URI:append:imx-nxp-bsp = " \
    file://0008-add-conf-for-audmix-cs42448-in-aliases.conf.patch \
"
