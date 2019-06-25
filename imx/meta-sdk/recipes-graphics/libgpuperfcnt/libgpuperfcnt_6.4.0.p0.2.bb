DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44" 

SRC_URI[arm-fb.md5sum] = "022bdcaa77dfe4cc50dca692bcd01586"
SRC_URI[arm-fb.sha256sum] = "85e6414dfd6cc35a74f8d6d78b3887202038f581d54253d548f058d27679ea4f"

SRC_URI[arm-wayland.md5sum] = "8e0b5ccadca157471c6f986bbf86ffeb"
SRC_URI[arm-wayland.sha256sum] = "9d781ec0615e1106d1835b1d1fbc2c549e2f8ec1e7b9e52499ad9ce0ac802935"

SRC_URI[arm-x11.md5sum] = "a519d47ae07707c806b3d1dd81dddb70"
SRC_URI[arm-x11.sha256sum] = "60cd47989da27e1aab232fa26d90493e3bc23faca50f6b6c0d2c42fadab70d64"

SRC_URI[aarch64-fb.md5sum] = "2ccd637617bc70abac62e4ca3db35fc4"
SRC_URI[aarch64-fb.sha256sum] = "dafaeb60e8bc2e57c4c75f727c4f9fec1c9abce904afff142155035efd9c1a73"

SRC_URI[aarch64-wayland.md5sum] = "cbf74ebadf6653f75934d7d9d1f9ec02"
SRC_URI[aarch64-wayland.sha256sum] = "f6bcc24c2fa9528ad0695872d552ad26d1a6418bb45ddec10141bbdb107eeadb"

SRC_URI[aarch64-x11.md5sum] = "402a00eec8d6cdc0ca1e1a2e7716a9e9"
SRC_URI[aarch64-x11.sha256sum] = "8a9318333ffe435bd2a8720cf530e7f85f81c25fa23491caf5f2a0e2b972baea"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
