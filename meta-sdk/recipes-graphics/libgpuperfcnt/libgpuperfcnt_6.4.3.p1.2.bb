DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a" 

SRC_URI[arm-fb.md5sum] = "c224d2154da3f7931c26614cb33d029b"
SRC_URI[arm-fb.sha256sum] = "7dab4cf763ff67338dbb3e39659b3786864fc2266e0aa4d306aad00798fb0f79"

SRC_URI[arm-wayland.md5sum] = "49f97f6b5f522d85f27df4b5696c9c6e"
SRC_URI[arm-wayland.sha256sum] = "17bd38efe18cdb4e40fcf12a4f2e3d76069b7b52a5e1d9c5da54c5dc2f4cf6b9"

SRC_URI[arm-x11.md5sum] = "7b762ce770c985a8e8c6b49e59d0053e"
SRC_URI[arm-x11.sha256sum] = "f8b909e548db718943a0c79e49c8588ce06a5cc4e10cda959acedd1b4856eb46"

SRC_URI[aarch64-fb.md5sum] = "57749cdb39ca585483e9fcd70a2adfda"
SRC_URI[aarch64-fb.sha256sum] = "dee4cae980bb4babbc699c2299f69d11425866e513d6f001220d1752cd8ccea1"

SRC_URI[aarch64-wayland.md5sum] = "ff867ab7666bd765be545daae5fb9d5c"
SRC_URI[aarch64-wayland.sha256sum] = "14c266f6d6cce04fff162867fb7e765d25c4236c4b9ab34f3beb19226c77a0c9"

SRC_URI[aarch64-x11.md5sum] = "91ce70a0e6c0ecf337a2290f737ceeb3"
SRC_URI[aarch64-x11.sha256sum] = "198c4e48d2c0ee4691a02e398207f5de94f9123265fb119058b4bedbce17cf41"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
