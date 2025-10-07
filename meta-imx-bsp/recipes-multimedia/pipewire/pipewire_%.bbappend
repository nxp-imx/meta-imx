FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

PACKAGECONFIG_REMOVE:mx8-nxp-bsp  = ""
PACKAGECONFIG_REMOVE:mx93-nxp-bsp = ""
# Disable pipewire-v4l2 on 32-bit to avoid Y2038 bug
PACKAGECONFIG:append = " ${PACKAGECONFIG_PIPEWIRE_V4L2}"
PACKAGECONFIG_PIPEWIRE_V4L2             = "pipewire-v4l2"
PACKAGECONFIG_PIPEWIRE_V4L2:arm:imx-nxp-bsp = ""
PACKAGECONFIG[pipewire-v4l2] = "-Dpipewire-v4l2=enabled,-Dpipewire-v4l2=disabled"

GLIBC_64BIT_TIME_FLAGS:arm:imx-nxp-bsp = " \
    ${@bb.utils.contains('PACKAGECONFIG', 'pipewire-v4l2', '', ' -D_TIME_BITS=64 -D_FILE_OFFSET_BITS=64', d)}"
INSANE_SKIP:remove:imx-nxp-bsp = "32bit-time"

SRC_URI:append:imx-nxp-bsp = " \
    file://0001-systemd-allow-pipewire-user-services-for-root.patch \
    file://0001-pipewiresrc-add-provide-clock-property.patch \
    file://0001-pipewiresrc-fix-sending-last-buffer-failure-if-waiti.patch \
    file://0001-YOCIMX-9095-pipewiresrc-set-rank-to-secondary.patch \
    file://0001-gst-pipewiresrc-Fixate-caps-if-intersect-did-not-ret.patch \
"
SRC_URI:append:mx95-nxp-bsp = " \
    file://0003-pipewiresrc-update-per-plane-stride-and-offset-accor.patch \
"
