SUMMARY = "Tensor Interface Module for OpenVX"
DESCRIPTION = "TIM-VX is a software integration module provided by VeriSilicon \
to facilitate deployment of Neural-Networks on OpenVX enabled ML accelerators. It serves as \
the backend binding for runtime frameworks such as Android NN, Tensorflow-Lite, MLIR, TVM and more."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ededf2503f5d147ae718276dfd28801f"

DEPENDS = "imx-gpu-viv nn-imx"

TIM_VX_SRC ?= "git://source.codeaurora.org/external/imx/tim-vx-imx.git;protocol=https"
SRCBRANCH = "imx_v1.1.y"
SRCREV = "8c642678c855263c7df6d45ef006f27d81b9be97"
SRC_URI = "${TIM_VX_SRC};branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE =  " \
    -DCMAKE_SYSROOT=${PKG_CONFIG_SYSROOT_DIR} \
    -DCMAKE_INSTALL_PREFIX_INITIALIZED_TO_DEFAULT=on \
    -DCONFIG=YOCTO \
    -DTIMVX_REPLACE_COMPILER_FLAGS=off \
    -DTIMVX_USE_EXTERNAL_OVXLIB=on \
"

# Output library is unversioned
SOLIBS = ".so"
FILES_SOLIBSDEV = ""

COMPATIBLE_MACHINE          = "(^$)"
COMPATIBLE_MACHINE_imxgpu3d = "(mx8)"
COMPATIBLE_MACHINE_mx8mm    = "(^$)"
