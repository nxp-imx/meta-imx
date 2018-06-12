FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = "file://0001-aplay-Adjust-sample-rate-limits-to-support-newer-hardware.patch \
                  file://0001-alsactl-Only-start-restore-service-when-asoundrc-file.patch \
"
