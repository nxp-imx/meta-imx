
SRC_URI += "file://0001-change_engines_loc.patch"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

files_${PN} += "${sysconfdir}/ssl/openssl.cnf"
FILES_${PN}-misc = "${sysconfdir}/ssl/misc ${sysconfdir}/ssl/certs ${sysconfdir}/ssl/private"
files_${PN}-engines = "${libdir}/ssl/engines/*.so"

do_configure_append () {
        perl ./Configure ${EXTRA_OECONF} shared --prefix=$useprefix --openssldir=$sysconfdir/ssl --libdir=`basename ${libdir}` $target
}
