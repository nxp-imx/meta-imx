# Copyright 2020 NXP

SUMMARY = "Marvell Wi-Fi support"

inherit packagegroup

RDEPENDS_${PN} = " \
    kernel-module-pcie8997 \
    linux-firmware-pcie8997 \
"
COMPATIBLE_HOST = '(aarch64|arm).*-linux'
COMPATIBLE_HOST_libc-musl = 'null'
