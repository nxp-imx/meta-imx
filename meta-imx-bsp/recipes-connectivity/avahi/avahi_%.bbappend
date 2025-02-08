# Allow to set allow-interfaces and/or deny-interfaces in avahi-daemon.conf
ALLOW_INTERFACES ??= ""
DENY_INTERFACES  ??= ""

# Disable switch port management
DENY_INTERFACES:mx943-nxp-bsp ??= "eth0,swp0,swp1,swp2"
PACKAGE_ARCH:mx943-nxp-bsp = "${MACHINE_SOCARCH}"

do_install:append:mx943-nxp-bsp() {
    if [ "${ALLOW_INTERFACES}" != "" ]; then
        sed -i -E "s/#?allow-interfaces=.*/allow-interfaces=${ALLOW_INTERFACES}/g" \
            ${D}${sysconfdir}/avahi/avahi-daemon.conf
    fi
    if [ "${DENY_INTERFACES}" != "" ]; then
        sed -i -E "s/#?deny-interfaces=.*/deny-interfaces=${DENY_INTERFACES}/g" \
            ${D}${sysconfdir}/avahi/avahi-daemon.conf
    fi
}
