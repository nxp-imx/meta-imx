FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

GLIBC_64BIT_TIME_FLAGS = ""
INSANE_SKIP:append = " 32bit-time"

IMX_PATCH += "file://0007-add-conf-for-imx-cs42448-sound-card.patch \
              file://0001-pcm-rate-fix-the-crash-in-snd_pcm_rate_may_wait_for_.patch \
              file://0001-pcm-Fix-segfault-with-32bit-libs.patch \
"
