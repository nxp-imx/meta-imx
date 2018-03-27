# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=6bd2df2910a2234bf6f419b7d2f531a3"

SRC_URI[md5sum] = "02efa1d778b184bbc5b9272ee06272d7"
SRC_URI[sha256sum] = "8d097c24e0971a9972a07ef7a5caadb569ba5c5c11f7c45057abd23a39dc28e6"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
