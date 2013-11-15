# Append path for freescale layer to include alsa-state asound.conf 
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PRINC := "${@int(PRINC) + 1}"

SRC_URI += " file://asound.conf.3.10.17 \
	file://asound.state.3.10.17 \
"


do_install_append() {
    install -m 0644 ${WORKDIR}/asound.conf.3.10.17 ${D}${sysconfdir}/asound.conf
    install -m 0644 ${WORKDIR}/asound.state.3.10.17 ${D}${localstatedir}/lib/alsa/asound.state
}

COMPATIBLE_MACHINE = "(mx6)"
