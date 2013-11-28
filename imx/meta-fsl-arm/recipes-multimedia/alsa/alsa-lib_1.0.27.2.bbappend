PRINC := "${@int(PRINC) + 1}"

# look for files in the layer first
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://alsa-lib-1.0.24-fix_s24_3le_downmix.patch \
          "

