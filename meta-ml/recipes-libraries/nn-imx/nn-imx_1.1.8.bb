DESCRIPTION = "i.MX Neural Networks Accelerator Plugin"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=bba6cdb9c2b03c849ed4975ed9ed90dc"

DEPENDS = "imx-gpu-viv"
NN-IMX_SRC ?= "git://source.codeaurora.org/external/imx/nn-imx.git;protocol=https"
SRCBRANCH = "imx_1.1.8"

SRCREV = "14161e7a3ebf131d976136f94284e10403dbe262"

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

    install -m 0755 ${S}/*.so* ${D}${libdir}

    ln -sf libneuralnetworks.so.1.1.8 ${D}${libdir}/libneuralnetworks.so
    ln -sf libneuralnetworks.so.1.1.8 ${D}${libdir}/libneuralnetworks.so.1
    ln -sf libneuralnetworks.so.1.1.8 ${D}${libdir}/libneuralnetworks.so.1.1

    ln -sf libnnrt.so.1.1.8 ${D}${libdir}/libnnrt.so
    ln -sf libnnrt.so.1.1.8 ${D}${libdir}/libnnrt.so.1
    ln -sf libnnrt.so.1.1.8 ${D}${libdir}/libnnrt.so.1.1

    ln -sf libovxlib.so.1.1.0 ${D}${libdir}/libovxlib.so
    ln -sf libovxlib.so.1.1.0 ${D}${libdir}/libovxlib.so.1
    ln -sf libovxlib.so.1.1.0 ${D}${libdir}/libovxlib.so.1.1

    cp -r ${S}/include/OVXLIB/* ${D}/${includedir}/OVXLIB
    cp -r ${S}/include/nnrt/* ${D}/${includedir}/nnrt
}

COMPATIBLE_MACHINE = "(mx8)"
COMPATIBLE_MACHINE_mx8mm = "(^$)"
