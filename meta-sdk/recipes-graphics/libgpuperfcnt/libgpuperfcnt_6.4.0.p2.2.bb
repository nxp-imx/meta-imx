DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

SRC_URI[arm-fb.md5sum] = "b8344370980b290ed0ad83f94557b92d"
SRC_URI[arm-fb.sha256sum] = "f7f9722dff238e2450d3d6fe22bd3085dda9538585e4b7c02a798bb51a7662b0"

SRC_URI[arm-wayland.md5sum] = "7390788faed75f7a8afa8491862cd806"
SRC_URI[arm-wayland.sha256sum] = "08d1969dfb4b940a551b15897ba54ec1e38129bcb08573a971c2ca00c7c56f06"

SRC_URI[arm-x11.md5sum] = "e41e74264bac2933674691adc2f1e97d"
SRC_URI[arm-x11.sha256sum] = "c4593065a7a2f818855fd096bde7517e0372e05d88e14f822cfdd1bedcff61d3"

SRC_URI[aarch64-fb.md5sum] = "e4908fcf97c24211b86e99ebcbe04d89"
SRC_URI[aarch64-fb.sha256sum] = "175b22b912c50de5d4aec001cace14382baa0334426825b8e5cb48248c8c3adc"

SRC_URI[aarch64-wayland.md5sum] = "8d3296e367ea831cfe55979e4307d360"
SRC_URI[aarch64-wayland.sha256sum] = "b1b84302f5ad5342f665fcb51867751238e0534ebb6142af7807c79d7d51f512"

SRC_URI[aarch64-x11.md5sum] = "c9fdb36db0bf4028d567b42da9cc628c"
SRC_URI[aarch64-x11.sha256sum] = "64dc874fd1da61378663f26b3d5db9fb4472960acc329df36817b26431579b6f"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
