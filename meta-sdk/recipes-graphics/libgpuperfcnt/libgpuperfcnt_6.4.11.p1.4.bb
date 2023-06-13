DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=673fa34349fa40f59e0713cb0ac22b1f"

IMX_SRCREV_ABBREV = "e4ba456"

SRC_URI[arm-fb.md5sum] = "6747bc995533ee3dc675c9efda6e3a35"
SRC_URI[arm-fb.sha256sum] = "69e81bb80f63faf1210d9302de90203585b2353e4d314ca6a83e1a4f3aa60ed5"

SRC_URI[arm-wayland.md5sum] = "13a923b9778e79709f9dfa40fa066a6b"
SRC_URI[arm-wayland.sha256sum] = "bcdba847aa03cc437222024e5fc28cc258082d38b1b7a35859e3a45480d65918"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "8b7e75b07fe79355d82353851ddcbfe3"
SRC_URI[aarch64-wayland.sha256sum] = "30d26d54eebb96dceca2efd6b710f838132c6f6c8d98da4c594acc4534ac1355"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
