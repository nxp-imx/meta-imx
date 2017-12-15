# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "46f8b60c32def69280131428e638ede9"
SRC_URI[sha256sum] = "e337ba50cb68ccaeb223aef1d79a5a2729cef1f6762b413ed0b0a4902792c513"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
