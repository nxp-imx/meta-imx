SUMMARY = "The firmware of Cortex(R)-M33 for Arm(R) Ethos(TM)-U NPU"
DESCRIPTION = "The firmware of Cortex(R)-M33 for Arm(R) Ethos(TM)-U NPU"
LICENSE = "Apache-2.0 & GPL-2.0-only & BSD-3-Clause"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE-2.0.txt;md5=e3fc50a88d0a364313df4b21ef20c29e \
    file://LICENSE-GPL-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://LICENSE-BSD-3.txt;md5=0858ec9c7a80c4a2cf16e4f825a2cc91 \
"

SRC_URI = "${ETHOS_U_FIRMWARE_SRC};branch=${SRCBRANCH}"
ETHOS_U_FIRMWARE_SRC ?= "git://github.com/nxp-imx/ethos-u-firmware.git;protocol=https"
SRCBRANCH = "lf-5.15.71_2.2.0"
SRCREV = "21e6f5046e92224bbf5bb86e1cb806900f60785d"

S = "${WORKDIR}/git"

do_install () {
    install -d ${D}${nonarch_base_libdir}/firmware
    install -m 0644 ${S}/ethosu_firmware ${D}${nonarch_base_libdir}/firmware
}

FILES:${PN} = "${nonarch_base_libdir}/firmware/*"
INSANE_SKIP:${PN} = "arch"

COMPATIBLE_MACHINE = "(mx93-nxp-bsp)"
