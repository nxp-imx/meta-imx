# Copyright 2020-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Packagegroup for i.MX security packages"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} = " \
    e2fsprogs-mke2fs \
    keyctl-caam \
    keyutils \
    lvm2 \
    smw-tests \
    util-linux \
"
