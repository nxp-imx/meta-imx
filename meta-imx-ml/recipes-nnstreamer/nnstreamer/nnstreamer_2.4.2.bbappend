FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += " file://0001-gray8_padding_removal.patch \
             file://0001-Fix-to-provide-default-delegates.patch \
             file://0001-Test-fix-deprecated-method.patch \
             file://0001-meta-Add-GstNnsTensorQuantMeta-to-propagate-per-tensor-quantization-parameters.patch \
             file://0002-filter-api-Introduce-tensor_filter-V2-framework-API-for-DMA-BUF-zero-copy.patch \
             file://0003-filter-Implement-tensor_filter-V2-dispatch-with-DMA-BUF-and-quant-meta.patch \
             file://0004-Enable-tensor_filter-for-ara240-NPU.patch \
             file://0005-filter-ara2-Improve-external-DMA-BUF-handling-for-zero-copy.patch \
             file://0006-filter-Fix-V2-transform-crash-on-fragmented-single-tensor-buffers.patch \
             file://0007-converter-Add-flexible-type-validation-framework.patch \
             file://0008-converter-Add-DMA-BUF-zero-copy-pass-through-for-video.patch \
             file://0009-filter-ara2-Add-ZeroCopy-runtime-property-default-false.patch \
             file://0010-docs-Add-ara2-sub-plugin-and-V2-API-documentation.patch \
             file://0011-filter-Add-safety-guards-and-resource-cleanup.patch \
"

# Enable ara2 support on platforms with Ara-2 NPU hardware
# The Ara-2 is a PCIe Gen3 x4 add-in card compatible with i.MX 8M Plus and i.MX 95
PACKAGECONFIG:append:mx8mp-nxp-bsp = " ara2"
PACKAGECONFIG:append:mx95-nxp-bsp = " ara2"
PACKAGECONFIG:remove:mx937-nxp-bsp = " ara2"
PACKAGECONFIG:remove:mx952-nxp-bsp = " ara2"

# Ara-2 NPU tensor_filter sub-plugin
PACKAGECONFIG[ara2] = "\
    -Dara2-support=enabled, \
    -Dara2-support=disabled, \
    imx-nxp-ara2, \
    imx-nxp-ara2, \
"

# Create separate package for ara2 tensor_filter plugin
PACKAGES =+ "${@bb.utils.contains('PACKAGECONFIG', 'ara2', '${PN}-ara2', '', d)}"

# Pull nnstreamer-ara2 is as a dependency when ara2 is enabled
RRECOMMENDS:${PN} =+ "${@bb.utils.contains('PACKAGECONFIG', 'ara2', '${PN}-ara2', '', d)}"

# ara2 sub-plugin
SUMMARY:${PN}-ara2 = "NNStreamer Ara-2 NPU tensor_filter sub-plugin"
DESCRIPTION:${PN}-ara2 = "\
Ara-2 NPU acceleration sub-plugin for NNStreamer tensor_filter. \
Provides hardware-accelerated inference on Ara-2 PCIe NPUs with \
DMA-BUF zero-copy support via V2 invoke API. \
"
FILES:${PN}-ara2 = "\
    ${libdir}/nnstreamer/filters/libnnstreamer_filter_ara2.so \
"
