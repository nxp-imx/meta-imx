# look for files in the layer first
FILESEXTRAPATHS_prepend_mx6 := "${THISDIR}/${PN}:"

SRC_URI_append_mx6 = "file://0001-alsa-lib-1.0.24-fix_s24_3le_downmix.patch  \
		file://0003-pcm-rate-fix-that-hw_ptr-will-exceed-the-boundary.patch \
		file://0004-pcm_local.h-include-time.h-to-enable-CLOCK_MONOTONIC.patch \
"
RDEPENDS_libasound += "alsa-conf"
