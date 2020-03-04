DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

SRC_URI[arm-fb.md5sum] = "add84b473b8e8ed77646b6cbdc2c322d"
SRC_URI[arm-fb.sha256sum] = "d90b816dd5b8fd455652e23fc5fc66f39c17c80c97333c5fe7021e5ad8642ea2"

SRC_URI[arm-wayland.md5sum] = "49c6e7f177399164f192aac984019ccf" 
SRC_URI[arm-wayland.sha256sum] = "18032a489df12a5e3a138dee10bef86b6114e5cba039f075832c979c6d343bf3"

SRC_URI[arm-x11.md5sum] = "98fe6b70c44d9965c10570d08c9356ab" 
SRC_URI[arm-x11.sha256sum] = "68f0ce1456fd1273af7daa7dfef76ab9e2b61d19995ae159f8bfe92962ebefb5"

SRC_URI[aarch64-fb.md5sum] = "5075cdf6f1e9ce688ca0da5ca043730a"
SRC_URI[aarch64-fb.sha256sum] = "f75457825480a9fcfe28dd7ced77242d9a050d759838a682ae0a83d36b62538f"

SRC_URI[aarch64-wayland.md5sum] = "5ffb42175a9cd1eae5257f70e75a7a13"
SRC_URI[aarch64-wayland.sha256sum] = "5e56b43d4eea6f330454720e6c69192c652f4986255f9e58bd0aa20c31d0f51b"

SRC_URI[aarch64-x11.md5sum] = "8d4557636a7c5c6f22a888834c9d771a"
SRC_URI[aarch64-x11.sha256sum] = "f7031793be9c47cd7c585b46ff11ecde664f8a1c1865d40f885d2263c1b1e53d"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
