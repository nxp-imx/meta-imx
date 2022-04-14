FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# Do not start the service during system boot up
INITSCRIPT_PARAMS:${PN} = "stop 20 0 1 6 ."

# Add patch for module bcm43xx
# Add patches for QCA modules with Qca6174 and Qca9377-3 chips
SRC_URI += " \
            file://0001-bluetooth-Add-bluetooth-support-for-QCA6174-chip.patch \
            file://0002-hciattach-set-flag-to-enable-HCI-reset-on-init.patch \
            file://0003-hciattach-instead-of-strlcpy-with-strncpy-to-avoid-r.patch \
            file://0004-Add-support-for-Tufello-1.1-SOC.patch \
            file://0005-bluetooth-Add-support-for-multi-baud-rate.patch \
            file://0006-gobex-increase-the-obex-default-abort-timeout-value.patch \
            file://0007-MLK-23858-profiles-audio-increased-the-MTU-size-to-M.patch \
            file://0008-gobex-add-a-workaround-patch-for-canceling-obex-tran.patch \
"
