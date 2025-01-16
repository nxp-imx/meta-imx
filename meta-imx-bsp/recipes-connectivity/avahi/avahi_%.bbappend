do_install:append:mx943-nxp-bsp() {
    sed -i "s/#deny-interfaces=eth1/deny-interfaces=eth0,swp0,swp1,swp2/g" ${D}${sysconfdir}/avahi/avahi-daemon.conf
} 