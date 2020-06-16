DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

SRC_URI[arm-fb.md5sum] = "22531a13ae2eb3519ddc7e3818bdc908"
SRC_URI[arm-fb.sha256sum] = "03e62218c18db0f5680b57d9b47f28209869912afd69634e6147e0749320d03a"

SRC_URI[arm-wayland.md5sum] = "e8f5217879a004c83b203853e90aed52"
SRC_URI[arm-wayland.sha256sum] = "af2f94de266259caaf7444d6e1b4fba36af70481ff1536c116f83c12be3add49"

SRC_URI[arm-x11.md5sum] = "05010565ba20f10b1fc2c7b70cd6e26d"
SRC_URI[arm-x11.sha256sum] = "e9f7c1981f5d1b32396dd71b4107457d657b3940ce9b9a29b60f8cf154d807b8"

SRC_URI[aarch64-fb.md5sum] = "a5a66f73a4bb73bca1126806244ca6dd"
SRC_URI[aarch64-fb.sha256sum] = "05f03c1f7971f1ff87bd709b9a7aeec1fb0a3c81089b7deae39fb4213eeae876"

SRC_URI[aarch64-wayland.md5sum] = "866928d8a8ecc07c822ade146d001acb"
SRC_URI[aarch64-wayland.sha256sum] = "583bd2920ab2b46a3cca15751807e0e05b36b5401b0dc6e437c6b66b9dbeda26"

SRC_URI[aarch64-x11.md5sum] = "3a637e262c0788398287d21f513e688b"
SRC_URI[aarch64-x11.sha256sum] = "092c5c7c298c971f5414390da3f2d3c032dc75ab3f824f9391cdce1f1e8cb39e"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
