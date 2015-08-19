# Copyright (C) 2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Freescale Package group for extended networking tools"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup

PACKAGES = "${PN}"

RDEPENDS_${PN} = " \
    bind \
    curl \
    dhcp-client \
    linuxptp \
    ppp \
    ppp-dialin \
    resolvconf \
    samba \
    wget \
    xinetd \
    ${FSL_WEBSERVER} \
    ${EXTENDED_NETWORK_LAYER_TOOLS} \
"

FSL_WEBSERVER ?= ""

# These need the open embedded networking layer, meta-openembedded/meta-networking
EXTENDED_NETWORK_LAYER_TOOLS = "${@base_contains('BBFILE_COLLECTIONS', 'networking-layer', \
    'libnfnetlink \
    ntpdate \
    ptpd \
    rp-pppoe', \
    '', d)} \
"