GPU_PKGS = ""
GPU_PKGS_mx6 = "imx-gpu-viv-tools-apitrace"

XWAYLAND_PKGS = ""
XWAYLAND_PKGS_mx6 = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', \
                                      bb.utils.contains('DISTRO_FEATURES', 'x11','xserver-xorg-xwayland', '', d), '',d)}"
SOC_TOOLS_GPU_append_mx6 = " ${GPU_PKGS} ${XWAYLAND_PKGS}"

XWAYLAND = "${@bb.utils.contains('DISTRO_FEATURES', 'x11 wayland', 'xserver-xorg-extension-viv-autohdmi', '', d)}"

SOC_TOOLS_GPU_remove_mx6 = "${XWAYLAND} fsl-gpu-sdk imx-gpu-viv-g2d"

SOC_TOOLS_GPU_append_mx6 = " imx-gpu-sdk imx-gpu-viv-g2d-mx6"
