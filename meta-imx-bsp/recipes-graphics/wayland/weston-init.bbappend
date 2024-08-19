FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

GBM_FORMAT_VALUE = "argb8888"

update_file() {
    if ! grep -q "$1" $3; then
        bbfatal $1 not found in $3
    fi
    sed -i -e "s,$1,$2," $3
}

do_install:append() {
    if ${@bb.utils.contains('DISTRO_FEATURES','systemd','true','false',d)}; then
        # Add weston.log back, used by NXP for testing
        update_file "ExecStart=/usr/bin/weston " "ExecStart=/usr/bin/weston --log=\$\{XDG_RUNTIME_DIR\}/weston.log " ${D}${systemd_system_unitdir}/weston.service

        # FIXME: weston should be run as weston, not as root
        update_file "User=weston" "User=root" ${D}${systemd_system_unitdir}/weston.service
        update_file "Group=weston" "Group=root" ${D}${systemd_system_unitdir}/weston.service
    else
        # Install weston-socket.sh for sysvinit as well
        install -D -p -m0644 ${WORKDIR}/weston-socket.sh ${D}${sysconfdir}/profile.d/weston-socket.sh
    fi

    # Include commented gbm-format
    if ! [ "${@bb.utils.contains('PACKAGECONFIG', 'gbm-format', 'yes', 'no', d)}" = "yes" ]; then
        sed -i -e "/^\[core\]/a #gbm-format=${GBM_FORMAT_VALUE}" ${D}${sysconfdir}/xdg/weston/weston.ini
    fi

    if [ "${@bb.utils.contains('PACKAGECONFIG', 'rdp', 'yes', 'no', d)}" = "yes" ]; then
        sed -i -e "s|^command=${bindir}/weston .*|& --rdp-tls-cert=${sysconfdir}/freerdp/keys/server.crt --rdp-tls-key=${sysconfdir}/freerdp/keys/server.key|" ${D}${sysconfdir}/xdg/weston/weston.ini
        sed -i -e "/^\[core\]/a modules=screen-share.so" ${D}${sysconfdir}/xdg/weston/weston.ini
    fi
}
