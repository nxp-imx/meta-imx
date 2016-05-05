FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_mx6 = " \
    file://weston.sh \
    file://0001-weston-launch-silently-ignores-invalid-options.patch \
    file://0003-MGS-1192-xwld-g2d-compositor-dose-not-work.patch \
    file://0008-MGS-1668-xwld-System-can-not-boot-up-to-desktop.patch \
    file://0009-MGS-1284-xwld-Re-implement-weston-2d-renderer-with-p.patch \
    file://0010-MGS-1284-1-xwld-Re-implement-weston-2d-renderer-with.patch \
    file://0011-MGS-1724-xwld-G2D-compositor-build-failed-in-slevk-b.patch \
"
PACKAGECONFIG_append_mx6 = "${@bb.utils.contains('DISTRO_FEATURES', 'x11',' xwayland', '', d)}"

do_install_append_mx6 () {
    install -d ${D}${sysconfdir}/profile.d/
    install -m 0755 ${WORKDIR}/weston.sh ${D}${sysconfdir}/profile.d/

    if [ "${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'x11', '', d)}" = "x11" ]; then
        install -d ${D}/${sysconfdir}
        install ${WORKDIR}/build/weston.ini ${D}/${sysconfdir}
        sed -i 's/#modules=xwayland.so,cms-colord.so/modules=xwayland.so/' ${D}${sysconfdir}/weston.ini
    fi
}

FILES_${PN}_append_mx6 = " ${sysconfdir}/profile.d/weston.sh ${sysconfdir}/weston.ini"
