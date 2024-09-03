FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-LF-11869-change-mali-wsi-layer-activating-order.patch"

# libvulkan.so is loaded dynamically, so put it in the main package
SOLIBS          = ".so*"
FILES_SOLIBSDEV = ""
INSANE_SKIP:${PN} += "dev-so"

# Override default mesa drivers with i.MX GPU drivers
RRECOMMENDS:${PN}:imxvulkan = "libvulkan-imx"
# Override default mesa drivers with i.MX GPU drivers
RRECOMMENDS:${PN}:mx95-nxp-bsp = "mali-imx-libvulkan"
