DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a"

SRC_URI[arm-fb.md5sum] = "0e8375333d1f3a460095e8ecf6d4e71a"
SRC_URI[arm-fb.sha256sum] = "5a7f4c8a9a21cfa126da091e335ec6349d5714f442c455988f94cfb74a31a07a"

SRC_URI[arm-wayland.md5sum] = "fde6c5ab65bee66d10c9d3b0f8292e1f"
SRC_URI[arm-wayland.sha256sum] = "79d7b6059dc10c65ee0eb695e5e43ae103c6018ec9b70820eab3a8912a474dd1"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "b18424c68ab436595306f86a6924d9c1"
SRC_URI[aarch64-fb.sha256sum] = "2532bfc84eccdcf48c95f6b9887220c0b1620da81104712c47b9459ecf65f021"

SRC_URI[aarch64-wayland.md5sum] = "510221ebc27ef61f67469824cb6bb5c8"
SRC_URI[aarch64-wayland.sha256sum] = "2ddedab631ee01869f8c74a180527f7038297e7d0bf636e6ec922667783295d6"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
