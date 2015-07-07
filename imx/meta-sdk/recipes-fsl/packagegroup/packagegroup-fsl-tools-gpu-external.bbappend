# X11 packages
X11_TOOLS_INSTALL =  ""
X11_TOOLS_GTK = "${@base_contains('DISTRO_FEATURES', 'x11', 'gtkperf', '', d)}"
X11_TOOLS_GLCOMP = "${@base_contains('DISTRO_FEATURES', 'x11', 'glcompbench', '', d)}"

X11_TOOLS_INSTALL_append_mx6q = " ${X11_TOOLS_GTK} ${X11_TOOLS_GLCOMP}"
X11_TOOLS_INSTALL_append_mx6dl = " ${X11_TOOLS_GTK} ${X11_TOOLS_GLCOMP}"
X11_TOOLS_INSTALL_append_mx6sx = " ${X11_TOOLS_GTK} ${X11_TOOLS_GLCOMP}"
X11_TOOLS_INSTALL_append_mx6sl = " ${X11_TOOLS_GTK}"

# wayland packages

SOC_GPU_TOOLS_WAYLAND_mx6q = " glmark2 mesa-demos"
SOC_GPU_TOOLS_WAYLAND_mx6dl = " glmark2 mesa-demos"
SOC_GPU_TOOLS_WAYLAND_mx6sx = " glmark2 mesa-demos"
SOC_GPU_TOOLS_WAYLAND_mx6sl = " mesa-demos"

# OpenCV test apps
OPENCV_TOOLS_INSTALL = ""
OPENCV_TOOLS_INSTALL_append_mx6 = "opencv-apps opencv-samples"

RDEPENDS_${PN} = " \
     ${@base_contains('DISTRO_FEATURES', 'x11', \
          base_contains('DISTRO_FEATURES', 'wayland', '${SOC_GPU_TOOLS_WAYLAND}', '${SOC_GPU_TOOLS_X11}', d), \
                base_contains('DISTRO_FEATURES', 'wayland', '${SOC_GPU_TOOLS_WAYLAND}', \
                     base_contains('DISTRO_FEATURES', 'directfb', '${SOC_GPU_TOOLS_DIRECTFB}', \
                              '${SOC_GPU_TOOLS_FB}', d), d),d)} \
    ${X11_TOOLS_INSTALL} \
    ${OPENCV_TOOLS_INSTALL} \
"
