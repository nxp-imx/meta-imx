FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://profile"

SRC_URI_append_mx8dx = "${@bb.utils.contains('DISTRO_FEATURES', 'systemd wayland x11', ' file://weston.config', '', d)}"

# To customize weston.ini, start by setting the desired assignment in weston.ini,
# commented out. For example:
#     #xwayland=true
# Then add the assignment to INI_UNCOMMENT_ASSIGNMENTS.
INI_UNCOMMENT_ASSIGNMENTS_append_mx8mp = " \
    use-g2d=1 \
"

do_install_append() {
    install -Dm0755 ${WORKDIR}/profile ${D}${sysconfdir}/profile.d/weston.sh
}
