SUMMARY = "Tensor Interface Module for OpenVX"
DESCRIPTION = "TIM-VX is a software integration module provided by VeriSilicon \
to facilitate deployment of Neural-Networks on OpenVX enabled ML accelerators. It serves as \
the backend binding for runtime frameworks such as Android NN, Tensorflow-Lite, MLIR, TVM and more."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ededf2503f5d147ae718276dfd28801f"

DEPENDS = "imx-gpu-viv"

TIM_VX_SRC ?= "git://source.codeaurora.org/external/imx/tim-vx-imx.git;protocol=https"
SRCBRANCH = "imx_v1.1.y"
SRCREV = "8c502e4c80bef455890c3c33e568f11ff75601a6"
SRC_URI = "${TIM_VX_SRC};branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = "-DCONFIG=YOCTO -DTIMVX_REPLACE_COMPILER_FLAGS=off"

FILES_${PN} += " ${libdir}/*"
FILES_SOLIBSDEV = ""

INSANE_SKIP_${PN} += "dev-so"

COMPATIBLE_MACHINE = "(mx8)"
