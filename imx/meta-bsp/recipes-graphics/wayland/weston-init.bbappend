FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
    file://weston-start \
    file://profile \
"

do_install_append() {
	install -Dm0755 ${WORKDIR}/profile ${D}${sysconfdir}/profile.d/weston.sh

	# Install weston-start script
	install -Dm755 ${WORKDIR}/weston-start ${D}${bindir}/weston-start
	sed -i 's,@DATADIR@,${datadir},g' ${D}${bindir}/weston-start
	sed -i 's,@LOCALSTATEDIR@,${localstatedir},g' ${D}${bindir}/weston-start
}
