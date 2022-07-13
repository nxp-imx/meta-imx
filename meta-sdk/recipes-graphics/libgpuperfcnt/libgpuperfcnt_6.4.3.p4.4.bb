DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=37cb2d8c2bcf8bf2fbe0366d5d928c29"

SRC_URI[arm-fb.md5sum] = "3c15d7a605a8aac8ac0775b2f523c2ee"
SRC_URI[arm-fb.sha256sum] = "c84550b68aac4e3336a42d0b20fb8047f6cdf26240501373379d5df09f709d26"

SRC_URI[arm-wayland.md5sum] = "46d6aeb1a3c7c214e17b0d575e774486"
SRC_URI[arm-wayland.sha256sum] = "65116d7d23a99c7b6910e434e052289cf111f05ebd6aa8def8403837cfc98be4"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "11c0a034ba73ba402d703fd322cc8510"
SRC_URI[aarch64-wayland.sha256sum] = "632d1cf37c08bc3f01f305710865bf3d24a8738920e2df95248c576d749544e3"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
