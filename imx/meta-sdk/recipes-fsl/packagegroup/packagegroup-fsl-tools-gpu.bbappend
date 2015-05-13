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
