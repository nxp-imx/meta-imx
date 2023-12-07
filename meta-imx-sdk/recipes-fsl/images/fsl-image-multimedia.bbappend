IMAGE_FEATURES:remove = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'x11-base', '', d)}"

CORE_IMAGE_EXTRA_INSTALL += "${@bb.utils.contains('DISTRO_FEATURES', 'x11 wayland', \
                                              'weston-xwayland weston-init weston-examples \
                                               gtk+3-demo clutter-1.0-examples xterm', '', d)}"
