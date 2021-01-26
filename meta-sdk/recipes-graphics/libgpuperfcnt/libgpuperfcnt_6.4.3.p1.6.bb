DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a"

SRC_URI[arm-fb.md5sum] = "0e8375333d1f3a460095e8ecf6d4e71a"
SRC_URI[arm-fb.sha256sum] = "5a7f4c8a9a21cfa126da091e335ec6349d5714f442c455988f94cfb74a31a07a"

SRC_URI[arm-wayland.md5sum] = "667a9612ca0652bee4df6690d5df2179"
SRC_URI[arm-wayland.sha256sum] = "716484bd33098e1ada76794d15ee24986f36e6293e639b825ff9ac17db3cb1d0"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "b18424c68ab436595306f86a6924d9c1"
SRC_URI[aarch64-fb.sha256sum] = "2532bfc84eccdcf48c95f6b9887220c0b1620da81104712c47b9459ecf65f021"

SRC_URI[aarch64-wayland.md5sum] = "1f9115bc628909f60f4ff043a73f4ee3"
SRC_URI[aarch64-wayland.sha256sum] = "f9acd416077112b2bc9809eaeca6d0ed94a98cc6756afe45ac56f0ca51cb56a2"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
