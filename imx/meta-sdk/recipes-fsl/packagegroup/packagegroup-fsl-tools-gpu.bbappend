GPU_PKGS = ""
GPU_PKGS_mx6 = "imx-gpu-viv-tools-apitrace"
GPU_PKGS_mx6ul = ""

SOC_TOOLS_GPU_mx6ul = ""
SOC_TOOLS_GPU_append_mx6 = " ${GPU_PKGS} "

XWAYLAND = "${@base_contains('DISTRO_FEATURES', 'wayland', \
                    base_contains('DISTRO_FEATURES', 'x11','xserver-xorg-extension-viv-autohdmi', '', d), '',d)}"

SOC_TOOLS_GPU_remove_mx6 = "${XWAYLAND}"
