FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

IMX_PATCH += "file://0007-add-conf-for-imx-cs42448-sound-card.patch \
              file://0001-pcm-rate-fix-the-crash-in-snd_pcm_rate_may_wait_for_.patch \
              file://0002-pcm-rate-correct-the-previous-fix-for-snd_pcm_rate_m.patch \
"
