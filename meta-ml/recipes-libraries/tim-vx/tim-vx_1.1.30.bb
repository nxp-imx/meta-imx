SUMMARY = "Tensor Interface Module for OpenVX"
DESCRIPTION = "TIM-VX is a software integration module provided by VeriSilicon \
to facilitate deployment of Neural-Networks on OpenVX enabled ML accelerators. It serves as \
the backend binding for runtime frameworks such as Android NN, Tensorflow-Lite, MLIR, TVM and more."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ededf2503f5d147ae718276dfd28801f"

DEPENDS = "imx-gpu-viv nn-imx"

TIM_VX_SRC ?= "git://source.codeaurora.org/external/imx/tim-vx-imx.git;protocol=https"
SRCBRANCH = "lf-5.10.y_2.0.0"
SRCREV = "99315324153c1d57aff1fdc3a3f565746a01b9f3"
SRC_URI = "${TIM_VX_SRC};branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE =  "-DCMAKE_SYSROOT=${PKG_CONFIG_SYSROOT_DIR=}"
EXTRA_OECMAKE += "-DCONFIG=YOCTO -DTIMVX_REPLACE_COMPILER_FLAGS=off -DTIMVX_USE_EXTERNAL_OVXLIB=on"

FILES_${PN} += " ${libdir}/*"
FILES_SOLIBSDEV = ""

INSANE_SKIP_${PN} += "dev-so"

COMPATIBLE_MACHINE = "(mx8)"
COMPATIBLE_MACHINE_mx8mm = "(^$)"
COMPATIBLE_MACHINE_mx8mnul = "(^$)"
