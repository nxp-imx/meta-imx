DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f"

IMX_SRCREV_ABBREV = "e4ba456"

SRC_URI[arm-fb.md5sum] = "f91970f00a87f3326f4529fc733f15d2"
SRC_URI[arm-fb.sha256sum] = "4f876b323a46c4ff6141db6dd84aeccfa8d899bdc47302ae105b06c817ecd60c"

SRC_URI[arm-wayland.md5sum] = "b7a00937ecd563ff8d1fa36fec4f81a5"
SRC_URI[arm-wayland.sha256sum] = "4a039074e5f81e6b8318a212a6bcecd67a5c07e847f762b0b7ff8b6dddc2e4cb"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "66e2515f1a2f0c854298c2aadb2661be"
SRC_URI[aarch64-wayland.sha256sum] = "fa348deeb61fc54c7475cba482d085df372b01d077eb1cd50a22b671fe0672c7"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
