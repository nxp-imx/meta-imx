DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44" 

SRC_URI[arm-fb.md5sum] = "834adc4eaffd962fc864579922435f0f"
SRC_URI[arm-fb.sha256sum] = "1bc4c4214010911522a80f4a874e964beec6a738e5171ead67cec6a5fc72f87d"

SRC_URI[arm-wayland.md5sum] = "a1bd21d3a43f1c23ce0a6b9b0cb180ad"
SRC_URI[arm-wayland.sha256sum] = "8d9f64275de8ae7a46b642d8dfdad96fa9aedc549d6574091f6c6cbaa0d7463c"

SRC_URI[arm-x11.md5sum] = "a519d47ae07707c806b3d1dd81dddb70"
SRC_URI[arm-x11.sha256sum] = "60cd47989da27e1aab232fa26d90493e3bc23faca50f6b6c0d2c42fadab70d64"

SRC_URI[aarch64-fb.md5sum] = "b5973e5b109f0dd1a26a088ecd0e5529"
SRC_URI[aarch64-fb.sha256sum] = "4a1a509f9edf17a37f459772064d224812d7a6875bb9576286b8ef8e689e5e7f"

SRC_URI[aarch64-wayland.md5sum] = "d9233f8706f0d5646df3208eb44bf188"
SRC_URI[aarch64-wayland.sha256sum] = "0f1895bc1d6881ebcfe8057e4305e13a41a3cb30ecf0fd68685389d40c000f36"

SRC_URI[aarch64-x11.md5sum] = "9264e9e329fd0c2580fd1da2822cfda8"
SRC_URI[aarch64-x11.sha256sum] = "e62c2681635aa9c7aaea055800b9d01a573f941d9ecc1fd9b2b28194470d4beb"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
