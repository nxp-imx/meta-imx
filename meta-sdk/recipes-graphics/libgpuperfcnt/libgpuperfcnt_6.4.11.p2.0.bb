DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de"

IMX_SRCREV_ABBREV = "e4ba456"

SRC_URI[arm-fb.md5sum] = "aba5dcebd00326a86fd1b81617aab392"
SRC_URI[arm-fb.sha256sum] = "4bb903a2cb28b689733b1eaca6c4e9a316a3eede136da87068f7fa753d48bba9"

SRC_URI[arm-wayland.md5sum] = "a1988eb637336d43c9580ba3e029b3d4"
SRC_URI[arm-wayland.sha256sum] = "696702e6b426419a74fc6b718ad42db6a26eb62176a997de7747520970ec65e3"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "16b183747aa7b59d957f06ebcf2fbf95"
SRC_URI[aarch64-wayland.sha256sum] = "193ff0f5ae29459cbee448c636a0a45360f6e8c2a8935b450142e36be8c80e88"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
