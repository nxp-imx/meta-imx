FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

IMX_LIBDRM_SRC ?= "git://source.codeaurora.org/external/imx/libdrm-imx.git;protocol=https"
IMX_LIBDRM_BRANCH = "libdrm-imx-2.4.84"
SRC_URI_remove_imxgpu  = "http://dri.freedesktop.org/libdrm/${BP}.tar.bz2"
SRC_URI_remove_mx8     = "file://drm-update-arm.patch"
SRC_URI_prepend_imxgpu = "${IMX_LIBDRM_SRC};branch=${IMX_LIBDRM_BRANCH} "
SRCREV_imxgpu = "bc8476570137577e0c4457707a1115a4cfa6cf86"

SRC_URI_append = " file://0001-libdrm-amphion-Add-Amphion-VPU-tiled-format.patch \
                   file://0002-libdrm-verisilicon-Add-Verisilicon-VPU-tiled-format.patch \
"

S_imxgpu = "${WORKDIR}/git"

EXTRA_OECONF_append_imxgpu = " --enable-vivante-experimental-api"

PACKAGES_prepend_imxgpu = "${PN}-vivante "

RRECOMMENDS_${PN}-drivers_append_imxgpu = " ${PN}-vivante"

FILES_${PN}-vivante = "${libdir}/libdrm_vivante.so.*"
