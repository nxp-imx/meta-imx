# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "i.MX M4 core Demo images"
SECTION = "app"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

inherit deploy fsl-eula-unpack2

SOC ?= "imx8qm"
SOC_mx7ulp= "imx7ulp"
SOC_mx8mm= "imx8mm"
SOC_mx8mq= "imx8mq"
SOC_mx8qm= "imx8qm"
SOC_mx8qxp= "imx8qx"

IMX_PACKAGE_NAME = "${SOC}-m4-demo-${PV}"
SRC_URI_NAME = "${SOC}"

SRC_URI[imx7ulp.md5sum] = "a36cd452ae754434f9996219c8e5677c"
SRC_URI[imx7ulp.sha256sum] = "89289ea9617b456b9e6a0e8f6f8ca6d48a68da0cc666d5fbbc66e7afefdc1931"

SRC_URI[imx8mm.md5sum] = "d89683a22be9023356c9e273a35057c5"
SRC_URI[imx8mm.sha256sum] = "228bb155f9a113f13949c07576c613ccacd6d99b236ce152ef9dfdbb3de003b6"

SRC_URI[imx8qm.md5sum] = "1fc9bba172d09ec1e5dbce5d05883266"
SRC_URI[imx8qm.sha256sum] = "8403ce645d92b5703879a09d5584ce196339255685f54e94d981540f866cd8f4"

SRC_URI[imx8qx.md5sum] = "466d7b3b6213c756a3b5ebfef1a8c320"
SRC_URI[imx8qx.sha256sum] = "4e83d60e27cd8ad67d4174ad3082a5f4a06b7df93571cfd2274615cbdf66eb6c"

SCR = "SCR-${SOC}-m4-demo.txt"

do_deploy () {
   # Install the demo binaries
   cp ${D}/* ${DEPLOYDIR}/
}

addtask deploy before do_build after do_install

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx7ulp|mx8mm)"
