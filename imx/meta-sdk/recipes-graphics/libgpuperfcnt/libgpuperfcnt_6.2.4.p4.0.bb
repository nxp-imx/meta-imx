DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=80c0478f4339af024519b3723023fe28"

SRC_URI[arm-fb.md5sum] = "5f039a673b2e753178c60078338b121a"
SRC_URI[arm-fb.sha256sum] = "33fe43ca064e31758f30e9586208eb39892e9d1a3f4fa1a8d80eb1c417d9a4fa"

SRC_URI[arm-wayland.md5sum] = "46e50165a35195baf2affe340b91f6f2"
SRC_URI[arm-wayland.sha256sum] = "9f0877e4ccb316fece92b3a9a96e4443ed8ca6a022a88659f4b7363f06e450c0"

SRC_URI[arm-x11.md5sum] = "410e8883800f6428d95904e1e157a959"
SRC_URI[arm-x11.sha256sum] = "59537077ee81aa3e00b08b01813220acf7082e21bb9bea1afad685a1d7efbb60"

SRC_URI[aarch64-fb.md5sum] = "03419f8714f56b0f6c936bca29485744"
SRC_URI[aarch64-fb.sha256sum] = "4e9a8ccf8a48eff3855f79de2b4159b42b8d9361e6cf8ce09d6eea94d27054ec"

SRC_URI[aarch64-wayland.md5sum] = "aa0bc0fd43e7ccc3b276e880282de8fe"
SRC_URI[aarch64-wayland.sha256sum] = "7e1f30cd4c6114427a3a5418d8c60239fa1219935d96ae37e944ea4b3ac49b93"

SRC_URI[aarch64-x11.md5sum] = "611a6d44b13f2cbb98e0ea3176191d7d"
SRC_URI[aarch64-x11.sha256sum] = "8b782d7b37fbf6ba4990aa8d36cd8c36789838a43a66300769e61d724b461b0c"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
