DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d3c315c6eaa43e07d8c130dc3a04a011"

SRC_URI[arm-fb.md5sum] = "14530b6d582580e23fa3e664e89312b3"
SRC_URI[arm-fb.sha256sum] = "4702c1288b9c0401ee0c40175c460c303af37aec3136992be15c2cfee0d06011"

SRC_URI[arm-wayland.md5sum] = "4a67aa750f226393ffcbbd2044c94d6b"
SRC_URI[arm-wayland.sha256sum] = "a05758de971213e27da78bde631ddb97c0a0430a95fdefa15d8df8054a7bf131"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "9688b178d1b7d2f6b88eb3ce05723391"
SRC_URI[aarch64-wayland.sha256sum] = "6b69760048894696a3c4f3b7d254fc979832f4c9dd86629663e805b7807cca87"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
