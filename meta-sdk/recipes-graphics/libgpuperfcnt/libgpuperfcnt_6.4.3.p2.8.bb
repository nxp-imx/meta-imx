DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe"

SRC_URI[arm-fb.md5sum] = "3db63524d710e116b193119a756763a4"
SRC_URI[arm-fb.sha256sum] = "a727a47df1e0fbea5805902e33c4618309755715de1ee3a43959581c65e9c6c4"

SRC_URI[arm-wayland.md5sum] = "d1d153b569fdadd14f9330c0e73905ac"
SRC_URI[arm-wayland.sha256sum] = "bf7ff96027de65e1dce243078bba4fb160dfd792c107513a5fddacb84ebaf94d"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "c0a7f2a5d190caf604bc7e8505079f81"
SRC_URI[aarch64-wayland.sha256sum] = "5bcba683a46ba31988be47d9f932e43445063dd969882e2c2e5a9d19c2b853eb"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
