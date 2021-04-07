DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=3c3fe2b904fd694f28d2f646ee16dddb" 

SRC_URI[arm-fb.md5sum] = "7782f960c74223398a3471cb9c6c4f9e"
SRC_URI[arm-fb.sha256sum] = "b1efc0a04fd7b4209ff16fda9192387966e07f2b557f178ec60d0a7b7d34bb74"

SRC_URI[arm-wayland.md5sum] = "e0788172391c5cd43d7f1ead71e0284c"
SRC_URI[arm-wayland.sha256sum] = "14c443469f142a6724eab2f7df743e93abab624ac8fc081228872ee5faafb8c9"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "f59c2f9203ad54493e3d5a0053819111"
SRC_URI[aarch64-fb.sha256sum] = "5fa01b100f22472e17bcfaa7cca07dc537e2648382a6f2138f456ff8d4c6073d"

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
