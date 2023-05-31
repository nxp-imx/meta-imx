DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=63a38e9f392d8813d6f1f4d0d6fbe657" 

SRC_URI[arm-fb.md5sum] = "a6ff393a8e9cbbf2f8fd2e71087d677c"
SRC_URI[arm-fb.sha256sum] = "b3e92fd7289dc07c2053e97cbd1c735dcbca1d724f7a0067b3472e3ca97d02b7"

SRC_URI[arm-wayland.md5sum] = "a6e0a1c0c0a59995501fa2b570142095"
SRC_URI[arm-wayland.sha256sum] = "8eaca38c4d42073d55b3e7df50e27882f49e6280052320ef284a1e730677aa81"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "5520ac2579c4b68e42d412199e11c581"
SRC_URI[aarch64-wayland.sha256sum] = "98d54cec8d5fa371e00250b73dc894b87510386fa815b9692ce01b2246ab095c"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
