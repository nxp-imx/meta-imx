# Wayland packages

SOC_TOOLS_GPU_WAYLAND_mx6q  = "mesa-demos glmark2"
SOC_TOOLS_GPU_WAYLAND_mx6dl = "mesa-demos glmark2"
SOC_TOOLS_GPU_WAYLAND_mx6sx = "mesa-demos glmark2"
SOC_TOOLS_GPU_WAYLAND_mx6sl = "mesa-demos"
SOC_TOOLS_GPU_WAYLAND_mx8   = "mesa-demos glmark2"

# XWayland packages

SOC_TOOLS_GPU_XWAYLAND = ""
SOC_TOOLS_GPU_XWAYLAND_mx6q  = "mesa-demos gtkperf glmark2"
SOC_TOOLS_GPU_XWAYLAND_mx6dl = "mesa-demos gtkperf glmark2"
SOC_TOOLS_GPU_XWAYLAND_mx6sx = "mesa-demos gtkperf glmark2"
SOC_TOOLS_GPU_XWAYLAND_mx6sl = "mesa-demos gtkperf"
SOC_TOOLS_GPU_XWAYLAND_mx8   = "mesa-demos gtkperf glmark2"

# X11 packages

SOC_TOOLS_GPU_X11_mx8 = " mesa-demos glmark2 eglinfo-x11 gtkperf glcompbench"


# OpenCV test apps
OPENCV_TOOLS_INSTALL = ""
OPENCV_TOOLS_INSTALL_append_mx6 = "opencv-apps opencv-samples"
OPENCV_TOOLS_INSTALL_append_mx8 = "opencv-apps opencv-samples"

RDEPENDS_${PN} = " \
    ${OPENCV_TOOLS_INSTALL} \
"
