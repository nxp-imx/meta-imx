FILESEXTRAPATHS:prepend := "${THISDIR}/mesa:"

SRC_URI:append:mx93-nxp-bsp = " ${SRC_URI_IMX}"
SRC_URI:append:mx943-nxp-bsp = " ${SRC_URI_IMX}"
SRC_URI_IMX ??= " \
    file://0001-LF-16845-Set-default-wayland-initialization-to-swras.patch \
    file://0002-Enable-partial-update-for-wayland-damage-region.patch \
    file://0003-Remove-support-for-eglBindWaylandDisplayWL.patch \
    file://0004-LF-16605-Disable-dma-buf-import-extensions-for-softp.patch"

PACKAGE_ARCH:imx-nxp-bsp = "${MACHINE_SOCARCH}"
