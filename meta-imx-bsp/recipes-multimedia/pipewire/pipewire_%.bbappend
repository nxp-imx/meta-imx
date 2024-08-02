# Disable pipewire-v4l2 on 32-bit to avoid Y2038 bug
PACKAGECONFIG:append = " ${PACKAGECONFIG_PIPEWIRE_V4L2}"
PACKAGECONFIG_PIPEWIRE_V4L2             = "pipewire-v4l2"
PACKAGECONFIG_PIPEWIRE_V4L2:arm:imx-nxp-bsp = ""
PACKAGECONFIG[pipewire-v4l2] = "-Dpipewire-v4l2=enabled,-Dpipewire-v4l2=disabled"

GLIBC_64BIT_TIME_FLAGS:arm:imx-nxp-bsp = " \
    ${@bb.utils.contains('PACKAGECONFIG', 'pipewire-v4l2', '', ' -D_TIME_BITS=64 -D_FILE_OFFSET_BITS=64', d)}"
INSANE_SKIP:remove:imx-nxp-bsp = "32bit-time"
