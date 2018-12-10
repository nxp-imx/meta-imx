
# choose wayland
PACKAGECONFIG = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', '' ,d)}"

COMPATIBLE_MACHINE = "(mx8)"
COMPATIBLE_MACHINE_mx8mm = "(^$)"
