DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=63a38e9f392d8813d6f1f4d0d6fbe657"

SRC_URI[arm-fb.md5sum] = "4576f43bc59db3f829896c7bea3d8975"
SRC_URI[arm-fb.sha256sum] = "4cb621b35834fe4bea33557998a263b1caf424f51f31c97095a9902d1fb2d75d"

SRC_URI[arm-wayland.md5sum] = "c75271d8f47f1b07c8b94e929c3c14a7"
SRC_URI[arm-wayland.sha256sum] = "f8a317627937dd6b8ac9946d0e312444769f06d0fe63b520a1a3b4a69b6ba992"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "51ef173c151c9e72b36e94ab24684a97"
SRC_URI[aarch64-wayland.sha256sum] = "e45f7363c6c6717ba5cc491ce700b2d5bc771379e0ddbfbe2149f34617064ee8"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
