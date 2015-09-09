# Copyright (C) 2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Freescale Package group for benchmarks"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup

PACKAGES = "${PN}-core ${PN}-extended"

FSL_NEON = "${@bb.utils.contains('TUNE_FEATURES', 'neon', 'cpuburn-neon', '', d)}"

RDEPENDS_${PN}-core = "\
    iperf \
    iozone3 \
    lmbench \
"

RDEPENDS_${PN}-extended = " \
    bonnie++ \
    dbench \
    nbench-byte \
    ${FSL_NEON} \
    ${PN}-core \
"
