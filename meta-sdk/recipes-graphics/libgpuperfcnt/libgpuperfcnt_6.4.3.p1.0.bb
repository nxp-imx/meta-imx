DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

SRC_URI[arm-fb.md5sum] = "205217a2c8d5a668d6421cad1700825e"
SRC_URI[arm-fb.sha256sum] = "2f2559aba2dcbb5fcace95d95833d2056f96aea776038016b65105121f06d858"

SRC_URI[arm-wayland.md5sum] = "52272beae2033116a01f4a0435e9b296"
SRC_URI[arm-wayland.sha256sum] = "5273465493842178d2fa09efdf741e631cfca3ffdb7641b3355525bcc27e17bd"

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
