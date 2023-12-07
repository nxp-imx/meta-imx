FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append:imx-nxp-bsp = " file://0001-launch-allow-pipewire-pulse-can-be-started-by-root.patch"

SYSTEMD_AUTO_ENABLE = "disable"

PACKAGECONFIG:remove = "gstreamer"
PACKAGECONFIG:remove:mx95-nxp-bsp = "libcamera"
PACKAGECONFIG:class-target:append = " ${@bb.utils.contains('DISTRO_FEATURES', 'bluetooth', 'bluez-lc3', '', d)}"
