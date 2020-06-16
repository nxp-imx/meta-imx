DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

SRC_URI[arm-fb.md5sum] = "22531a13ae2eb3519ddc7e3818bdc908"
SRC_URI[arm-fb.sha256sum] = "03e62218c18db0f5680b57d9b47f28209869912afd69634e6147e0749320d03a"

SRC_URI[arm-wayland.md5sum] = "e8f5217879a004c83b203853e90aed52"
SRC_URI[arm-wayland.sha256sum] = "af2f94de266259caaf7444d6e1b4fba36af70481ff1536c116f83c12be3add49"

SRC_URI[arm-x11.md5sum] = "05010565ba20f10b1fc2c7b70cd6e26d"
SRC_URI[arm-x11.sha256sum] = "e9f7c1981f5d1b32396dd71b4107457d657b3940ce9b9a29b60f8cf154d807b8"

SRC_URI[aarch64-fb.md5sum] = "21e92b657d9be9ae88f905e53f46e0b9"
SRC_URI[aarch64-fb.sha256sum] = "bb11d08e010762e11021f450135d06c499bb94652ac5c91fe3c1bbb4a610c63e"

SRC_URI[aarch64-wayland.md5sum] = "866928d8a8ecc07c822ade146d001acb"
SRC_URI[aarch64-wayland.sha256sum] = "583bd2920ab2b46a3cca15751807e0e05b36b5401b0dc6e437c6b66b9dbeda26"

SRC_URI[aarch64-x11.md5sum] = "8b4b60bb28b9c49b5f8638c9cea0b647"
SRC_URI[aarch64-x11.sha256sum] = "5aa2785e8ca5ab96f441aa7275eb5206575b0b4ad0c180fccf791a0e2238bbe5"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
