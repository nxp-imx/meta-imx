DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=63a38e9f392d8813d6f1f4d0d6fbe657" 

SRC_URI[arm-fb.md5sum] = "1489d300f4887262d571d869d3170994"
SRC_URI[arm-fb.sha256sum] = "d91e455843485eab79f72a57ca110ce648732aa87e6f2ecdbc6f758f186c2fd6"

SRC_URI[arm-wayland.md5sum] = "ec00d8f27aacb5fe147779e782890fe3"
SRC_URI[arm-wayland.sha256sum] = "15bec122bb9adb525717956d15d33e5c476349600ee9fdb266095f7f473b01bd"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "25ccd1ee2cc27f39cd3529027f222d5d"
SRC_URI[aarch64-wayland.sha256sum] = "ccc4366ee761525c266f230bc4f36b322ec370522ba3d5a1f704952c2635229b"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
