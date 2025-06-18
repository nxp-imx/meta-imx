FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

LIC_FILES_CHKSUM = "file://LICENSE;md5=fbc093901857fcd118f065f900982c24"

SRC_URI = "${IMXLIB_SRC};branch=${SRCBRANCH} \
           file://0001-fixup-Fix-gcc-15-errors.patch"
IMXLIB_SRC ?= "git://github.com/nxp-imx/imx-lib.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "24e317b5cdc2b78735dfa7d4b2776b587b7a193f"

PLATFORM:mx93-nxp-bsp = "IMX8ULP"
PLATFORM:mx943-nxp-bsp = "IMX8ULP"

COMPATIBLE_MACHINE = "(mx6-nxp-bsp|mx7-nxp-bsp|mx8ulp-nxp-bsp|mx93-nxp-bsp|mx943-nxp-bsp)"
