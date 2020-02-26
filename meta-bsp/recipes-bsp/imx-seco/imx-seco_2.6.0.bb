# Copyright 2019-2020 NXP

SUMMARY = "NXP i.MX SECO firmware"
DESCRIPTION = "NXP IMX SECO firmware"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d"

require imx-seco.inc
inherit fsl-eula-unpack deploy

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"

SRC_URI[md5sum] = "2fc67edcb4282b8939ccabe2f01312fa"
SRC_URI[sha256sum] = "6fcd9f49c9274a6d8e6010acfbb0b6474abe2a3d10ac44ac5b753f7185fd2bf0"

do_compile[noexec] = "1"

do_install[noexec] = "1"

addtask deploy after do_install
do_deploy () {
    # Deploy i.MX8 SECO firmware files
    install -m 0644 ${S}/firmware/seco/${SECO_FIRMWARE_NAME} ${DEPLOYDIR}
}

COMPATIBLE_MACHINE = "(mx8)"
COMPATIBLE_MACHINE_mx8m = "(^$)"
