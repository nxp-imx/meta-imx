DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=673fa34349fa40f59e0713cb0ac22b1f"

SRC_URI[arm-fb.md5sum] = "a3c72a5f7f2192b6232c73f27dd8c2eb"
SRC_URI[arm-fb.sha256sum] = "6d99e5f166e5dca7c8a62d8e4b38a39f8ba69a79579a2db85b4e2f581b228151"

SRC_URI[arm-wayland.md5sum] = "c75271d8f47f1b07c8b94e929c3c14a7"
SRC_URI[arm-wayland.sha256sum] = "f8a317627937dd6b8ac9946d0e312444769f06d0fe63b520a1a3b4a69b6ba992"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "46ff84005a6f54ce41fbd3e253f806a5"
SRC_URI[aarch64-wayland.sha256sum] = "27947ea7266beac21e0f237f25ac9bc64fe379233086dbd8ee06858793c32d51"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
