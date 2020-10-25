DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

SRC_URI[arm-fb.md5sum] = "87a9a0e12bd46057c0054feb45b90817"
SRC_URI[arm-fb.sha256sum] = "b4d946e05bccfd44754227bbc63d1dad201e19c5ce78e0bb2fc7967df4ec8345"

SRC_URI[arm-wayland.md5sum] = "b2435cac20d602da72d38744428044fc"
SRC_URI[arm-wayland.sha256sum] = "dcc9a0928e4ac32bb1c1218bceb22c32ff79582ba05b197c284b8cce50c58f2d"

SRC_URI[arm-x11.md5sum] = "d28439180e6cade50f0081fad6adb1ea"
SRC_URI[arm-x11.sha256sum] = "c0507abd84a1d9235fe32a35d6f9817e7122af523b9e62f4575feb1c389e9587"

SRC_URI[aarch64-fb.md5sum] = "0a64c4b3c23b5b7e7af59a5a3ae7ed41"
SRC_URI[aarch64-fb.sha256sum] = "bfa090cba8de6ee3fabfeefd1ee402d702da5fa2d8bf58bfe0417693e854a515"

SRC_URI[aarch64-wayland.md5sum] = "9fb0ceaf0fc02a996a106b44789b837d"
SRC_URI[aarch64-wayland.sha256sum] = "1771d8c81d8496cc00af80802f7747d9bbdd7bed47b14d31d572f3e439039a1e"

SRC_URI[aarch64-x11.md5sum] = "2100a1fc58473c71eb74765b167911fb"
SRC_URI[aarch64-x11.sha256sum] = "ab3f8703f5cdcb6edc4d3a1f1ebb9f97b4b485ddcbc5ca3365f802b1410e0b99"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
