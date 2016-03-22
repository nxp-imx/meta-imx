SUMMARY = "i.MX M4 core Demo images"
SECTION = "app"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a31dce3023402a821cfcdc1bb8dbdbc0"

inherit deploy fsl-eula-unpack

M4_SOC ?= "imx7d-sabresd"
M4_SOC_mx7 = "imx7d-sabresd"

SRC_URI = "${FSL_MIRROR}/${M4_SOC}-m4-freertos-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${M4_SOC}-m4-freertos-${PV}"

SRC_URI[md5sum] = "c2bf0e4ed90192734d04bca0fa9a8405"
SRC_URI[sha256sum] = "c01c6d9aff5623fec43a4bd2dc44b6d5b0568edbf2d683cccd780520aec69ff4"

do_deploy () {
   # Install the demo binaries
   install -d ${DEPLOYDIR}
   cp ${S}/*.bin ${DEPLOYDIR}/
   ls ${DEPLOYDIR}/
}

addtask deploy before do_build after do_compile

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx7)"

