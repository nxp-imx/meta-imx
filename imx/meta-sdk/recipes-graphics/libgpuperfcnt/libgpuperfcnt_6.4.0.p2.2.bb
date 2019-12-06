DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

SRC_URI[arm-fb.md5sum] = "ed23c19ee3680fb931fecc42b7aa56bf"
SRC_URI[arm-fb.sha256sum] = "741752ef5485b3127da95bad1981ec1ccce1fe80e60c4c7920be2e8b73c8d5f0"

SRC_URI[arm-wayland.md5sum] = "47dc971a44eb87d0ffa7ea3343ad16fe"
SRC_URI[arm-wayland.sha256sum] = "6d4ce04b2d34b9761186091b91d4e6202107cb24872821c1aec01bb22d932c42"

SRC_URI[arm-x11.md5sum] = "22ed82465c9cce11294cd0cda7f2e6c3"
SRC_URI[arm-x11.sha256sum] = "79e94d0c2bdfc5dc64a816fb1b46b37dcd904161740cc7f64706dfc70624f4b3"

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
