DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=e4098ac4459cb81b07d3f0c22b3e8370"

SRC_URI[arm-fb.md5sum] = "bb377ce6fab3129e8ad370f98830f23a"
SRC_URI[arm-fb.sha256sum] = "a46702fa5bbe9d5f816c491c32d172d9624e5c82a3ae62d8229cfdaa4e8f505f"

SRC_URI[arm-wayland.md5sum] = "785b8d50885eb4b998772220f136c847"
SRC_URI[arm-wayland.sha256sum] = "d891d343a6a2338aa36444c1c2de0a3aa43012dfafffa928e4ab4740d8fb4f98"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "93d40cb6eaf12bc17e834a2662ae8bcd"
SRC_URI[aarch64-wayland.sha256sum] = "29f36678f8c6043654460e043c3de8eef00ad6cb687d271cc471d5bd9fc8de19"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
