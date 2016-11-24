FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

# Do not start the service during system boot up
INITSCRIPT_PARAMS_${PN} = "stop 20 0 1 6 ."

# Add patch for module bcm43xx
SRC_URI += "file://0001-hciattach-bcm43xx-fix-the-delay-timer-for-firmware-d.patch"
