FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI_append_mx6 = " \
    file://weston.sh \
    file://0001-weston-launch-silently-ignores-invalid-options.patch \
    file://0002-MGS-1111-Add-GPU-VIV-suport-for-wayland-and-weston-1.patch \
    file://0003-MGS-1192-xwld-g2d-compositor-dose-not-work.patch \
    file://0004-MGS-1235-Fix-setenv-and-clear-environments.patch \
    file://0005-MGS-1252-Fix-for-Qt5_CinematicExperience-will-meet-s.patch \
    file://0006-MGS-1236-imx6qp-imx6dl-First-frame-distored-when-som.patch \
    file://0007-MGS-1236-1-imx6qp-imx6dl-First-frame-distored-when-s.patch \
"
SRC_URI_remove_mx6 = " \
    file://0001-MGS-840-Add-i.MX6-support-for-weston.patch \
"
do_install_append_mx6 () {
    install -d ${D}${sysconfdir}/profile.d/
    install -m 0755 ${WORKDIR}/weston.sh ${D}${sysconfdir}/profile.d/

}

FILES_${PN}_append_mx6 = " ${sysconfdir}/profile.d/weston.sh"
