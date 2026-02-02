RDEPENDS:${PN}:append = " \
    iperf2 \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'glmark2', '', d)} \
"
