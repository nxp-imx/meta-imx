FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI_append_mx6 = " \
    file://weston.sh "
    file://weston-launch-silently-ignores-invalid-options.patch \
"

FILES_${PN}_append_mx6 = " ${sysconfdir}/profile.d/weston.sh"
