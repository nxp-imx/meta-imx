DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44" 

SRC_URI[arm-fb.md5sum] = "06f025c931a3fc01cef4a648eb66a16d"
SRC_URI[arm-fb.sha256sum] = "66e2c70a8090aaeeb3db9435b60261ac43254f6854fcdfe0e878065ac9f1a2b9"

SRC_URI[arm-wayland.md5sum] = "8e0b5ccadca157471c6f986bbf86ffeb"
SRC_URI[arm-wayland.sha256sum] = "9d781ec0615e1106d1835b1d1fbc2c549e2f8ec1e7b9e52499ad9ce0ac802935"

SRC_URI[arm-x11.md5sum] = "43768381d51aea9142004cba2af8bdaf"
SRC_URI[arm-x11.sha256sum] = "5a2c90092069038ed671c5fbf0ad8c29a866b222316296425c3a639b0092e247"

SRC_URI[aarch64-fb.md5sum] = "2bcd3abb3cf242ceec0de58e70584a69"
SRC_URI[aarch64-fb.sha256sum] = "8b4a650401a34002e62bb53408d4b44c7c5e099932b4ce13c45645bf2d6356cf"

SRC_URI[aarch64-wayland.md5sum] = "75b8252f95d4f6f8e65839c38cc3c04a"
SRC_URI[aarch64-wayland.sha256sum] = "8a57ddd5af267331fabd7aaf3754da8e0a0ddd80eb0f0ab5042efdd8b156bca6"

SRC_URI[aarch64-x11.md5sum] = "0ef6d9b324e11984785e5ee1f5c3f3dc"
SRC_URI[aarch64-x11.sha256sum] = "2e04da707dd931acce20357916cdb59db44cba16a6b169fa4213e8caae89cbda"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
