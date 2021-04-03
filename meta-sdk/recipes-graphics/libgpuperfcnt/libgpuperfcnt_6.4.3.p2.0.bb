DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=3c3fe2b904fd694f28d2f646ee16dddb"

SRC_URI[arm-fb.md5sum] = "7782f960c74223398a3471cb9c6c4f9e"
SRC_URI[arm-fb.sha256sum] = "b1efc0a04fd7b4209ff16fda9192387966e07f2b557f178ec60d0a7b7d34bb74"

SRC_URI[arm-wayland.md5sum] = "e9f6b6309223e22e3a95f3ae57c71187"
SRC_URI[arm-wayland.sha256sum] = "3be4e3b0a229f5303c193a69790e5c81ec723e03bbba7ede51f7ec9466a9204e"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "e40f019969b491c738651b191454d99d"
SRC_URI[aarch64-fb.sha256sum] = "2c55cd0e019e7909d743da97c596909711f2454cd0f292af645b2d1540080741"

SRC_URI[aarch64-wayland.md5sum] = "71d84a31c5d82cea8920bc0eaf2f581b"
SRC_URI[aarch64-wayland.sha256sum] = "a4559c7f70e4ffc4fd2ee1e8f7dba404d29cd9a24b162c2633356c8937b63788"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
