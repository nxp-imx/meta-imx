DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

SRC_URI[arm-fb.md5sum] = "add84b473b8e8ed77646b6cbdc2c322d"
SRC_URI[arm-fb.sha256sum] = "d90b816dd5b8fd455652e23fc5fc66f39c17c80c97333c5fe7021e5ad8642ea2"

SRC_URI[arm-wayland.md5sum] = "49c6e7f177399164f192aac984019ccf"
SRC_URI[arm-wayland.sha256sum] = "18032a489df12a5e3a138dee10bef86b6114e5cba039f075832c979c6d343bf3"

SRC_URI[arm-x11.md5sum] = "98fe6b70c44d9965c10570d08c9356ab"
SRC_URI[arm-x11.sha256sum] = "68f0ce1456fd1273af7daa7dfef76ab9e2b61d19995ae159f8bfe92962ebefb5"

SRC_URI[aarch64-fb.md5sum] = "41b17059bff9b4f12dae15a3c57f2211"
SRC_URI[aarch64-fb.sha256sum] = "803adf6bd11e9c032e145850aab65c587fc106aba7a2d13cdee8ca03dc1bc164"

SRC_URI[aarch64-wayland.md5sum] = "9cc6219f56127aef21bb18173a849a21"
SRC_URI[aarch64-wayland.sha256sum] = "81f69d4757a23a3c2d49449095edbef1854752734ec63c73d7b63d57dad58fb2"

SRC_URI[aarch64-x11.md5sum] = "8d4557636a7c5c6f22a888834c9d771a"
SRC_URI[aarch64-x11.sha256sum] = "f7031793be9c47cd7c585b46ff11ecde664f8a1c1865d40f885d2263c1b1e53d"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
