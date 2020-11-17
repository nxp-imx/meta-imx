# Copyright 2020 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Packagegroup for i.MX security packages"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

# SMW package only available on some i.MX SoC
SMW-TESTS = ""
SMW-TESTS_mx8x = "smw-tests"
SMW-TESTS_mx8dxl = "smw-tests"

RDEPENDS_${PN} = " \
    e2fsprogs-mke2fs \
    keyctl-caam \
    keyutils \
    lvm2 \
    ${SMW-TESTS} \
    util-linux \
"
