# NXP i.MX StandAlomeMM build
require edk2-firmware_202202.bb
SUMMARY = "i.MX StandAlomeMM binary produced by EDK2"
DESCRIPTION = "StandAlomeMM is a PE/COFF binary produced by EDK2 for i.MX platforms"

# To prevent a collision with u-boot-imx, remove virtual/bootloader provides
PROVIDES:remove:imx-nxp-bsp = "virtual/bootloader"

SRC_URI:append:imx-nxp-bsp = " file://iMXStandaloneMmRpmb.dsc"

EDK2_PLATFORM:imx-nxp-bsp = "MmStandaloneRpmb"
EDK2_PLATFORM_DSC:imx-nxp-bsp = "../../iMXStandaloneMmRpmb.dsc"
EDK2_BIN_NAME:imx-nxp-bsp = "BL32_AP_MM.fd"

do_install:imx-nxp-bsp() {
    install -d ${D}/firmware
    install ${B}/Build/${EDK2_PLATFORM}/${EDK2_BUILD_MODE}_${EDK_COMPILER}/FV/${EDK2_BIN_NAME} ${D}/firmware/
}

COMPATIBLE_MACHINE:imx-nxp-bsp = "(mx8-nxp-bsp|mx9-nxp-bsp)"
PACKAGE_ARCH:imx-nxp-bsp = "${TUNE_PKGARCH}"
