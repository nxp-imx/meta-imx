FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += " file://0001-gray8_padding_removal.patch \
             file://0001-Fix-to-provide-default-delegates.patch \
             file://0001-Test-fix-deprecated-method.patch \
             file://0001-Add-Ara-2-NPU-tensor_filter-with-V2-API-and-DMA-BUF.patch \
"

# Enable ara2 support on platforms with Kinara Ara-2 NPU hardware
# The Ara-2 is a PCIe Gen3 x4 add-in card compatible with i.MX 8M Plus and i.MX 95
PACKAGECONFIG:append:mx8mp-nxp-bsp = " ara2"
PACKAGECONFIG:append:mx9-nxp-bsp = " ara2"

# Kinara Ara-2 NPU tensor_filter sub-plugin
PACKAGECONFIG[ara2] = "\
    -Dara2-support=enabled, \
    -Dara2-support=disabled, \
    imx-nxp-ara2, \
    imx-nxp-ara2, \
    kernel-module-uiodma \
"

# Create separate package for ara2 tensor_filter plugin
PACKAGES =+ "${@bb.utils.contains('PACKAGECONFIG', 'ara2', '${PN}-ara2', '', d)}"

# Pull nnstreamer-ara2 is as a dependency when ara2 is enabled
RRECOMMENDS:${PN} =+ "${@bb.utils.contains('PACKAGECONFIG', 'ara2', '${PN}-ara2', '', d)}"

# ara2 sub-plugin
SUMMARY:${PN}-ara2 = "NNStreamer Kinara Ara-2 NPU tensor_filter sub-plugin"
DESCRIPTION:${PN}-ara2 = "\
Kinara Ara-2 NPU acceleration sub-plugin for NNStreamer tensor_filter. \
Provides hardware-accelerated inference on Kinara Ara-2 PCIe NPUs with \
DMA-BUF zero-copy support via V2 invoke API. \
"
FILES:${PN}-ara2 = "\
    ${libdir}/nnstreamer/filters/libnnstreamer_filter_ara2.so \
"
