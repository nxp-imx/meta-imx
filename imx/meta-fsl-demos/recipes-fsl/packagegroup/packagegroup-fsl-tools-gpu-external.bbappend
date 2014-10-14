# X11 packages
X11_TOOLS_INSTALL =  ""
X11_TOOLS_GTK = "${@base_contains('DISTRO_FEATURES', 'x11', 'gtkperf', '', d)}"
X11_TOOLS_GLCOMP = "${@base_contains('DISTRO_FEATURES', 'x11', 'glcompbench', '', d)}"

X11_TOOLS_INSTALL_append_mx6q = " ${X11_TOOLS_GTK} ${X11_TOOLS_GLCOMP}"
X11_TOOLS_INSTALL_append_mx6dl = " ${X11_TOOLS_GTK} ${X11_TOOLS_GLCOMP}"
X11_TOOLS_INSTALL_append_mx6sx = " ${X11_TOOLS_GTK} ${X11_TOOLS_GLCOMP}"
X11_TOOLS_INSTALL_append_mx6sl = " ${X11_TOOLS_GTK}"

RDEPENDS_${PN} += " \
    ${X11_TOOLS_INSTALL} \
"



