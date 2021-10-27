DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=28241cb895217d7946e40e7227136d02"

SRC_URI[arm-fb.md5sum] = "3d894547e911859f39d8ec052d715248"
SRC_URI[arm-fb.sha256sum] = "325d4a2f9d44482e70641bab214e5ace20371a94063b1d8001db74866788da66"

SRC_URI[arm-wayland.md5sum] = "ccad072d78e51bea6dd5d922c24fcfd5"
SRC_URI[arm-wayland.sha256sum] = "80463cda80e3188635d42e156193669c0a7666e05c4205c6fa3ae698a7601fc4"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "ad9380466e7979e3c3e9f60d821f679d"
SRC_URI[aarch64-wayland.sha256sum] = "892b78aae62d270608974b3e1654488376aa261130d98c30b7d0b80b98905e87"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
