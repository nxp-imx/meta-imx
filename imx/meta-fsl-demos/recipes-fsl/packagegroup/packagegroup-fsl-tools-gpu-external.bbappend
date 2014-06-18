# X11 packages
X11_TOOLS_INSTALL = "${@base_contains('DISTRO_FEATURES', 'x11', \
   'glcompbench \
    gtkperf', '', d)}"

X11_TOOLS_INSTALL_remove_mx6sl = "glcompbench"

RDEPENDS_${PN} += " \
    ${X11_TOOLS_INSTALL} \
"



