# Direct FB 
DFB_TOOLS_INSTALL = ""
DFB_TOOLS_INSTALL_mx6 = "${@base_contains('DISTRO_FEATURES', 'directfb', \
    'libvivante-dfb-mx6', '', d)}"
DFB_TOOLS_INSTALL_mx6ul = ""

RDEPENDS_${PN} += " \
    ${DFB_TOOLS_INSTALL} \
"

GPU_PKGS = ""
GPU_PKGS_mx6 = "imx-gpu-viv-tools-apitrace"
GPU_PKGS_mx6ul = ""

SOC_TOOLS_GPU_mx6ul = ""
SOC_TOOLS_GPU_append_mx6 = " ${GPU_PKGS} "

XWAYLAND = "${@base_contains('DISTRO_FEATURES', 'wayland', \
                    base_contains('DISTRO_FEATURES', 'x11','xserver-xorg-extension-viv-autohdmi', '', d), '',d)}"

SOC_TOOLS_GPU_remove_mx6 = "${XWAYLAND}"
