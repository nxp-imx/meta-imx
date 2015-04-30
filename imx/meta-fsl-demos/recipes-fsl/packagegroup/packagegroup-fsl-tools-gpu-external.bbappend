# X11 packages
X11_TOOLS_INSTALL =  ""
X11_TOOLS_GTK = "${@base_contains('DISTRO_FEATURES', 'x11', 'gtkperf', '', d)}"
X11_TOOLS_GLCOMP = "${@base_contains('DISTRO_FEATURES', 'x11', 'glcompbench', '', d)}"

X11_TOOLS_INSTALL_append_mx6q = " ${X11_TOOLS_GTK} ${X11_TOOLS_GLCOMP}"
X11_TOOLS_INSTALL_append_mx6dl = " ${X11_TOOLS_GTK} ${X11_TOOLS_GLCOMP}"
X11_TOOLS_INSTALL_append_mx6sx = " ${X11_TOOLS_GTK} ${X11_TOOLS_GLCOMP}"
X11_TOOLS_INSTALL_append_mx6sl = " ${X11_TOOLS_GTK}"

# wayland packages

WAYLAND_TOOLS_INSTALL =  ""
WAYLAND_TOOLS_INSTALL_append_mx6q = "${@base_contains('DISTRO_FEATURES', 'wayland', ' glmark2', '', d)}"
WAYLAND_TOOLS_INSTALL_append_mx6dl = "${@base_contains('DISTRO_FEATURES', 'wayland', ' glmark2', '', d)}"
WAYLAND_TOOLS_INSTALL_append_mx6sx = "${@base_contains('DISTRO_FEATURES', 'wayland', ' glmark2', '', d)}"

RDEPENDS_${PN} = " \
    ${@base_contains("DISTRO_FEATURES", "x11", "${SOC_GPU_TOOLS_X11}", \
        base_contains("DISTRO_FEATURES", "wayland", "${SOC_GPU_TOOLS_WAYLAND}", \
            base_contains("DISTRO_FEATURES", "directfb", "${SOC_GPU_TOOLS_DIRECTFB}", \
                 "${SOC_GPU_TOOLS_FB}", d), d), d)} \
    ${X11_TOOLS_INSTALL} \
    ${WAYLAND_TOOLS_INSTALL} \
"
