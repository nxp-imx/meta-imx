DESCRIPTION = "i.MX Neural Networks Accelerator Plugin"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=bba6cdb9c2b03c849ed4975ed9ed90dc"

DEPENDS = "imx-gpu-viv"
NN-IMX_SRC ?= "git://source.codeaurora.org/external/imx/nn-imx.git;protocol=https"
SRCBRANCH = "nn_1.1.y"

SRCREV = "814ce810044a48e971aa796d5c4338b0d8225968"

SRC_URI = "${NN-IMX_SRC};branch=${SRCBRANCH}"

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

COMPATIBLE_MACHINE = "(mx8)"
COMPATIBLE_MACHINE_mx8mm = "(^$)"
COMPATIBLE_MACHINE_mx8mnlite = "(^$)"
