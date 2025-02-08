# Allow to set allow-interfaces and/or deny-interfaces in avahi-daemon.conf
ALLOW_INTERFACES ??= ""
DENY_INTERFACES  ??= ""

do_install:append() {
    if [ "${ALLOW_INTERFACES}" != "" ]; then
        sed -i -E "s/#?allow-interfaces=.*/allow-interfaces=${ALLOW_INTERFACES}/g" \
            ${D}${sysconfdir}/avahi/avahi-daemon.conf
    fi
    if [ "${DENY_INTERFACES}" != "" ]; then
        sed -i -E "s/#?deny-interfaces=.*/deny-interfaces=${DENY_INTERFACES}/g" \
            ${D}${sysconfdir}/avahi/avahi-daemon.conf
    fi
}
