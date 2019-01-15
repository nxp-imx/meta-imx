DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6dfb32a488e5fd6bae52fbf6c7ebb086"

SRC_URI[arm-fb.md5sum] = "c72a30690e395c1674653e84226b0799"
SRC_URI[arm-fb.sha256sum] = "9173d41111c86d3b348e8ee75c00ab6b40d25ba04a278d9cd0cc5fa4b2cebcd6"

SRC_URI[arm-wayland.md5sum] = "7aef7d7173937f0c4aa8ea6a0228d858"
SRC_URI[arm-wayland.sha256sum] = "8f597d2d8d030bc31fb482c5cdf36b4996107ec9a8abe539ec36a6dbedb27463"

SRC_URI[arm-x11.md5sum] = "abd6b2bfb66179da58e74fb30ab35b31"
SRC_URI[arm-x11.sha256sum] = "171e44a6d1951fc43c102e027adc001ba3938fc3e6558a0e5e88eaffbe5975c1"

SRC_URI[aarch64-fb.md5sum] = "15b2c08ef50ec26a6f7f46f71b7c4148"
SRC_URI[aarch64-fb.sha256sum] = "22d9194b1cd879794e53c0ea0c088ddf02b327feca8a86bfbcd1aaf98eb59ffa"

SRC_URI[aarch64-wayland.md5sum] = "6b7980e5f8c98b109fd86ffa72fb54b8"
SRC_URI[aarch64-wayland.sha256sum] = "c4ae478875919124f99f8ace0f9f9c4bfe7d1395aa05e3c9556d04aa2213ba99"

SRC_URI[aarch64-x11.md5sum] = "0c025d7e1460a29d3435aadca938ae1c"
SRC_URI[aarch64-x11.sha256sum] = "5ba5dd69af3b106a3d7828edebd65749645e720ec8f30f4f30b4634708d76255"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
