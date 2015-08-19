# Copyright (C) 2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Freescale Package group for minimal graphics"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"


inherit packagegroup

XSERVER ?= ""

X11_PACKAGES = "${@base_contains('DISTRO_FEATURES', 'x11', \
   'twm ${XSERVER} x11-common xclock xterm ', '', d)}"

RDEPENDS_${PN} = " \
    ${X11_PACKAGES} \
    "
