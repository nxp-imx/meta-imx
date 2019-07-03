DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3"

SRC_URI[arm-fb.md5sum] = "834adc4eaffd962fc864579922435f0f"
SRC_URI[arm-fb.sha256sum] = "1bc4c4214010911522a80f4a874e964beec6a738e5171ead67cec6a5fc72f87d"

SRC_URI[arm-wayland.md5sum] = "28f95947ac47e2e116624e56d32fb946"
SRC_URI[arm-wayland.sha256sum] = "95e6378ab9413eee2e81e5483849b9fcd675082e79cf0ce274376fa78a52e394"

SRC_URI[arm-x11.md5sum] = "c3863a3ca130b14b0c9d0ea1c88dc4b0"
SRC_URI[arm-x11.sha256sum] = "7a777808ec14617dc37cd24cb7b905c4f99714bc47c3f85db934c8e16b367aea"

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
