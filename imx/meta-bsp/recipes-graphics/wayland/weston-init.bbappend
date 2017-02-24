FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://profile"

do_install_append() {
    install -Dm0755 ${WORKDIR}/profile ${D}${sysconfdir}/profile.d/weston.sh

    sed -i  -e 's,/usr/bin,${bindir},g' \
        -e 's,/etc,${sysconfdir},g' \
        -e 's,/var,${localstatedir},g' \
        ${D}${systemd_system_unitdir}/weston.service
}
