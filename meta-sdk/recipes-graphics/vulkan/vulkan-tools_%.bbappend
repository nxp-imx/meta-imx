
# choose wayland
PACKAGECONFIG = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', '' ,d)}"

EXTRA_OECMAKE = "-DBUILD_CUBE=OFF"

COMPATIBLE_MACHINE = "(mx8)"
COMPATIBLE_MACHINE_mx8mm = "(^$)"
