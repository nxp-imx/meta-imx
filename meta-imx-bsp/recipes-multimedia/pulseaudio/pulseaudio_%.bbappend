SRC_URI_IMX:mx9-nxp-bsp = " \
    ${SRC_URI_IMX:mx6-nxp-bsp}"

EXTRA_OEMESON += "-Denable-smoother-2=false"

PACKAGE_ARCH:mx9-nxp-bsp = "${MACHINE_SOCARCH}"

# Disable oss-output on 32-bit to avoid Y2038 bug
PACKAGECONFIG:append = " ${PACKAGECONFIG_OSS}"
PACKAGECONFIG_OSS                 = "oss-output"
PACKAGECONFIG_OSS:arm:imx-nxp-bsp = ""
PACKAGECONFIG[oss-output] = "-Doss-output=enabled,-Doss-output=disabled"

GLIBC_64BIT_TIME_FLAGS:arm:imx-nxp-bsp = " \
    ${@bb.utils.contains('PACKAGECONFIG', 'oss-output', '', ' -D_TIME_BITS=64 -D_FILE_OFFSET_BITS=64', d)}"
INSANE_SKIP:remove:imx-nxp-bsp = "32bit-time"
