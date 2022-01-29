DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=e4098ac4459cb81b07d3f0c22b3e8370"

SRC_URI[arm-fb.md5sum] = "bbfebc5b31b2e5f13a0fa03124ab3ab5"
SRC_URI[arm-fb.sha256sum] = "4cc5db8826d914c94f5ba6e7b53c61eaae4d8b0d109a3ff9a05884f597a14e53"

SRC_URI[arm-wayland.md5sum] = "e034ec8327ca3157d168235edbcdb2d5"
SRC_URI[arm-wayland.sha256sum] = "52c5152b0d03983f3b79e7283e709afb7d3106e7203f2577d0668adc4b0ceed0"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "a4bbd2309d3e762d040c5a92b35e224f"
SRC_URI[aarch64-wayland.sha256sum] = "c251f9266df11e1c759eaa5a79cfda1fead327d1b9dcb5d73b948ba8a67e88c3"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
