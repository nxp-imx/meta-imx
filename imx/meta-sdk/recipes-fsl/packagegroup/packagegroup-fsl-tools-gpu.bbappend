# Direct FB 
DFB_TOOLS_INSTALL = ""
DFB_TOOLS_INSTALL_mx6 = "${@base_contains('DISTRO_FEATURES', 'directfb', \
    'libvivante-dfb-mx6', '', d)}"

RDEPENDS_${PN} += " \
    ${DFB_TOOLS_INSTALL} \
"
SOC_TOOLS_GPU_append_mx6 = " \
    imx-gpu-viv-tools-apitrace \
"
