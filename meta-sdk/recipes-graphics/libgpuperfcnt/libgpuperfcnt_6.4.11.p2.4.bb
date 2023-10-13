DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=2827219e81f28aba7c6a569f7c437fa7"

IMX_SRCREV_ABBREV = "e4ba456"

SRC_URI[arm-fb.md5sum] = "0587d51ddfc5376fe3c4f441af6e04d2"
SRC_URI[arm-fb.sha256sum] = "d3af3478d2e551572616f376d3b4ef81375cbce1e5b7acd207edd5c069424e39"

SRC_URI[arm-wayland.md5sum] = "fe4b8d8cbed60303dc6fd7573129b0b4"
SRC_URI[arm-wayland.sha256sum] = "99a804ebb7a5e80850baab77324a179be1d1062b00c29a92c50a71291fecec53"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "ebb24aa8e8654abe4f344a3de4401ba3"
SRC_URI[aarch64-wayland.sha256sum] = "07458eb1456be001674a84a0fbd4ebd2ec6d12a618e518798ada235aba9c4c05"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
