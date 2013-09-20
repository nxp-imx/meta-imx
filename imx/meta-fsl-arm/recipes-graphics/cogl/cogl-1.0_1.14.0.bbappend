# Enable framebuffer  backend for Wayland

CFLAGS += "${@base_contains('DISTRO_FEATURES', 'wayland', '-DLINUX -DEGL_API_FB -DEGL_API_WL', '', d)}" 

PACKAGE_ARCH_mx6 = "${MACHINE_ARCH}"
