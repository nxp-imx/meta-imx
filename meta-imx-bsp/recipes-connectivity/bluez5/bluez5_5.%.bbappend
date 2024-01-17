FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# Do not start the service during system boot up
INITSCRIPT_PARAMS:${PN} = "stop 20 0 1 6 ."

# Add patch for module bcm43xx
SRC_URI += " \
            file://0006-gobex-increase-the-obex-default-abort-timeout-value.patch \
            file://0007-MLK-23858-profiles-audio-increased-the-MTU-size-to-M.patch \
            file://0008-gobex-add-a-workaround-patch-for-canceling-obex-tran.patch \
            file://CVE-2023-45866.patch \
"
