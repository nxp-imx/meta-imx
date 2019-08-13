DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

SRC_URI[arm-fb.md5sum] = "614605ad9a88f441bd03d72a609918c1"
SRC_URI[arm-fb.sha256sum] = "292cf20ed89d6daa561993379afe1a467b37c89dd7c83605d06a2cf08edd1e6b"

SRC_URI[arm-wayland.md5sum] = "b8c872bc17d64c1d58e13e1c57aa1608"
SRC_URI[arm-wayland.sha256sum] = "38169d3956fe1fb2e60422f7bd110bd7c0c184a394cca4c136b2606ff2f644dd"

SRC_URI[arm-x11.md5sum] = "f06bf71bc6f95b6a80f9d3c2dfc6a0d5"
SRC_URI[arm-x11.sha256sum] = "8255d87b42de19d3d24ed00e6a7101f816cf6e648fe9850705748071c5867bbf"

SRC_URI[aarch64-fb.md5sum] = "aedc9d95878b80661e46511983d0ed6e"
SRC_URI[aarch64-fb.sha256sum] = "ad19e7f36e52f3c476f067582d47f60a120f7dc16bd15150c6a7cdbf33521f32"

SRC_URI[aarch64-wayland.md5sum] = "2acbd7167809cc2d7544115301fc9f95"
SRC_URI[aarch64-wayland.sha256sum] = "e7d7fb9f227449b497f7721bde97e2acfca7ad38183e6d8384ee91752d66a6d4"

SRC_URI[aarch64-x11.md5sum] = "da3d29f2506373d02d2b056d32c327dd"
SRC_URI[aarch64-x11.sha256sum] = "f9f5d87d09d4843b24fde525c043f29b87577d425231765363e6dfda6d99e8fb"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
