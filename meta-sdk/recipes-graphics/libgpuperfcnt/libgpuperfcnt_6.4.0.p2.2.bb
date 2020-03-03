DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

SRC_URI[arm-fb.md5sum] = "b8344370980b290ed0ad83f94557b92d"
SRC_URI[arm-fb.sha256sum] = "f7f9722dff238e2450d3d6fe22bd3085dda9538585e4b7c02a798bb51a7662b0"

SRC_URI[arm-wayland.md5sum] = "7390788faed75f7a8afa8491862cd806"
SRC_URI[arm-wayland.sha256sum] = "08d1969dfb4b940a551b15897ba54ec1e38129bcb08573a971c2ca00c7c56f06"

SRC_URI[arm-x11.md5sum] = "e41e74264bac2933674691adc2f1e97d"
SRC_URI[arm-x11.sha256sum] = "c4593065a7a2f818855fd096bde7517e0372e05d88e14f822cfdd1bedcff61d3"

SRC_URI[aarch64-fb.md5sum] = "41b17059bff9b4f12dae15a3c57f2211"
SRC_URI[aarch64-fb.sha256sum] = "803adf6bd11e9c032e145850aab65c587fc106aba7a2d13cdee8ca03dc1bc164"

SRC_URI[aarch64-wayland.md5sum] = "9cc6219f56127aef21bb18173a849a21"
SRC_URI[aarch64-wayland.sha256sum] = "81f69d4757a23a3c2d49449095edbef1854752734ec63c73d7b63d57dad58fb2"

SRC_URI[aarch64-x11.md5sum] = "317ed5d45951b7d9d866826d240abbde"
SRC_URI[aarch64-x11.sha256sum] = "83a997b97ef720d14b1233c437af32bce7f8dd9699f7b818c518d37b63592a8e"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
