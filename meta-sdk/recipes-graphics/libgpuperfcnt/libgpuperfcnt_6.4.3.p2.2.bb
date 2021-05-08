DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=3c3fe2b904fd694f28d2f646ee16dddb" 

SRC_URI[arm-fb.md5sum] = "be9e10086c9471edfa250e3037513120"
SRC_URI[arm-fb.sha256sum] = "0a58e66e4c545d48272d3b9cbb059f9c64ad161acdc41323f14b2de484c71f22"

SRC_URI[arm-wayland.md5sum] = "e0788172391c5cd43d7f1ead71e0284c"
SRC_URI[arm-wayland.sha256sum] = "14c443469f142a6724eab2f7df743e93abab624ac8fc081228872ee5faafb8c9"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "cd7be7d98b6cd355b85d8eae90a360e5"
SRC_URI[aarch64-fb.sha256sum] = "213f83195febb4283eb0c33d58537453cbf3570ce06b8fbaf192607d3e47c02a"

SRC_URI[aarch64-wayland.md5sum] = "e511fa0ece1386f9cfe5eb387b3e111b"
SRC_URI[aarch64-wayland.sha256sum] = "4f0d42ddae4036be0b5c4b97701d21b5cc89c67ddd0093c866af4a1d17716635"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
