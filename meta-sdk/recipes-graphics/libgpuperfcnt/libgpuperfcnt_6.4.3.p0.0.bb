DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

SRC_URI[arm-fb.md5sum] = "a12a184a72264d78237a6a5d54aac21f"
SRC_URI[arm-fb.sha256sum] = "3eeee706a140b94625151ae88670ba39a639ea4e0437d35b04b3c351434c541a"

SRC_URI[arm-wayland.md5sum] = "dc507f42988785d13f8573efe2396da3"
SRC_URI[arm-wayland.sha256sum] = "5b0b95f8655399de611bc5d618af5787b57d5794e4ccdf3b1673090b208299f4"

SRC_URI[arm-x11.md5sum] = "05010565ba20f10b1fc2c7b70cd6e26d"
SRC_URI[arm-x11.sha256sum] = "e9f7c1981f5d1b32396dd71b4107457d657b3940ce9b9a29b60f8cf154d807b8"

SRC_URI[aarch64-fb.md5sum] = "b65c258874dd871cd033464b4d202aef"
SRC_URI[aarch64-fb.sha256sum] = "58fce62e163b740a24510edc7e0b2d8fb37c3bfabc489b51ae4daa295458fe2a"

SRC_URI[aarch64-wayland.md5sum] = "3047c8831a0be119834efd18426a4b77"
SRC_URI[aarch64-wayland.sha256sum] = "e434be6c9b8533e0c7f6c5965061a1048846e527528261f5b6b435ae22f82795"

SRC_URI[aarch64-x11.md5sum] = "3a637e262c0788398287d21f513e688b"
SRC_URI[aarch64-x11.sha256sum] = "092c5c7c298c971f5414390da3f2d3c032dc75ab3f824f9391cdce1f1e8cb39e"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
