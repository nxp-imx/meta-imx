# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=ab61cab9599935bfe9f700405ef00f28"

SRC_URI[md5sum] = "e8926ae866aaeb07b4d9e8da2dde3f1f"
SRC_URI[sha256sum] = "debdd579833ed826cf5e4d6a28ba55633940fb461dfe35ece9a7e92406ba5666"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
