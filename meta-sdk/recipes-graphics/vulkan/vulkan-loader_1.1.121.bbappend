
# choose wayland
PACKAGECONFIG = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', '' ,d)}"

SRC_URI_append = " file://0001-STDIO-844-No-need-to-change-the-App-s-apiVersion-to-.patch"

# The i.MX implementation is dynamically loaded, so it requires an
# explicit runtime dependency.
RRECOMMENDS_${PN}_append_imxgpu = " libvulkan-imx"

COMPATIBLE_MACHINE = "(mx8)"
COMPATIBLE_MACHINE_mx8mm = "(^$)"
