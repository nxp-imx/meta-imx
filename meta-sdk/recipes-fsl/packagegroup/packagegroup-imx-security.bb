# Copyright 2020-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Packagegroup for i.MX security packages"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS:${PN} = " \
    e2fsprogs-mke2fs \
    keyctl-caam \
    crypto-af-alg \
    keyutils \
    lvm2 \
    util-linux \
    ${@bb.utils.contains('MACHINE_FEATURES', 'optee', 'smw-tests', '', d)} \
"
