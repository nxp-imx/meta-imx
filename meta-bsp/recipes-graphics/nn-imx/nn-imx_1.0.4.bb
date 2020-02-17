DESCRIPTION = "i.MX Neural Networks Accelerator Plugin"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=bba6cdb9c2b03c849ed4975ed9ed90dc"

DEPENDS = "virtual/libopenvx"
NN-IMX_SRC ?= "git://source.codeaurora.org/external/imx/nn-imx.git;protocol=https"
SRCBRANCH = "nn-1.0.4"
SRCREV = "34e14a1c2c4e5f093abe515377cad1b4c0483438"

SRC_URI = "${NN-IMX_SRC};branch=${SRCBRANCH}"

S = "${WORKDIR}/git/"

EXTRA_OEMAKE += "SDKTARGETSYSROOT=${STAGING_DIR_HOST} \
                 AQROOT=`pwd` \
"
TARGET_CC_ARCH += "${LDFLAGS}"

do_install () {
    install -d ${D}${libdir}
    install -m 0755 ${S}/libnnrt.so ${D}${libdir}
    install -m 0755 ${S}/libneuralnetworks.so ${D}${libdir}
    install -m 0755 ${S}/libovxlib.so ${D}${libdir}
}

SOLIBS = ".so"
FILES_SOLIBSDEV = ""
