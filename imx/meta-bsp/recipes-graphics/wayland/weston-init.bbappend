FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

REQUIRED_DISTRO_FEATURES_remove_mx6sl = "opengl"

SRC_URI_append = " file://profile"
SRC_URI_append = " ${@bb.utils.contains('DISTRO_FEATURES', 'systemd wayland x11', 'file://weston.config', '', d)}"

HAS_SYSTEMD = "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'yes', 'no', d)}"
HAS_XWAYLAND = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland x11', 'yes', 'no', d)}"

do_install_append() {
    install -Dm0755 ${WORKDIR}/profile ${D}${sysconfdir}/profile.d/weston.sh
    if [ "${HAS_SYSTEMD}" = "yes" ]; then
        sed -i \
            -e 's,/usr/bin,${bindir},g' \
            -e 's,/etc,${sysconfdir},g' \
            -e 's,/var,${localstatedir},g' \
            ${D}${systemd_system_unitdir}/weston.service
        if [ "${HAS_XWAYLAND}" = "yes" ]; then
            install -Dm0755 ${WORKDIR}/weston.config ${D}${sysconfdir}/default/weston
        fi
    fi
}
