# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d"

SRC_URI[md5sum] = "4e0755bb1c6a82ee27dd7519f5a84aa3"
SRC_URI[sha256sum] = "446dddbb25ac5fc4ae30ae8828807562d0acc2fe7b0ea268bd2723d2cec4e2b7"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
