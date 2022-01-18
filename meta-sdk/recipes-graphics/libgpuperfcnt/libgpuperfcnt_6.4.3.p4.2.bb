DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=17d2319de7baa686e8a755ba58a9ebf5"

SRC_URI[arm-fb.md5sum] = "7127690c0872038d0034bdef6227ee65"
SRC_URI[arm-fb.sha256sum] = "bd785ad1bdc02239eb390d5be23829edf7f3ec4c5e91bfa59c24e5d204a43daf"

SRC_URI[arm-wayland.md5sum] = "33609d281a8fba782ffe39cef673fcc9"
SRC_URI[arm-wayland.sha256sum] = "b54e69cdc7c16401cd3f0cd58b062ebcd031bcda819de812dbba89a463b14441"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "e8ec2dda50feea7e6440e4654a704f42"
SRC_URI[aarch64-wayland.sha256sum] = "282ba136197fe26d7a22b5635fcbe1a923fb386ea4ba96f1cc4b1078febe1b84"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
