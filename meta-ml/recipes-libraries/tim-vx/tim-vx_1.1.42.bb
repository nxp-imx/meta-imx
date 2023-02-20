SUMMARY = "Tensor Interface Module for OpenVX"
DESCRIPTION = "TIM-VX is a software integration module provided by VeriSilicon \
to facilitate deployment of Neural-Networks on OpenVX enabled ML accelerators. It serves as \
the backend binding for runtime frameworks such as Android NN, Tensorflow-Lite, MLIR, TVM and more."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d72cd187d764d96d91db827cb65b48a7"

DEPENDS = "imx-gpu-viv nn-imx"

SRC_URI = "${TIM_VX_SRC};branch=${SRCBRANCH}"
TIM_VX_SRC ?= "git://github.com/nxp-imx/tim-vx-imx.git;protocol=https"
SRCBRANCH = "imx-v1.1.y"
SRCREV = "9b1ae45fde3f2e5ee8babb821040925f6e26e1f0"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE =  " \
    -DCONFIG=YOCTO \
    -DCMAKE_SYSROOT=${PKG_CONFIG_SYSROOT_DIR} \
    -DTIM_VX_ENABLE_TEST=off \
    -DTIM_VX_USE_EXTERNAL_OVXLIB=on \
    -DOVXLIB_INC=${PKG_CONFIG_SYSROOT_DIR}/usr/include/OVXLIB \
"

# Output library is unversioned
SOLIBS = ".so"
FILES_SOLIBSDEV = ""

COMPATIBLE_MACHINE          = "(^$)"
COMPATIBLE_MACHINE:imxgpu3d = "(mx8-nxp-bsp)"
COMPATIBLE_MACHINE:mx8mm-nxp-bsp    = "(^$)"
