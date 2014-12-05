# Direct FB 
DFB_TOOLS_INSTALL = ""
DFB_TOOLS_INSTALL_mx6 = "${@base_contains('DISTRO_FEATURES', 'directfb', \
    'libvivante-dfb-mx6', '', d)}"

X11_TOOLS_INSTALL = ""
X11_TOOLS_INSTALL_mx6 = "${@base_contains('DISTRO_FEATURES', 'x11', \
   'xserver-xorg-extension-viv-hdmi', '', d)}"

RDEPENDS_${PN} += " \
    ${DFB_TOOLS_INSTALL} \
    ${X11_TOOLS_INSTALL} \
"

SOC_TOOLS_GPU_mx6 += " fsl-gpu-sdk"

SOC_TOOLS_GPU_remove_mx6 = " \
    gpu-viv-bin-mx6q \
    gpu-viv-g2d \
"
SOC_TOOLS_GPU_append_mx6 = " \
    imx-gpu-viv \
    imx-gpu-viv-g2d-mx6 \
"
SOC_TOOLS_GPU_remove_mx6sl = "fsl-gpu-sdk"
