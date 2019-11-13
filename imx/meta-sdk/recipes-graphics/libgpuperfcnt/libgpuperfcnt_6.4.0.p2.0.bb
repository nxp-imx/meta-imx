DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3"

SRC_URI[arm-fb.md5sum] = "75a53519a66f26ae6b3d89f9ba30830b"
SRC_URI[arm-fb.sha256sum] = "eccfd5f26355feca8549ee2820c499d156ed347a840c6c4908884018e3c108cc"

SRC_URI[arm-wayland.md5sum] = "3dc45a3d1628306be44986eec6db75e5"
SRC_URI[arm-wayland.sha256sum] = "b74933d521d6110d8db853c21a70bb02d50cd5cbc4000f80fd8a0ea4c41e06e5"

SRC_URI[arm-x11.md5sum] = "e3dda68001981a44876a1ef5960d8471"
SRC_URI[arm-x11.sha256sum] = "e0fb4f40465a9cf508a8a11c0ba38f3fdeab1a013c30eddd317e0805b80b538a"

SRC_URI[aarch64-fb.md5sum] = "b720fb2c203eb5267f74eab7a4e8eecd"
SRC_URI[aarch64-fb.sha256sum] = "927520e200f9bbfa63d71708ff53cfb3728d55994907d668aa259f0f4ca17119"

SRC_URI[aarch64-wayland.md5sum] = "7597bc00c859a7511045dbb2e839a8a4"
SRC_URI[aarch64-wayland.sha256sum] = "f304fd0e33a1cd459f39ef3f6933780ec9930252042b5c790a748e91425dfc91"

SRC_URI[aarch64-x11.md5sum] = "1f5676abf52a682bc0fbe97509494d46"
SRC_URI[aarch64-x11.sha256sum] = "22960e4f13f8e9124050defaa363c4be6cd85a9f76011264cb00eafaed2f7efb"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
