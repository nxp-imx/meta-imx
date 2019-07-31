
RDEPENDS_bluez5_remove = "libasound-module-bluez"

# Install bluez4 tools or bluez5 tools depending on what is specified in the distro.
# Otherwise install nothing.
RDEPENDS_${PN} = "${RDEPENDS_${BLUEZ}}"
