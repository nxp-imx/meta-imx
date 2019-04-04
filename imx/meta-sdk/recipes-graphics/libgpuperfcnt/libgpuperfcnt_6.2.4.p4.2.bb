DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=80c0478f4339af024519b3723023fe28" 

SRC_URI[arm-fb.md5sum] = "153367531f88815b0472f27dcabdfd3b"
SRC_URI[arm-fb.sha256sum] = "752a5e1a822070a598c632b90cbf055c123a826b7784515dca1a2725ad08c027"

SRC_URI[arm-wayland.md5sum] = "a239a807dd644c14fae1c42b3b18f6a2"
SRC_URI[arm-wayland.sha256sum] = "2f541922ad6a95ce4966479182bd24991dc8a91f197c66d8534c97892155655e"

SRC_URI[arm-x11.md5sum] = "14aefaa46083aa0a08e363c85496845b"
SRC_URI[arm-x11.sha256sum] = "af81fd5b2efd617961e663b3ceafdb16ede3ef8948b4dfd0e4b3d2b02e4bdb61"

SRC_URI[aarch64-fb.md5sum] = "bbaed4959710e90d7a8f816ab40bb06a"
SRC_URI[aarch64-fb.sha256sum] = "79037caecd4840732bfc3368d476dcaddf0641d9da3168cd9527c1d20d71652e"

SRC_URI[aarch64-wayland.md5sum] = "3f65a61c65ac9955573e38034d7cfb30"
SRC_URI[aarch64-wayland.sha256sum] = "f3cc9270e93d80d6b6c53111bf64acc88eda03719df4a0486ad9e20c3d89204c"

SRC_URI[aarch64-x11.md5sum] = "d1d0309260ccb3f3cdd3c9b81656f25e"
SRC_URI[aarch64-x11.sha256sum] = "6a71aad2c403bc94ac68ff090a9c4c3e271377d59f6a38b213927b6f095db556"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
