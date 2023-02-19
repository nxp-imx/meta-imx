RDEPENDS:${PN}-ptest:remove = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', '', 'tk', d)}"
