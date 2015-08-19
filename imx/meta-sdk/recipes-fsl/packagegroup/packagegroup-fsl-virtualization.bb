# Copyright (C) 2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Freescale Package group for vitualization"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup

PACKAGES = "${PN}"

RDEPENDS_${PN} = "${@base_contains('DISTRO_FEATURES', 'x11', \
    '${VIRTUALIZATION_LAYER_TOOLS} \
    qemu', \
    '', d)} \
"

VIRTUALIZATION_LAYER_TOOLS = "${@base_contains('BBFILE_COLLECTIONS', 'virtualization-layer', \
    'libvirt \
    libvirt-libvirtd \
    libvirt-virsh \
    lxc', \
    '', d)} \
"