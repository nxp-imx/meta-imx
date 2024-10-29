FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-alsa-utils-alsactl-Enable-no-lock-flag-for-service.patch \
            file://0001-Revert-aplay-fix-S24_LE-wav-header.patch \
           "
