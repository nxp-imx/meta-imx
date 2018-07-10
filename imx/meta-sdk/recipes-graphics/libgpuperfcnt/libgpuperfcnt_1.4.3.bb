DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ab61cab9599935bfe9f700405ef00f28"

SRC_URI[arm-fb.md5sum] = "9d46143eb0e309fccfd8641ead53a2ad"
SRC_URI[arm-fb.sha256sum] = "77cab654faf3adda1b047a68e8dedeb4c38222a31d59ea4447db4d7cb72c0971"

SRC_URI[arm-wayland.md5sum] = "4f097d012cce066291adf056abb520f4"
SRC_URI[arm-wayland.sha256sum] = "697a5423323a7452cd2e7ea3ee587c2d24351ab43251fa8c809ba8fdee4e056f"

SRC_URI[arm-x11.md5sum] = "f87b188725952a94fcb43e01b00303e4"
SRC_URI[arm-x11.sha256sum] = "d803516a43ae560c1892a3c12e75fa9076fbf43c58e320ee566a516bb1fb50bf"

SRC_URI[aarch64-fb.md5sum] = "1af5c23494ad918bf745833f3a929b7c"
SRC_URI[aarch64-fb.sha256sum] = "4b20356f1f199b42624989782c39d1f737d5a34eb4533d3c049ccbf8121b3193"

SRC_URI[aarch64-wayland.md5sum] = "764e0f42586eefda95b45c419b7c55a7"
SRC_URI[aarch64-wayland.sha256sum] = "d857151a68a92f37418bda26fccc731e8b16d091abe0bf44d5313f8dd8e3795f"

SRC_URI[aarch64-x11.md5sum] = "9880c072364f132c3ac21784c1ca911d"
SRC_URI[aarch64-x11.sha256sum] = "237d0bef4eeff197932d2bf6c7d226d9724ad2bb6742fe578f3d2f9719d9b664"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
