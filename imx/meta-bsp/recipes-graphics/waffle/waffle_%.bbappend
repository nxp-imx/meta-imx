# Build waffle with wayland support
PACKAGECONFIG_append_imxgpu = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', ' wayland','', d)} \
"
