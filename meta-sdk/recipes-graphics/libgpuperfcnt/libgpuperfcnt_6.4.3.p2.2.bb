DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=85d06b38f17b935ca11784d67075b846" 

SRC_URI[arm-fb.md5sum] = "26a7b12ff8629808aefe0b587ad0526b"
SRC_URI[arm-fb.sha256sum] = "448fa34b0284e05741f21e913d78ef018837a1b052c56eeb0745d5440a8d228f"

SRC_URI[arm-wayland.md5sum] = "8c5c851f1edebc297e5a1a488222d76e"
SRC_URI[arm-wayland.sha256sum] = "894932f5fa4f2044ca830a8fa97c5293ceecd8469e23d093ac333cefdee2b9f9"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "e8490a1290243fb6cadef20aad592c90"
SRC_URI[aarch64-fb.sha256sum] = "b68427c680dc70596952bb1f6561ecc227dd9faab62a4f72cba06dd5f8245848"

SRC_URI[aarch64-wayland.md5sum] = "e1d24978714ebed66e77c55a8315b816"
SRC_URI[aarch64-wayland.sha256sum] = "4237c8f73a03410ef51ef31e89fb4f3faea82f476ea25421a4665acb415b0838"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
