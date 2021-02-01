DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

SRC_URI[arm-fb.md5sum] = "6c1a2a7f8eb24f6289bc363f9cfa94ea"
SRC_URI[arm-fb.sha256sum] = "c9013d32404aa262f8a8680916035fc5590887e0c63f2e0cece302efe883c063"

SRC_URI[arm-wayland.md5sum] = "b2435cac20d602da72d38744428044fc"
SRC_URI[arm-wayland.sha256sum] = "dcc9a0928e4ac32bb1c1218bceb22c32ff79582ba05b197c284b8cce50c58f2d"

SRC_URI[arm-x11.md5sum] = "d28439180e6cade50f0081fad6adb1ea"
SRC_URI[arm-x11.sha256sum] = "c0507abd84a1d9235fe32a35d6f9817e7122af523b9e62f4575feb1c389e9587"

SRC_URI[aarch64-fb.md5sum] = "84bc36add4a58d86f34f4be0d43272df"
SRC_URI[aarch64-fb.sha256sum] = "4ca3a4e39ae96eb4cf3d79fc68c0b443a8107cfe997e073eca01f448f1b2316f"

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
