DESCRIPTION = "i.MX Neural Networks Accelerator Plugin"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=bba6cdb9c2b03c849ed4975ed9ed90dc"

DEPENDS = "imx-gpu-viv"
NN-IMX_SRC ?= "git://source.codeaurora.org/external/imx/nn-imx.git;protocol=https"
SRCBRANCH = "nn-1.0.4"
SRCREV = "9e871f65f62155bf8388d79c2e2bbda63cb01ed6"

SRC_URI = "${NN-IMX_SRC};branch=${SRCBRANCH}"

S = "${WORKDIR}/git/"

EXTRA_OEMAKE += "SDKTARGETSYSROOT=${STAGING_DIR_HOST} \
                 AQROOT=`pwd` \
"
TARGET_CC_ARCH += "${LDFLAGS}"

do_install () {
    install -d ${D}${libdir}
    install -d ${D}/${includedir}/OVXLIB
    install -d ${D}/${includedir}/nnrt

    install -m 0755 ${S}/libnnrt.so ${D}${libdir}
    install -m 0755 ${S}/libneuralnetworks.so ${D}${libdir}
    install -m 0755 ${S}/libovxlib.so ${D}${libdir}

    cp -r ${S}/include/OVXLIB/* ${D}/${includedir}/OVXLIB
    cp -r ${S}/include/nnrt/* ${D}/${includedir}/nnrt
}

SOLIBS = ".so"
FILES_SOLIBSDEV = ""
