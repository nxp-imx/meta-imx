SUMMARY = "i.MX M4 core Demo images"
SECTION = "app"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a31dce3023402a821cfcdc1bb8dbdbc0"

inherit deploy fsl-eula-unpack

M4_SOC ?= "imx7d-sabresd"
M4_SOC_mx7 = "imx7d-sabresd"

SRC_URI = "${FSL_MIRROR}/${M4_SOC}-m4-freertos-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${M4_SOC}-m4-freertos-${PV}"

SRC_URI[md5sum] = "d6904c73b442e7f53397521b6895d3c8"
SRC_URI[sha256sum] = "957a20e4bdb5825b75d1bca0446ef88403985df03e87d06966ca1c7326136d36"

do_deploy () {
   # Install the demo binaries
   install -d ${DEPLOYDIR}
   cp ${S}/*.bin ${DEPLOYDIR}/
   ls ${DEPLOYDIR}/
}

addtask deploy before do_build after do_compile

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(imx7dsabersd)"

