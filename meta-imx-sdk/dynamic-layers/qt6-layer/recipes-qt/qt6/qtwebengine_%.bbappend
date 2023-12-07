DEPENDS += " \
    libdrm \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'xdamage', '', d)}"
