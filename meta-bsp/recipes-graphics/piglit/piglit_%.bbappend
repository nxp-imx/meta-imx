FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

PACKAGECONFIG ?= "${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'x11 glx', '', d)}"
PACKAGECONFIG:append:mx9-nxp-bsp = " opencl"
