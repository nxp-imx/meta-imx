require onnxruntime.inc

SRC_URI:remove = "file://0001-optimizer_api.h-Fix-gcc15-build-issues.patch"
SRCBRANCH = "imx_1.23.2"
SRCREV = "f05d08a8c9a6f61a7a55b37c9750e5d142552b64"

EXTRA_OECMAKE += "-DCMAKE_CXX_FLAGS='-I${B}'"

INSANE_SKIP:${PN} += "buildpaths"
INSANE_SKIP:${PN}-dev += "buildpaths"
INSANE_SKIP:${PN}-dbg += "buildpaths"
INSANE_SKIP:${PN}-tests += "buildpaths"

do_install:append() {
    # Copy label_image_onnx.py tool from onnxruntime-imx repo
    cp ${S}/onnxruntime/core/providers/neutron/tools/label_image_onnx.py ${D}${bindir}/${BP}/
}

