DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3"

SRC_URI[arm-fb.md5sum] = "b52b2c60fe32acedf3e9a47e3a1f9d70"
SRC_URI[arm-fb.sha256sum] = "55dc08200656338a2271f8b17c5328beeb2b7e3d41e2a13fb160e62dc38bf71b"

SRC_URI[arm-wayland.md5sum] = "ac25f6501935cab681c43581ab41542a"
SRC_URI[arm-wayland.sha256sum] = "ab356e44c18660a01a85bbd47d0a7092dad19841ebea9c1118f089843c004e9f"

SRC_URI[arm-x11.md5sum] = "8e42a47059046b1f3466344208e61bd3"
SRC_URI[arm-x11.sha256sum] = "76904cb20bc160507852ac54c94b947b9b2c1c99735ffc44f59b70175540b0cf"

SRC_URI[aarch64-fb.md5sum] = "2ca5bc81c116cbc072b6e44ebee64ce2"
SRC_URI[aarch64-fb.sha256sum] = "19dfd9a6fd95d0a1ae4166d46b5b865d37920bb0052adff0b20d889f3ae72f37"

SRC_URI[aarch64-wayland.md5sum] = "7597bc00c859a7511045dbb2e839a8a4"
SRC_URI[aarch64-wayland.sha256sum] = "f304fd0e33a1cd459f39ef3f6933780ec9930252042b5c790a748e91425dfc91"

SRC_URI[aarch64-x11.md5sum] = "6392b49bf5ecc7bdc0e9dbb01b3e3275"
SRC_URI[aarch64-x11.sha256sum] = "6da0dc92e906713268c97da409ff11678007606617ebb8e2e9c084f8ea53927f"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
