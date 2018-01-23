# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "6c6e875dbe35db32ed68be42d526303a"
SRC_URI[sha256sum] = "1af4c688ea98132b090bec0a69b882bb3e9ba43e6f41cd5167214aee6efe1362"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
