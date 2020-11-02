FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://profile"

do_install_append() {
    install -Dm0755 ${WORKDIR}/profile ${D}${sysconfdir}/profile.d/weston.sh

    #FIXME: Add weston.log back
    sed -i -e "s,ExecStart=/usr/bin/weston ,ExecStart=/usr/bin/weston --log=\$\{XDG_RUNTIME_DIR\}/weston.log ,g" ${D}${systemd_system_unitdir}/weston@.service
}
