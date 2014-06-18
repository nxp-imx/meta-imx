
PACKAGECONFIG_remove_mx6sl = "glesv2"

PACKAGECONFIG_class-target_mx6sl = " \
    ${@base_contains('DISTRO_FEATURES', 'directfb', 'directfb', '', d)}"

