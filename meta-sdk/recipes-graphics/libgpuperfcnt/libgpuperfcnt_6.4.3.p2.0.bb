DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a"

SRC_URI[arm-fb.md5sum] = "0bd4aee1a35a4449bf5b3b8c6b6c2817"
SRC_URI[arm-fb.sha256sum] = "00ae63f9dba0df10ffaa6d2794e6af472d446c9be5a6684afe5bbf7bbdc5173e"

SRC_URI[arm-wayland.md5sum] = "a9a8125aa3aed5f50cbfa5dbd5eb7324"
SRC_URI[arm-wayland.sha256sum] = "bacce5fcc9c9bfbdda0ceed7105e01a5b96d8e2f4cf87e6cc57d9e028235900d"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "d20e063ff2b062ead21a3b9d69b67a20"
SRC_URI[aarch64-fb.sha256sum] = "71cefa6744b89fab3c39b58c6f3b6c38d5c5b0ecf890bd7a416e173f0fbd63ed"

SRC_URI[aarch64-wayland.md5sum] = "337d55bc112b6330bad547f8ab4f9e6a"
SRC_URI[aarch64-wayland.sha256sum] = "73ef0f6a26efb7660cb14480cbeb36b9d4af2f4f12a9f7dfce597746dc6fc1c6"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
