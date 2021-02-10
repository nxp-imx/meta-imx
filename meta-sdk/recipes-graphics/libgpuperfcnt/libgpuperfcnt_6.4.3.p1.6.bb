DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a" 

SRC_URI[arm-fb.md5sum] = "655c3171b1de1fd236535c2de530f449"
SRC_URI[arm-fb.sha256sum] = "5c259b8f466cabc0657339dd3b196e284b7c033830c90973c6b6d6bb5272a9f2"

SRC_URI[arm-wayland.md5sum] = "931d2f4d92fdb21fba8acb3fe09f09e7"
SRC_URI[arm-wayland.sha256sum] = "1af6aaef4bf164adeceb054e484174be9ef94f44c88d0bdc3be012a6a51f44d1"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "bb9c36ef55cc98902515645514140e1e"
SRC_URI[aarch64-fb.sha256sum] = "b00d7113cc727daa7dc9f93605154a68f179e3807fe4525062d68af3ec7a8538"

SRC_URI[aarch64-wayland.md5sum] = "e49d40ed337dd4b81ac995d405038302"
SRC_URI[aarch64-wayland.sha256sum] = "b6a001b2ff31b2bf363d2ff7bb0c1f1f1ade9789bcd5ff6be4485ff424aa706c"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
