RDEPENDS:${PN} += \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'nativesdk-wayland-dev nativesdk-wayland-tools', '', d)}"
