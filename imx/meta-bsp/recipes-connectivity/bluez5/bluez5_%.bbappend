FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

# Do not start the service during system boot up
INITSCRIPT_PARAMS_${PN} = "stop 20 0 1 6 ."

# Add patch for module bcm43xx
# Add patches for QCA modules with Qca6174 and Qca9377-3 chips
SRC_URI += " \
            file://0002-hciattach-set-flag-to-enable-HCI-reset-on-init.patch \
"
