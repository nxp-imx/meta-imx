# Copyright 2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Add packages for Vehicle-to-Everything (V2X) technology"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS:${PN} = " \
    imx-seco-libs \
    ecdsa-lib-imx \
    v2xsehsm \
    vtest \
    util-linux-fdisk \
    util-linux-rtcwake \
    e2fsprogs-resize2fs \
"

COMPATIBLE_MACHINE = "(mx8dxl-nxp-bsp)"
