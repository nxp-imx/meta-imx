FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

IMX_LIBDRM_SRC ?= "git://source.codeaurora.org/external/imx/libdrm-imx.git;protocol=https"
IMX_LIBDRM_BRANCH = "libdrm-imx-2.4.84"
SRC_URI_remove     = "http://dri.freedesktop.org/libdrm/${BP}.tar.bz2"
SRC_URI_remove_mx8 = "file://drm-update-arm.patch"
SRC_URI_prepend    = "${IMX_LIBDRM_SRC};branch=${IMX_LIBDRM_BRANCH} "
SRCREV = "8c7caf58a1377afdf2db2ee8c5db04d21d413351"

S = "${WORKDIR}/git"

EXTRA_OECONF_append_imxgpu = " --enable-vivante-experimental-api"

PACKAGES_prepend_imxgpu = "${PN}-vivante "

RRECOMMENDS_${PN}-drivers_append_imxgpu = " ${PN}-vivante"

FILES_${PN}-vivante = "${libdir}/libdrm_vivante.so.*"
