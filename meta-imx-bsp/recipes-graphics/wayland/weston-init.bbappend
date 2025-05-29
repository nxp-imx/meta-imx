FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

PACKAGECONFIG_USE_G2D:mx943-nxp-bsp   ?= "use-g2d"

update_file() {
    sed -i -e "s,$1,$2," $3
}

insert_line_before() {
    sed -i -e "/$1/i $2" $3
}

insert_line_after() {
    sed -i -e "/$1/a $2" $3
}

do_install:append() {
    if ${@bb.utils.contains('DISTRO_FEATURES','systemd','true','false',d)}; then
        # Add weston.log back, used by NXP for testing
        update_file "ExecStart=/usr/bin/weston " "ExecStart=/usr/bin/weston --log=\$\{XDG_RUNTIME_DIR\}/weston.log " ${D}${systemd_system_unitdir}/weston.service

        # FIXME: weston should be run as weston, not as root
        update_file "User=weston" "User=root" ${D}${systemd_system_unitdir}/weston.service
        update_file "Group=weston" "Group=root" ${D}${systemd_system_unitdir}/weston.service

        # FIXME: Upstream this change
        insert_line_before "ExecStart=" "ExecStartPre=+chvt 7" ${D}${systemd_system_unitdir}/weston.service

        # FIXME: fix the underlying problem and drop this workaround
        insert_line_after "ExecStart=" "Restart=on-failure" ${D}${systemd_system_unitdir}/weston.service
    else
        # Install weston-socket.sh for sysvinit as well
        install -D -p -m0644 ${WORKDIR}/weston-socket.sh ${D}${sysconfdir}/profile.d/weston-socket.sh
    fi

    # Include commented gbm-format
    if ! [ "${@bb.utils.contains('PACKAGECONFIG', 'gbm-format', 'yes', 'no', d)}" = "yes" ]; then
        sed -i -e "/^\[core\]/a #gbm-format=${GBM_FORMAT_VALUE}" ${D}${sysconfdir}/xdg/weston/weston.ini
    fi
}

do_install:append:mx6-nxp-bsp() {
    update_file "--no-resizeable" "--no-clients-resize" ${D}${sysconfdir}/xdg/weston/weston.ini
}

do_install:append:mx7-nxp-bsp() {
    update_file "--no-resizeable" "--no-clients-resize" ${D}${sysconfdir}/xdg/weston/weston.ini
}
