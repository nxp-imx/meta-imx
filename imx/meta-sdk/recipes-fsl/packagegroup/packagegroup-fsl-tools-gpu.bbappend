GPU_PKGS = ""
GPU_PKGS_mx6 = "imx-gpu-viv-tools-apitrace"

XWAYLAND_PKGS = ""
XWAYLAND_PKGS_mx6 = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', \
                                      bb.utils.contains('DISTRO_FEATURES', 'x11','xserver-xorg-xwayland', '', d), '',d)}"
SOC_TOOLS_GPU_append_mx6 = " ${GPU_PKGS} ${XWAYLAND_PKGS}"

XWAYLAND = "${@bb.utils.contains('DISTRO_FEATURES', 'x11 wayland', 'xserver-xorg-extension-viv-autohdmi', '', d)}"

SOC_TOOLS_GPU_remove_mx6 = "${XWAYLAND} fsl-gpu-sdk imx-gpu-viv-g2d"

SOC_TOOLS_GPU_append_mx6 = " imx-gpu-sdk imx-gpu-viv-g2d-mx6"

SOC_TOOLS_GPU_mx8 = " \
        imx-viv-dpu-g2d-mx8 \
        imx-gpu-viv-tools-apitrace \
        imx-gpu-viv-demos \
        ${@bb.utils.contains('DISTRO_FEATURES', 'wayland','xserver-xorg-xwayland', '', d)} \
        "
XWAYLAND = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'xserver-xorg-extension-viv-autohdmi', '', d)}"

SOC_TOOLS_GPU_remove_mx8 = "${XWAYLAND}"
