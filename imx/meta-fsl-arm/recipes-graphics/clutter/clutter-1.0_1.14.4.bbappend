# Enable EGL backend for Wayland
PACKAGECONFIG = "${@base_contains('DISTRO_FEATURES', 'wayland', 'wayland egl', '', d)} \
                 ${@base_contains('DISTRO_FEATURES', 'x11', 'glx x11', '', d)}"

PACKAGE_ARCH_mx6 = "${MACHINE_ARCH}"