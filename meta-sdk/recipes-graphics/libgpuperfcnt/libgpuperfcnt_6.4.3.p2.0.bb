DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=3c3fe2b904fd694f28d2f646ee16dddb" 

SRC_URI[arm-fb.md5sum] = "c0f5ee3f5894eb0ef1a7410a4891faf1"
SRC_URI[arm-fb.sha256sum] = "b346ef90b0f86b449636b3f99adb6d993f7dbf1f237592d349c18d89bd05b140"

SRC_URI[arm-wayland.md5sum] = "b7ed2436aa23e4f610e7e167a8a63f2e"
SRC_URI[arm-wayland.sha256sum] = "d2a6ee4e5dcf3f3c5942bdbc32df99a0d0152ec412bcdc68d815dbf46c0140e5"

SRC_URI[arm-x11.md5sum] = "dc17cf5f92d0aab4a4b1e7a3cef4f4d3"
SRC_URI[arm-x11.sha256sum] = "43aa93d9c06430a3b4171f9cd3095d3698a44631a6fd49b2435066a6ef729e55"

SRC_URI[aarch64-fb.md5sum] = "c0f6189cdef503be78e7790c31b8c53f"
SRC_URI[aarch64-fb.sha256sum] = "c7468250ca2e0ea66172d3fd4d93b422bc2e8f3a7d717b00c9f3c5acb7079f22"

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
