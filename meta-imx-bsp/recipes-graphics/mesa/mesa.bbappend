FILESEXTRAPATHS:prepend := "${THISDIR}/mesa:"

SRC_URI += "${SRC_URI_IMX}"
SRC_URI_IMX ??= ""
SRC_URI_IMX:imx-nxp-bsp ??= " \
    file://0001-LF-16845-Set-default-wayland-initialization-to-swras.patch \
    file://0002-Enable-partial-update-for-wayland-damage-region.patch \
    file://0003-Remove-support-for-eglBindWaylandDisplayWL.patch \
    file://0004-LF-16605-Disable-dma-buf-import-extensions-for-softp.patch"
SRC_URI_IMX:imxgpu ??= ""

PACKAGE_ARCH:imx-nxp-bsp = "${MACHINE_SOCARCH}"
