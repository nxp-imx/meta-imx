
SRCBRANCH = "imx_1.22.0"
SRCREV = "651686e97d3c06fe31f2f7a83c3fb63fa7722a70"

do_install:append() {
    # Copy label_image_onnx.py tool from onnxruntime-imx repo
    cp ${S}/onnxruntime/core/providers/neutron/tools/label_image_onnx.py ${D}${bindir}/${BP}/
}
