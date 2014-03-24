require recipes-connectivity/bluez5/bluez5.inc

inherit update-rc.d
INITSCRIPT_NAME = "bluetooth"
INITSCRIPT_PARAMS = "defaults 64"

SRC_URI[md5sum] = "e0d8a362c714bd48d9bd9393f009201c"
SRC_URI[sha256sum] = "009c29079bcc736b650642de8e05c575d047642b39a2118cf0f0bc4b03a663d0"

SRC_URI += "file://bluetooth.in"
PROVIDES += "virtual/bluez"
RPROVIDES_${PN} += "virtual/bluez"

EXTRA_OECONF += " --enable-experimental \
"
do_install_append() {
  install -d ${D}${sysconfdir}/init.d/
  install -m 0755 ${WORKDIR}/bluetooth.in ${D}${sysconfdir}/init.d/bluetooth
}
