DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a" 

SRC_URI[arm-fb.md5sum] = "0bd4aee1a35a4449bf5b3b8c6b6c2817"
SRC_URI[arm-fb.sha256sum] = "00ae63f9dba0df10ffaa6d2794e6af472d446c9be5a6684afe5bbf7bbdc5173e"

SRC_URI[arm-wayland.md5sum] = "b02de8f1e2f2390c10844d23b6036dc6"
SRC_URI[arm-wayland.sha256sum] = "ee3c68447a75e72897e70746dbd35e564d06dd71f021be18c3696f6efc70b7a1"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "d20e063ff2b062ead21a3b9d69b67a20"
SRC_URI[aarch64-fb.sha256sum] = "71cefa6744b89fab3c39b58c6f3b6c38d5c5b0ecf890bd7a416e173f0fbd63ed"

SRC_URI[aarch64-wayland.md5sum] = "cef1d61817a2abbdd903d2be785664ff"
SRC_URI[aarch64-wayland.sha256sum] = "3aec4f71c8cbd672df9e3dd162993c185f6d0e8ce66e0e139b742868f4f031a9"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
