DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a" 

SRC_URI[arm-fb.md5sum] = "c224d2154da3f7931c26614cb33d029b"
SRC_URI[arm-fb.sha256sum] = "7dab4cf763ff67338dbb3e39659b3786864fc2266e0aa4d306aad00798fb0f79"

SRC_URI[arm-wayland.md5sum] = "49f97f6b5f522d85f27df4b5696c9c6e"
SRC_URI[arm-wayland.sha256sum] = "17bd38efe18cdb4e40fcf12a4f2e3d76069b7b52a5e1d9c5da54c5dc2f4cf6b9"

SRC_URI[arm-x11.md5sum] = "7b762ce770c985a8e8c6b49e59d0053e"
SRC_URI[arm-x11.sha256sum] = "f8b909e548db718943a0c79e49c8588ce06a5cc4e10cda959acedd1b4856eb46"

SRC_URI[aarch64-fb.md5sum] = "c8af3afd3b070d831c6e936239e75afb"
SRC_URI[aarch64-fb.sha256sum] = "784f84316136794b0d850b09731c48ac9ccc8c286d0d7665f1683eee51e8ae2f"

SRC_URI[aarch64-wayland.md5sum] = "76f803071465a947022e27658626bb7e"
SRC_URI[aarch64-wayland.sha256sum] = "1c192e00f905b8f51cb6b4859659eec93ba6a81199659ebc53159f8fc332133e"

SRC_URI[aarch64-x11.md5sum] = "d50389f51a2be33423de48ba6e32ae56"
SRC_URI[aarch64-x11.sha256sum] = "4c0c7493bcca8ced2653b9f9170c1bba22da60e55406dd557bf5827d8a803813"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
