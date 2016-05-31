# XWayland backport from Yocto 2.2
CORE_IMAGE_BASE_INSTALL += "${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'weston-xwayland xterm', '', d)}"

CORE_IMAGE_BASE_INSTALL_remove_mx6sl = "clutter-1.0-examples"
