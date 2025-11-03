
SRCBRANCH = "imx_1.22.0"
SRCREV = "3404b271960933a9d793073fea26364273341185"

do_install:append() {
    # Copy label_image_onnx.py tool from onnxruntime-imx repo
    cp ${S}/onnxruntime/core/providers/neutron/tools/label_image_onnx.py ${D}${bindir}/${BP}/
}
