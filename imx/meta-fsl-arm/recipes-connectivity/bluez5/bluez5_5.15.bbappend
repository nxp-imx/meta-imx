#require bluez5.inc
#SRC_URI[md5sum] = "92e29e51b361aab78cca30ef0cf8812e"
#SRC_URI[sha256sum] = "487bd75697e565793bf5bc4fbd5fa6a602788313b0c694f7542b81689fc0aa87"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

inherit update-rc.d

INITSCRIPT_NAME = "bluetooth"
INITSCRIPT_PARAMS = "defaults 64"

SRC_URI += "file://bluetooth.in"


PROVIDES += "virtual/bluez"
RPROVIDES_${PN} += "virtual/bluez"

EXTRA_OECONF += " --enable-experimental \
"

do_install_append() {
  install -d ${D}${sysconfdir}/init.d/
  install -m 0755 ${WORKDIR}/bluetooth.in ${D}${sysconfdir}/init.d/bluetooth
}
