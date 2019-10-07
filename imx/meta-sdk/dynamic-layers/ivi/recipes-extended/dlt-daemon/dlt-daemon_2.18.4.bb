SUMMARY = "Diagnostic Log and Trace"
DESCRIPTION = "This component provides a standardised log and trace interface, \
based on the standardised protocol specified in the AUTOSAR standard 4.0 DLT. \
This component can be used by GENIVI components and other applications as \
logging facility providing: \
- the DLT shared library \
- the DLT daemon, including startup scripts \
- the DLT daemon adaptors- the DLT client console utilities \
- the DLT test applications"
HOMEPAGE = "https://www.genivi.org/"
SECTION = "console/utils"
LICENSE = "MPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8184208060df880fe3137b93eb88aeea"

DEPENDS = "dbus zlib gzip-native"

SRC_URI = "https://github.com/GENIVI/dlt-daemon/archive/v${PV}.tar.gz \
    file://0002-Don-t-execute-processes-as-a-specific-user.patch \
    file://0004-Modify-systemd-config-directory.patch \
"
SRC_URI[md5sum] = "691c10b56857183d9a88023e18964211"
SRC_URI[sha256sum] = "6bd2bd4e9157e459a4ac7429f9e19cdefd5705fd1358fcf33423b6b4b8b54ac5"

S = "${WORKDIR}/${PN}-${PV}"

inherit autotools gettext cmake systemd

PACKAGES += "${PN}-systemd"
SYSTEMD_PACKAGES = "${PN} ${PN}-systemd"
SYSTEMD_SERVICE_${PN} = "dlt-system.service dlt.service"
SYSTEMD_AUTO_ENABLE_${PN} = "enable"
SYSTEMD_SERVICE_${PN}-systemd = " \
    dlt-example-user.service \
    dlt-adaptor-udp.service \
    dlt-receive.service"
SYSTEMD_AUTO_ENABLE_${PN}-systemd = "disable"

EXTRA_OECMAKE = "-DWITH_SYSTEMD=ON -DWITH_DLT_SYSTEM=ON -DWITH_DLT_ADAPTOR=ON"

FILES_${PN}-doc += "${datadir}/dlt-filetransfer"

do_install_append() {
    rm -f ${D}${bindir}/dlt-test-*
}
