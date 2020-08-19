# Copyright 2020 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Packagegroup to provide I.MX security packages"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} = " \
    keyctl-caam \
    keyutils \
    lvm2 \
    e2fsprogs-mke2fs \
    util-linux \
"

# SMW package only available on some i.MX SoC
RDEPENDS_${PN}_append_mx8x = "\
    smw \
"
