DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

SRC_URI[arm-fb.md5sum] = "71e4b06168bdcf9b70fab3efafd570ef"
SRC_URI[arm-fb.sha256sum] = "d6526056545b36a7645b9e199357480891df749ed191a1211953bf45dac42406"

SRC_URI[arm-wayland.md5sum] = "6c2a9b5c887360c418e37bfeddf50a81"
SRC_URI[arm-wayland.sha256sum] = "d90fd26470f6d3f0f76e2f53f079dddc78244ef2803101a94bf722b79144957b"

SRC_URI[arm-x11.md5sum] = "080da25b789b782b724d37668bd3a2f1"
SRC_URI[arm-x11.sha256sum] = "fa958ba043d48141d33250241367f9b1a4a2ecd0811ac5035a8a1c29b84daceb"

SRC_URI[aarch64-fb.md5sum] = "fa7a9bdb73681ace418f91f1ca0c260e"
SRC_URI[aarch64-fb.sha256sum] = "d396579a83273af3a1813541d86716c16d4f53e81754c1c38f3cb073c68124a2"

SRC_URI[aarch64-wayland.md5sum] = "4ac79e1dabb8def2592ea39d5e4bdf52"
SRC_URI[aarch64-wayland.sha256sum] = "fa0170f8c723377b9fd23aa8f57663525ac83bdf4e1a21523c33b59f408f2295"

SRC_URI[aarch64-x11.md5sum] = "b6d1de8ff3c00d56a768ef5f16eb1c19"
SRC_URI[aarch64-x11.sha256sum] = "0fc061971dcc31e0b947caf8ab90eb41d81406c62022fe625df30444e0b09c6a"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
