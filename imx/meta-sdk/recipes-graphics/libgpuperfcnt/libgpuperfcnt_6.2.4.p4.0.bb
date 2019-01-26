DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=80c0478f4339af024519b3723023fe28"

SRC_URI[arm-fb.md5sum] = "ccbe8eb25c5985571f0871fc1f2ebb00"
SRC_URI[arm-fb.sha256sum] = "e9706130b179f2a62cfc4c2b451791039b74a37e1291b44d8bfe5ac66af09933"

SRC_URI[arm-wayland.md5sum] = "110ff5b01d5a0263fb155e2f7eaabb57"
SRC_URI[arm-wayland.sha256sum] = "c4e76b3be425c5dc6af698f1dea43c0956a5782961597b3b52ed42b4b2376732"

SRC_URI[arm-x11.md5sum] = "178c9317d513fe8ab24157199f50619b"
SRC_URI[arm-x11.sha256sum] = "77be63020f8dd3142e1febf602a18e0e0b396b27f20f622f7bf9030819194248"

SRC_URI[aarch64-fb.md5sum] = "15b2c08ef50ec26a6f7f46f71b7c4148"
SRC_URI[aarch64-fb.sha256sum] = "22d9194b1cd879794e53c0ea0c088ddf02b327feca8a86bfbcd1aaf98eb59ffa"

SRC_URI[aarch64-wayland.md5sum] = "dd8e2d74363484bab992f95574c86af8"
SRC_URI[aarch64-wayland.sha256sum] = "f6b8e6d1f54d25568167483cc3f4082cc8535635d6e1ec2d98eea57f0231a0b2"

SRC_URI[aarch64-x11.md5sum] = "6581c14aadacdcec15d23faf63d56b4e"
SRC_URI[aarch64-x11.sha256sum] = "10d2b2b4f5f0f57dd66f7acac1916c498cccb0fbaabf28873b45606cb03ef537"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
