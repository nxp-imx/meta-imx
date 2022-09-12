# Copyright 2020-2021 NXP
DESCRIPTION = "i.MX Neural Networks Accelerator Plugin"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=bba6cdb9c2b03c849ed4975ed9ed90dc"

DEPENDS = "imx-gpu-viv"
NN_IMX_SRC ?= "git://github.com/nxp-imx/nn-imx.git;protocol=https"
SRCBRANCH = "imx_1.2.0"

SRCREV = "9ea9b2e22de05dff5829cde357df3dd4a4f7c307" 

SRC_URI = "${NN_IMX_SRC};branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

EXTRA_OEMAKE += "SDKTARGETSYSROOT=${STAGING_DIR_HOST} \
                 AQROOT=`pwd` \
"
TARGET_CC_ARCH += "${LDFLAGS}"

do_install () {
    install -d ${D}${libdir}
    install -d ${D}${includedir}/OVXLIB
    install -d ${D}${includedir}/nnrt
    cp -d ${S}/*.so* ${D}${libdir}
    cp -r ${S}/include/OVXLIB/* ${D}/${includedir}/OVXLIB
    cp -r ${S}/include/nnrt/* ${D}/${includedir}/nnrt
}

# libneuralnetworks.so is dynamically loaded and thus needed in the
# main package
FILES_${PN}-dev_remove = "${libdir}/lib*.so"
FILES_${PN} += "${libdir}/libneuralnetworks${SOLIBSDEV}"
FILES_${PN}-dev += " \
    ${libdir}/libnnrt${SOLIBSDEV} \
    ${libdir}/libovxlib${SOLIBSDEV} \
"
INSANE_SKIP_${PN} += "dev-so"

# Works for i.MX 8 with GPU except for 8M Mini
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "(mx8)"
COMPATIBLE_MACHINE_mx8mm  = "(^$)"
