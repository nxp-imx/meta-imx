
SOC_GPU_TOOLS_X11_append_mx6q  = " gtkperf glcompbench"
SOC_GPU_TOOLS_X11_append_mx6dl = " gtkperf glcompbench"
SOC_GPU_TOOLS_X11_append_mx6sx = " gtkperf glcompbench"
SOC_GPU_TOOLS_X11_append_mx6sl = " gtkperf"

# Wayland packages

SOC_GPU_TOOLS_WAYLAND_mx6q = " glmark2 mesa-demos"
SOC_GPU_TOOLS_WAYLAND_mx6dl = " glmark2 mesa-demos"
SOC_GPU_TOOLS_WAYLAND_mx6sx = " glmark2 mesa-demos"
SOC_GPU_TOOLS_WAYLAND_mx6sl = " mesa-demos"

# XWayland packages

SOC_GPU_TOOLS_XWAYLAND = ""
SOC_GPU_TOOLS_XWAYLAND_mx6q = " gtkperf glmark2 mesa-demos"
SOC_GPU_TOOLS_XWAYLAND_mx6dl = " gtkperf glmark2 mesa-demos"
SOC_GPU_TOOLS_XWAYLAND_mx6sx = " gtkperf glmark2 mesa-demos"
SOC_GPU_TOOLS_XWAYLAND_mx6sl = " gtkperf mesa-demos"

# OpenCV test apps
OPENCV_TOOLS_INSTALL = ""
OPENCV_TOOLS_INSTALL_append_mx6 = "opencv-apps opencv-samples"

RDEPENDS_${PN} = " \
     ${@base_contains('DISTRO_FEATURES', 'x11', \
          base_contains('DISTRO_FEATURES', 'wayland', '${SOC_GPU_TOOLS_XWAYLAND}', '${SOC_GPU_TOOLS_X11}', d), \
                base_contains('DISTRO_FEATURES', 'wayland', '${SOC_GPU_TOOLS_WAYLAND}', \
                     base_contains('DISTRO_FEATURES', 'directfb', '${SOC_GPU_TOOLS_DIRECTFB}', \
                              '${SOC_GPU_TOOLS_FB}', d), d),d)} \
    ${OPENCV_TOOLS_INSTALL} \
"
