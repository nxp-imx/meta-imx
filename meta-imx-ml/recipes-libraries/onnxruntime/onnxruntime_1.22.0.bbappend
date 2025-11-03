
SRCBRANCH = "imx_1.22.0"
SRCREV = "9a4555e2fd15b49d3a56bcc8c482898b73ed02ff" 

do_install:append() {
    # Copy label_image_onnx.py tool from onnxruntime-imx repo
    cp ${S}/onnxruntime/core/providers/neutron/tools/label_image_onnx.py ${D}${bindir}/${BP}/
}
