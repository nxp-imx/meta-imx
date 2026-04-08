FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-alsa-utils-alsactl-Enable-no-lock-flag-for-service.patch \
            file://0002-Revert-aplay-add-missing-break-before-the-default-ca.patch \
            file://0003-Revert-aplay-reorganize-format-handling-in-begin_wav.patch \
           "
