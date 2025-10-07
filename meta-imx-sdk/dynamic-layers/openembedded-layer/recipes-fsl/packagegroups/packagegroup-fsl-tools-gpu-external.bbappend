WAYLAND_TOOLS:append = " \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "renderdoc", "", d)} \
"
