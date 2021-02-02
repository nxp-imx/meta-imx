DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=231e11849a4331fcbb19d7f4aab4a659"

SRC_URI[arm-fb.md5sum] = "ce6d23056b7467d2297defd7ffe22bda"
SRC_URI[arm-fb.sha256sum] = "cf5e414535b56c3345f9adbdf27c675ea9f8d6efd3cee0499491ddf4d9ccd09b"

SRC_URI[arm-wayland.md5sum] = "b2435cac20d602da72d38744428044fc"
SRC_URI[arm-wayland.sha256sum] = "dcc9a0928e4ac32bb1c1218bceb22c32ff79582ba05b197c284b8cce50c58f2d"

SRC_URI[arm-x11.md5sum] = "d28439180e6cade50f0081fad6adb1ea"
SRC_URI[arm-x11.sha256sum] = "c0507abd84a1d9235fe32a35d6f9817e7122af523b9e62f4575feb1c389e9587"

SRC_URI[aarch64-fb.md5sum] = "3dacf1002d95ad6934009a6c0f720221"
SRC_URI[aarch64-fb.sha256sum] = "529d7e851b8db828e4909000385d276a3a7c1e7df4e8f93ed38448b98c2a791d"

SRC_URI[aarch64-wayland.md5sum] = "9278c52924d3f8a861c52fd4eba2cd43"
SRC_URI[aarch64-wayland.sha256sum] = "8834a7408f5cb09d56476e406282b48a84c6c71389b09119a342e83cd176d28f"

SRC_URI[aarch64-x11.md5sum] = "c6a7ea6ea5f4641d6c63e6f8e879ae2f"
SRC_URI[aarch64-x11.sha256sum] = "4296614e0525c55631ef867a8968bc2dd996377c8cf72f2f742d0368231ee1e1"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
