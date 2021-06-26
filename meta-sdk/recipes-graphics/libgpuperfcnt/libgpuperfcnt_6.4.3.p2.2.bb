DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=f35df765ff17e69043ea21f350e3229c" 

SRC_URI[arm-fb.md5sum] = "6db7f2b60b3c4dd183cc0f770c4df953"
SRC_URI[arm-fb.sha256sum] = "96964fcb220668ddc89c74456e87f15f514b6c81925cad4eb3460e4809228eca"

SRC_URI[arm-wayland.md5sum] = "29109b205d6e707f87ae15dc04c3ada6"
SRC_URI[arm-wayland.sha256sum] = "3c5b182b9d3668de2efd7416a17dc33c52386dbd0943414aa5213fcb0aaa0e38"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "63033dcfc248be2ed8e183cec78c162e"
SRC_URI[aarch64-fb.sha256sum] = "52108ea47fc0ae47fe50f4875ba0d55064445ec14cfff8fdbdca03c1a9fb2203"

SRC_URI[aarch64-wayland.md5sum] = "9f337f773a5c7d38572e11af24b716c9"
SRC_URI[aarch64-wayland.sha256sum] = "93bac8e64a71b5fee6d13dc3171999c66e841ac684ed603adcf10414afad763c"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
