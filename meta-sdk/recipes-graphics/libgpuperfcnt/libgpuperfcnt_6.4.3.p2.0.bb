DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=3c3fe2b904fd694f28d2f646ee16dddb"

SRC_URI[arm-fb.md5sum] = "66d5b3ed66d53dd5941f526a1079c890"
SRC_URI[arm-fb.sha256sum] = "15715410036912867c2f317381cbfc97dea593fb1b127527e98f14d2de139b9f"

SRC_URI[arm-wayland.md5sum] = "e0788172391c5cd43d7f1ead71e0284c"
SRC_URI[arm-wayland.sha256sum] = "14c443469f142a6724eab2f7df743e93abab624ac8fc081228872ee5faafb8c9"

SRC_URI[arm-x11.md5sum] = "dc17cf5f92d0aab4a4b1e7a3cef4f4d3"
SRC_URI[arm-x11.sha256sum] = "43aa93d9c06430a3b4171f9cd3095d3698a44631a6fd49b2435066a6ef729e55"

SRC_URI[aarch64-fb.md5sum] = "cd7be7d98b6cd355b85d8eae90a360e5"
SRC_URI[aarch64-fb.sha256sum] = "213f83195febb4283eb0c33d58537453cbf3570ce06b8fbaf192607d3e47c02a"

SRC_URI[aarch64-wayland.md5sum] = "e511fa0ece1386f9cfe5eb387b3e111b"
SRC_URI[aarch64-wayland.sha256sum] = "4f0d42ddae4036be0b5c4b97701d21b5cc89c67ddd0093c866af4a1d17716635"

SRC_URI[aarch64-x11.md5sum] = "076ebf8b31c98536be437c212385ce21"
SRC_URI[aarch64-x11.sha256sum] = "6ae1148bf1f04433d098d03f037e346618964ff5f927dc9c303deae4b7812ac8"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
