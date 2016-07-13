GPU_PKGS = ""
GPU_PKGS_mx6 = "imx-gpu-viv-tools-apitrace"

SOC_TOOLS_GPU_append_mx6 = " ${GPU_PKGS}"

XWAYLAND = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'xserver-xorg-extension-viv-autohdmi', '', d)}"

SOC_TOOLS_GPU_remove_mx6 = "${XWAYLAND} fsl-gpu-sdk"

SOC_TOOLS_GPU_append_mx6 = " imx-gpu-sdk"

SOC_TOOLS_GPU_mx8 = " \
        imx-dpu-g2d-mx8 \
        imx-gpu-viv-tools-apitrace \
        imx-gpu-viv-demos \
        imx-gpu-sdk \
        "

SOC_TOOLS_GPU_remove_mx8 = "${XWAYLAND}"
