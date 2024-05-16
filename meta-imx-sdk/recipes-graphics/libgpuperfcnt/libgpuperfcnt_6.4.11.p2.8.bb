DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a" 

IMX_SRCREV_ABBREV = "99ab423"

SRC_URI[arm-fb.md5sum] = "49271fbee4d31ba0636408ee46ed7e50"
SRC_URI[arm-fb.sha256sum] = "6d44cbcccde1ab5b063da62cdc53398038b6407a77ceb1f8e355423e764bcadf"

SRC_URI[arm-wayland.md5sum] = "c52e3995592aa1b89ba34ec365847b7d"
SRC_URI[arm-wayland.sha256sum] = "22a9fb0ef5fb154a5a20aac9731ecb767719572f5a3a8bac9522abc3037ececd"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "09aace277ae0139b20a34b14baa7a43e"
SRC_URI[aarch64-wayland.sha256sum] = "fb439f50f588d04b9f92b7af493c60bebf92b7ca102aa65a78036fccb152a971"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
