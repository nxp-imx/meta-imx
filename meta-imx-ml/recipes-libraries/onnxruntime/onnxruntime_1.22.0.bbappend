
SRCBRANCH = "imx_1.22.0"
SRCREV = "42e8f1f9a0af7a9a9bb5a4476322d073ef0ddd10"

do_install:append() {
    # Copy label_image_onnx.py tool from onnxruntime-imx repo
    cp ${S}/onnxruntime/core/providers/neutron/tools/label_image_onnx.py ${D}${bindir}/${BP}/
}
