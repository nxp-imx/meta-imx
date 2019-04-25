PACKAGECONFIG_append_imxgpu = " \
    ${@bb.utils.filter('DISTRO_FEATURES', 'wayland', d)} \
"
