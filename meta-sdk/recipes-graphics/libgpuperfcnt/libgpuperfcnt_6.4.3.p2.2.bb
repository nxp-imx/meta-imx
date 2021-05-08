DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=3c3fe2b904fd694f28d2f646ee16dddb"

SRC_URI[arm-fb.md5sum] = "be9e10086c9471edfa250e3037513120"
SRC_URI[arm-fb.sha256sum] = "0a58e66e4c545d48272d3b9cbb059f9c64ad161acdc41323f14b2de484c71f22"

SRC_URI[arm-wayland.md5sum] = "d97735028f89404c4bca1183fd222e2e"
SRC_URI[arm-wayland.sha256sum] = "b0e9319742ceeba7d34fb2a3d2b19be59637ca1b609a4157779a2a758e53f954"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "2bdb6b7172b32ab7bce0e4e183655977"
SRC_URI[aarch64-fb.sha256sum] = "1d643a2d446e90f07ae5daeb8d0abaa605d7bd2c89b458b0107e077dc096784b"

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
