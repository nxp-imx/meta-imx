# Wayland packages

SOC_GPU_TOOLS_WAYLAND_mx6q  = "mesa-demos glmark2"
SOC_GPU_TOOLS_WAYLAND_mx6dl = "mesa-demos glmark2"
SOC_GPU_TOOLS_WAYLAND_mx6sx = "mesa-demos glmark2"
SOC_GPU_TOOLS_WAYLAND_mx6sl = "mesa-demos"
SOC_GPU_TOOLS_WAYLAND_mx8   = "mesa-demos glmark2"

# XWayland packages

SOC_GPU_TOOLS_XWAYLAND = ""
SOC_GPU_TOOLS_XWAYLAND_mx6q  = "mesa-demos gtkperf glmark2"
SOC_GPU_TOOLS_XWAYLAND_mx6dl = "mesa-demos gtkperf glmark2"
SOC_GPU_TOOLS_XWAYLAND_mx6sx = "mesa-demos gtkperf glmark2"
SOC_GPU_TOOLS_XWAYLAND_mx6sl = "mesa-demos gtkperf"
SOC_GPU_TOOLS_XWAYLAND_mx8   = "mesa-demos gtkperf glmark2"

# X11 packages

SOC_GPU_TOOLS_X11_mx8 = " mesa-demos glmark2 eglinfo-x11 gtkperf glcompbench"


# OpenCV test apps
OPENCV_TOOLS_INSTALL = ""
OPENCV_TOOLS_INSTALL_append_mx6 = "opencv-apps opencv-samples"
OPENCV_TOOLS_INSTALL_append_mx8 = "opencv-apps opencv-samples"

RDEPENDS_${PN} = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11 wayland', '${SOC_GPU_TOOLS_XWAYLAND}', \
       bb.utils.contains('DISTRO_FEATURES',     'wayland', '${SOC_GPU_TOOLS_WAYLAND}', \
       bb.utils.contains('DISTRO_FEATURES',         'x11', '${SOC_GPU_TOOLS_X11}', \
                                                           '${SOC_GPU_TOOLS_FB}', d), d), d)} \
    ${OPENCV_TOOLS_INSTALL} \
"
