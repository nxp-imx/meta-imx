DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=03bcadc8dc0a788f66ca9e2b89f56c6f"

SRC_URI[arm-fb.md5sum] = "46b3a9bf9381ff2cbba5823636d62a99"
SRC_URI[arm-fb.sha256sum] = "8088718cadfbaa562c6059187ac4ed95bd1f3b7139cc41a3c9c6967e69a8f1e4"

SRC_URI[arm-wayland.md5sum] = "466f66646d567a19f9048d11b7bab354"
SRC_URI[arm-wayland.sha256sum] = "dd8b1f9a20cce47ca926c0cc677b33118ed50ae698a147d842375db595508794"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "29b3c472c3e509853ced72a6a1a9ceac"
SRC_URI[aarch64-wayland.sha256sum] = "bef1e9859c495e14a4402aaa5b87adaa50e0889fb674c25bc35dd40bb50995a7"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
