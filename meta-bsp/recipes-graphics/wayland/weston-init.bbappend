FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://profile"

# To customize weston.ini, start by setting the desired assignment in weston.ini,
# commented out. For example:
#     #xwayland=true
# Then add the assignment to INI_UNCOMMENT_ASSIGNMENTS.
INI_UNCOMMENT_ASSIGNMENTS_append_mx8mp = " \
    use-g2d=1 \
"
INI_UNCOMMENT_ASSIGNMENTS_append_mx8 = " \
    repaint-window=16 \
"

do_install_append() {
    install -Dm0755 ${WORKDIR}/profile ${D}${sysconfdir}/profile.d/weston.sh
}
