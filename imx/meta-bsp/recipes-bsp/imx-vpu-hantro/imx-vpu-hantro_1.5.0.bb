# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "b00d7da104cf12bdc2c0a145bf42e111"
SRC_URI[sha256sum] = "48435a9401c270fd5c75ee18d42d2de2bc1b2395a34f8db88cdb7fa88f31463e"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
