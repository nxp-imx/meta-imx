PACKAGECONFIG = "gtk ${@bb.utils.filter('DISTRO_FEATURES', 'opengl', d)}"
