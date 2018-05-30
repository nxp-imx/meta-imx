# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "i.MX M4 core Demo images"
SECTION = "app"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d"
LIC_FILES_CHKSUM_mx8mm = "file://COPYING;md5=ab61cab9599935bfe9f700405ef00f28"
LIC_FILES_CHKSUM_mx8qm = "file://COPYING;md5=ab61cab9599935bfe9f700405ef00f28"

inherit deploy fsl-eula-unpack2

SOC ?= "imx8qm"
SOC_mx7ulp= "imx7ulp"
SOC_mx8mm= "imx8mm"
SOC_mx8mq= "imx8mq"
SOC_mx8qm= "imx8qm"
SOC_mx8qxp= "imx8qx"

IMX_PACKAGE_NAME = "${SOC}-m4-demo-${PV}"
SRC_URI_NAME = "${SOC}"

SRC_URI[imx7ulp.md5sum] = "cf2c88b91b4f87781365d8b0921d1cf3"
SRC_URI[imx7ulp.sha256sum] = "f4852a8da27bec0853ef499614d9337d586749805bc2c3d58500a7016ae52bdb"

SRC_URI[imx8mm.md5sum] = "9e03cb274e66d118db0c7d94b535aa8b"
SRC_URI[imx8mm.sha256sum] = "0ac2bade7342c9137aead41482cc91938159c37ea678c06df5bc3be5b06f2e64"

SRC_URI[imx8qm.md5sum] = "39eb5e7482c681bfc6a25579b0203e3a"
SRC_URI[imx8qm.sha256sum] = "cf240c15c4671fbc637aa1f7f1ad8702cceac91c60d119db926b785d622fa3cc"

SCR = "SCR-${SOC}-m4-demo.txt"

do_deploy () {
   # Install the demo binaries
   cp ${D}/* ${DEPLOYDIR}/
}

addtask deploy before do_build after do_install

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx7ulp|mx8mm|mx8qm)"
