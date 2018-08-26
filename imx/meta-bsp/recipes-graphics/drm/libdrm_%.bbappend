FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

IMX_LIBDRM_SRC ?= "git://source.codeaurora.org/external/imx/libdrm-imx.git;protocol=https"
IMX_LIBDRM_BRANCH = "libdrm-imx-2.4.91"
SRC_URI_remove     = "http://dri.freedesktop.org/libdrm/${BP}.tar.bz2"
SRC_URI_remove_mx8 = "file://drm-update-arm.patch"
SRC_URI_prepend    = "${IMX_LIBDRM_SRC};branch=${IMX_LIBDRM_BRANCH} "
SRCREV = "e8e9cf8a66be11508c39f1cc31b8a5e7eb758875"

S = "${WORKDIR}/git"

EXTRA_OECONF_append_imxgpu = " --enable-vivante-experimental-api"

PACKAGES_prepend_imxgpu = "${PN}-vivante "

RRECOMMENDS_${PN}-drivers_append_imxgpu = " ${PN}-vivante"

FILES_${PN}-vivante = "${libdir}/libdrm_vivante.so.*"
