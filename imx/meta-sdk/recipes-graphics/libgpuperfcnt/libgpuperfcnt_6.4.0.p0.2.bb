DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

SRC_URI[arm-fb.md5sum] = "7dffb80981a9e3cea7ce4bbd2afc5502"
SRC_URI[arm-fb.sha256sum] = "789d129156b3a1fa7c09202b009243d1b341cc11526d781f3c09c614f5777046"

SRC_URI[arm-wayland.md5sum] = "67c4d3f662b14ffbe641991ea668d51f"
SRC_URI[arm-wayland.sha256sum] = "127b5162db8f2f3f2e6ade610db6cdd2e79989394a2df8863fdd669c7752744a"

SRC_URI[arm-x11.md5sum] = "d0bffe5040e7e7b9a1e271a9289f1a00"
SRC_URI[arm-x11.sha256sum] = "a2269f35208a6761ac807403c2a931ceae656f6c5181ca3a43db106edcecabe0"

SRC_URI[aarch64-fb.md5sum] = "5fba8e90b28eb85392684a0fe11e6220"
SRC_URI[aarch64-fb.sha256sum] = "5113daeb87726b8427021342becd6ade18b8465798bc667700129a353506154c"

SRC_URI[aarch64-wayland.md5sum] = "cd587eceac0da8642adf335a5f5c7813"
SRC_URI[aarch64-wayland.sha256sum] = "fb98d756ba558eb1b1a15b93f88e13ab3a1960dfc430f506c3cd29f643b41331"

SRC_URI[aarch64-x11.md5sum] = "f197f442b49f3c628215de5d9c89aff9"
SRC_URI[aarch64-x11.sha256sum] = "1099c6609b82199a0c0c98809b845a3d9c4a893281113dfe82348d1b1eed94ab"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
