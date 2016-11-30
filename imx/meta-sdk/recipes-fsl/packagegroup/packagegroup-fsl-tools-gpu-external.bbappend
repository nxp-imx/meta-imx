# Wayland packages
SOC_TOOLS_GPU_WAYLAND_mx8   = "mesa-demos glmark2"

# XWayland packages
SOC_TOOLS_GPU_XWAYLAND_mx8   = "mesa-demos gtkperf glmark2"

# X11 packages
SOC_TOOLS_GPU_X11_mx8 = " mesa-demos glmark2 eglinfo-x11 gtkperf glcompbench"

# OpenCV test apps
OPENCV_TOOLS_INSTALL = ""
OPENCV_TOOLS_INSTALL_imxgpu2d = "opencv-apps opencv-samples opencv-data"
OPENCV_TOOLS_INSTALL_mx8 = "opencv-apps opencv-samples opencv-data"

RDEPENDS_${PN} += " \
    ${OPENCV_TOOLS_INSTALL} \
"
