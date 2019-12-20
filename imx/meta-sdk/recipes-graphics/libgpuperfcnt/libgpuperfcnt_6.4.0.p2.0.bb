DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

SRC_URI[arm-fb.md5sum] = "aa7c0d0e088a86c6a713d06433e3e1ba"
SRC_URI[arm-fb.sha256sum] = "908611dc693f5c6482e2d1e62508fda18f99e03867d29f10bc2a855c862298f7"

SRC_URI[arm-wayland.md5sum] = "3dc45a3d1628306be44986eec6db75e5"
SRC_URI[arm-wayland.sha256sum] = "b74933d521d6110d8db853c21a70bb02d50cd5cbc4000f80fd8a0ea4c41e06e5"

SRC_URI[arm-x11.md5sum] = "eaab2c7988fb7c2fed8e6a7fab4943af"
SRC_URI[arm-x11.sha256sum] = "0146482ba91a4e72f13fa10d7cec22dca92ef55d61f0ba09f2fedcfa6e7b319d"

SRC_URI[aarch64-fb.md5sum] = "b720fb2c203eb5267f74eab7a4e8eecd"
SRC_URI[aarch64-fb.sha256sum] = "927520e200f9bbfa63d71708ff53cfb3728d55994907d668aa259f0f4ca17119"

SRC_URI[aarch64-wayland.md5sum] = "422184e88b66c9c2268f9d37b7fb3581"
SRC_URI[aarch64-wayland.sha256sum] = "2a231dfa932f5caaab4f8ed8b7b1d58f94b9d2e9cbe131c075c0bfb0fc00ea1c"

SRC_URI[aarch64-x11.md5sum] = "1f5676abf52a682bc0fbe97509494d46"
SRC_URI[aarch64-x11.sha256sum] = "22960e4f13f8e9124050defaa363c4be6cd85a9f76011264cb00eafaed2f7efb"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
