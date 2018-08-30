DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[arm-fb.md5sum] = "a0e45100eda4d7d162e4cae3845eb0bf"
SRC_URI[arm-fb.sha256sum] = "5add5a8438c65c95df7db064cd49d5c60a2e968a6134be1a4d2118ff16a218f3"

SRC_URI[arm-wayland.md5sum] = "626837d5cb3d50122de90c18c3b41d08"
SRC_URI[arm-wayland.sha256sum] = "fe3db0eabfc89203d800d63865a578d8daec50d55994b13bef190b301e8ccf29"

SRC_URI[arm-x11.md5sum] = "44049173d9b7950c0d7b2fec163b86a3"
SRC_URI[arm-x11.sha256sum] = "5f6efb4a7264b549770f68c6a0dd0d648f9cba977e6a5692999d8ee58404981e"

SRC_URI[aarch64-fb.md5sum] = "1af5c23494ad918bf745833f3a929b7c"
SRC_URI[aarch64-fb.sha256sum] = "4b20356f1f199b42624989782c39d1f737d5a34eb4533d3c049ccbf8121b3193"

SRC_URI[aarch64-wayland.md5sum] = "764e0f42586eefda95b45c419b7c55a7"
SRC_URI[aarch64-wayland.sha256sum] = "d857151a68a92f37418bda26fccc731e8b16d091abe0bf44d5313f8dd8e3795f"

SRC_URI[aarch64-x11.md5sum] = "b12b1f0fb30f3f99eb004b3b9831b136"
SRC_URI[aarch64-x11.sha256sum] = "1b6649430785f31630cc56294404aa0cc088e1d372a058a2887e1d3bc3d0cd62"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
