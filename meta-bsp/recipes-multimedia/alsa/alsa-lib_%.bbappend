FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

IMX_PATCH += "file://0007-add-conf-for-imx-cs42448-sound-card.patch \
              file://0001-pcm-rate-check-rate-type-for-using-snd_pcm_rate_slav.patch \
"
