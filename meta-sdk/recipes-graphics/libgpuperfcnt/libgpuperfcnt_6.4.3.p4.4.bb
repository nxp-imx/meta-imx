DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829" 

SRC_URI[arm-fb.md5sum] = "344680363e2b9cc5eedfbaf6f83df036"
SRC_URI[arm-fb.sha256sum] = "2a9e357026fef130ac0b297c49e8229771a748594a6d70ce9b2844b356fb8964"

SRC_URI[arm-wayland.md5sum] = "edfa39200d6443116eeef7c9df107cea"
SRC_URI[arm-wayland.sha256sum] = "f51fe60ca79cbad552f95d5f21ace15d82b806012e0fe745b7d6e5904e074316"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "116026c9d75f40d1287ce14e5d31b423"
SRC_URI[aarch64-wayland.sha256sum] = "4faffc5b6cbe743e350e478521896ed9d398117e0a884222e7dc64a028da6985"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
