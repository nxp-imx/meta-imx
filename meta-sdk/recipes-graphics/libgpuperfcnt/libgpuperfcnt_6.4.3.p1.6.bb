DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a"

SRC_URI[arm-fb.md5sum] = "56a6ee38f480790045f5c452deda0346"
SRC_URI[arm-fb.sha256sum] = "747698d8ac209ec32f15f56d9c5f83e519ea4277988f4fd9f636eaa15f809f8b"

SRC_URI[arm-wayland.md5sum] = "667a9612ca0652bee4df6690d5df2179"
SRC_URI[arm-wayland.sha256sum] = "716484bd33098e1ada76794d15ee24986f36e6293e639b825ff9ac17db3cb1d0"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "7d57d38f3c90fcc3c1f65f958aead07d"
SRC_URI[aarch64-fb.sha256sum] = "c341d97d78d78a381ab0f51440cbcacf84bf4e7a9e061d90b1328c518b6ad331"

SRC_URI[aarch64-wayland.md5sum] = "e693a99981e3e5318770c10796b90a92"
SRC_URI[aarch64-wayland.sha256sum] = "ceb01b49adb0dd5037bfc5c5bf25229b01d31dd9b383ca1d3bedb049597322a3"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
