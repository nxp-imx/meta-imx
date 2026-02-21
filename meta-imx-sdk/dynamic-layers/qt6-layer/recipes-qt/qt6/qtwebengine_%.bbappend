FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRC_URI:append:imx-nxp-bsp = " file://0001-Disable-Intel-backend-by-default.patch;patchdir=src/3rdparty"

PACKAGECONFIG += "${PACKAGECONFIG_IMX}"
PACKAGECONFIG_IMX             = ""
PACKAGECONFIG_IMX:mx6-nxp-bsp = "skcms-portable"
PACKAGECONFIG_IMX:mx7-nxp-bsp = "skcms-portable"

PACKAGECONFIG[skcms-portable] = ""

# These settings are picked up by recipes-qt/qt6/gn-utils.inc mapping
# to GN's extra_cflags and extra_cxxflags.
TARGET_CFLAGS += " \
    ${@bb.utils.contains('PACKAGECONFIG', 'skcms-portable', '-DSKCMS_PORTABLE=1', '', d)}"

PACKAGE_ARCH:imx-nxp-bsp = "${MACHINE_SOCARCH}"
