DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44" 

SRC_URI[arm-fb.md5sum] = "8ffd22bfeffd5a11fdcea7fcc4c58b32"
SRC_URI[arm-fb.sha256sum] = "dae08a62a8301cc56c85d629c620d9100b87c378388da6fcb8722b391b510edd"

SRC_URI[arm-wayland.md5sum] = "67c4d3f662b14ffbe641991ea668d51f"
SRC_URI[arm-wayland.sha256sum] = "127b5162db8f2f3f2e6ade610db6cdd2e79989394a2df8863fdd669c7752744a"

SRC_URI[arm-x11.md5sum] = "d0bffe5040e7e7b9a1e271a9289f1a00"
SRC_URI[arm-x11.sha256sum] = "a2269f35208a6761ac807403c2a931ceae656f6c5181ca3a43db106edcecabe0"

SRC_URI[aarch64-fb.md5sum] = "5fba8e90b28eb85392684a0fe11e6220"
SRC_URI[aarch64-fb.sha256sum] = "5113daeb87726b8427021342becd6ade18b8465798bc667700129a353506154c"

SRC_URI[aarch64-wayland.md5sum] = "cd587eceac0da8642adf335a5f5c7813"
SRC_URI[aarch64-wayland.sha256sum] = "fb98d756ba558eb1b1a15b93f88e13ab3a1960dfc430f506c3cd29f643b41331"

SRC_URI[aarch64-x11.md5sum] = "370f8097a2ceac055c4dd0f7124715a5"
SRC_URI[aarch64-x11.sha256sum] = "f3cdaea45c7430e3c3803c952d7961425d88b47bc592a29eea2bb2b02e580e18"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
