# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "e438eda8460aa18536036df2284fde8b"
SRC_URI[sha256sum] = "aae3ae2a4d994bcd1d5bb4448865c853a097985d7ecb356f10c880cfa9f87ce6"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
