# Copyright (C) 2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Freescale Package group for extended tools"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup

PACKAGES = "${PN}"

X11_TOOLS = "${@base_contains('DISTRO_FEATURES', 'x11', \
    'lsb \
    lsbinitscripts \
    lsbtest ', '', d)} \
"

IMX_TOOLS = ""
IMX_TOOLS_imx = "imx-kobs"

SOC_TOOLS_TEST = ""
SOC_TOOLS_TEST_vf  = "imx-test"
SOC_TOOLS_TEST_mxs = "imx-test"
SOC_TOOLS_TEST_mx3 = "imx-test"
SOC_TOOLS_TEST_mx5 = "imx-test"
SOC_TOOLS_TEST_mx6 = "imx-test"
SOC_TOOLS_TEST_mx7 = "imx-test"

ADL_NETWORK_LAYER_TOOLS = "${@base_contains('BBFILE_COLLECTIONS', 'networking-layer', \
    'strongswan', '', d)} \
"

RDEPENDS_${PN} = "\
    bc \
    chkconfig \
    cronie \
    db \
    debianutils \
    lsof \
    man \
    man-pages \
    oprofile \
    parted \
    perf \
    rng-tools \
    rt-tests \
    sqlite3 \
    texinfo \
    unzip \
    usbutils \
    usbutils-ids \
    watchdog \
    which \
    xz  \
    zip \
    ${X11_TOOLS} \
    ${SOC_TOOLS_TEST} \
    ${IMX_TOOLS} \
    ${ADL_NETWORK_LAYER_TOOLS} \
"
