# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "7e915095b8df38a8e8bcef5667f4cdf5"
SRC_URI[sha256sum] = "1f024cabdd936f4fb1191bdeb7eeb08f1eb4a75c86416491237ce8336c796ad9"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
