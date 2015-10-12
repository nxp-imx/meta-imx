FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI_append_mx6 = " \
    file://weston.sh \
    file://weston-launch-silently-ignores-invalid-options.patch \
"

do_install_append_mx6 () {
    install -d ${D}${sysconfdir}/profile.d/
    install -m 0755 ${WORKDIR}/weston.sh ${D}${sysconfdir}/profile.d/
}

FILES_${PN}_append_mx6 = " ${sysconfdir}/profile.d/weston.sh"
