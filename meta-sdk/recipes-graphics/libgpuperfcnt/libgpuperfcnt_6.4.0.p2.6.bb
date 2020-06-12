DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

SRC_URI[arm-fb.md5sum] = "045853f75659d3de7a1ff0acb33f5a7d"
SRC_URI[arm-fb.sha256sum] = "d44f11de104130ff5135cd595afa325f78d95b6d9e9c0a44342a3267bafe0f7f"

SRC_URI[arm-wayland.md5sum] = "e8f5217879a004c83b203853e90aed52"
SRC_URI[arm-wayland.sha256sum] = "af2f94de266259caaf7444d6e1b4fba36af70481ff1536c116f83c12be3add49"

SRC_URI[arm-x11.md5sum] = "4c8daba0829cc93062feac1a2b3d8348"
SRC_URI[arm-x11.sha256sum] = "0244ae2d43f9903394d0176f7316ea9ff15482930a30a75b00a8318b7227081c"

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
