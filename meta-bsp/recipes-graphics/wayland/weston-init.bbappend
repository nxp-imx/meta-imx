FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

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

    # Remove weston.sh installed by meta-freescale, it is superceded by weston-socket.sh
    rm ${D}${sysconfdir}/profile.d/weston.sh
}
