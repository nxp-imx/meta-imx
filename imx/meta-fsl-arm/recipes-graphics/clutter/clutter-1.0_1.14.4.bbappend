# Enable EGL backend for Wayland
PACKAGECONFIG = "${@base_contains('DISTRO_FEATURES', 'wayland', 'wayland egl', '', d)} \
                 ${@base_contains('DISTRO_FEATURES', 'x11', 'glx x11', '', d)}"

CFLAGS_append_mx6 += "${@base_contains('DISTRO_FEATURES', 'wayland', '-DLINUX -DEGL_API_FB -DEGL_API_WL', '', d)}"

PACKAGE_ARCH_mx6 = "${MACHINE_ARCH}"
