# Copyright (C) 2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Freescale Package group for core networking tools"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup

PACKAGES = "${PN} ${PN}-server"

RDEPENDS_${PN} = " \
    ethtool \
    iproute2 \
    iproute2-tc \
    iptables \
    iputils \
    net-tools \
    ${NETWORK_LAYER_TOOLS} \
"

# These need the open embedded networking layer, meta-openembedded/meta-networking
NETWORK_LAYER_TOOLS = "${@base_contains('BBFILE_COLLECTIONS', 'networking-layer', \
    'bridge-utils \
    inetutils \
    inetutils-ftp \
    inetutils-hostname \
    inetutils-ifconfig \
    inetutils-logger \
    inetutils-ping \
    inetutils-ping6 \
    inetutils-rsh \
    inetutils-syslogd \
    inetutils-telnet \
    inetutils-tftp \
    inetutils-traceroute \
    ipsec-tools \
    tcpdump', \
    '', d)} \
"
RDEPENDS_${PN}-server = "${@base_contains('BBFILE_COLLECTIONS', 'networking-layer', \
    'inetutils-inetd \
    inetutils-ftpd \
    inetutils-rshd \
    inetutils-tftpd \
    inetutils-telnetd', \
    '', d)} \
"