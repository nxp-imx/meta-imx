FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI_append_mx6 = " file://weston.sh "

FILES_${PN}_append_mx6 = " ${sysconfdir}/profile.d/weston.sh"
