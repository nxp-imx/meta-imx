# Direct FB 
DFB_TOOLS_INSTALL = ""
DFB_TOOLS_INSTALL_mx6 = "${@base_contains('DISTRO_FEATURES', 'directfb', \
    'libvivante-dfb-mx6', '', d)}"

X11_TOOLS_INSTALL = ""
X11_TOOLS_INSTALL_mx6 = "${@base_contains('DISTRO_FEATURES', 'x11', \
   'xserver-xorg-extension-viv-hdmi', '', d)}"

RDEPENDS_${PN} = " \
    ${DFB_TOOLS_INSTALL} \
    ${X11_TOOLS_INSTALL} \
"


