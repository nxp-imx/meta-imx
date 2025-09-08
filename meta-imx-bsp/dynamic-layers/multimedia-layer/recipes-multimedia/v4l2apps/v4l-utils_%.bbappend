# Disable v4l-wrappers on 32-bit to avoid Y2038 bug
PACKAGECONFIG:append = " ${PACKAGECONFIG_V4L2_WRAP}"
PACKAGECONFIG_V4L2_WRAP             = "v4l-wrappers"
PACKAGECONFIG_V4L2_WRAP:arm:imx-nxp-bsp = ""
PACKAGECONFIG[v4l-wrappers] = "-Dv4l-wrappers=true,-Dv4l-wrappers=false"

GLIBC_64BIT_TIME_FLAGS:arm:imx-nxp-bsp = " \
    ${@bb.utils.contains('PACKAGECONFIG', 'v4l-wrappers', '', ' -D_TIME_BITS=64 -D_FILE_OFFSET_BITS=64', d)} \
"
