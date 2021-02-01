DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=231e11849a4331fcbb19d7f4aab4a659" 

SRC_URI[arm-fb.md5sum] = "e0a164d9318f3975d30abe8715a82304"
SRC_URI[arm-fb.sha256sum] = "cb23c6a90f12991e055478b72410d45cdf2d31979ba1e41c23acbf80e4a46db6"

SRC_URI[arm-wayland.md5sum] = "a696815b780ddad021b46a5cea692bf5"
SRC_URI[arm-wayland.sha256sum] = "c15ffde9e2c5b676043546a91c1d95f4ca62279a00d8427f9fbb7cdb61935437"

SRC_URI[arm-x11.md5sum] = "fdbe6cd96e80f39d3034641eacd9d40e"
SRC_URI[arm-x11.sha256sum] = "9e376f831b863281efcbc03488764e9251299178c81ffab3aabcc5510877d722"

SRC_URI[aarch64-fb.md5sum] = "c8af3afd3b070d831c6e936239e75afb"
SRC_URI[aarch64-fb.sha256sum] = "784f84316136794b0d850b09731c48ac9ccc8c286d0d7665f1683eee51e8ae2f"

SRC_URI[aarch64-wayland.md5sum] = "832ccb4551e0f9a80613bd59bdab669e"
SRC_URI[aarch64-wayland.sha256sum] = "fc9ad753bf2b40ce133f681652ab49a0ae56a4508062fc094cdb9aebb9c0d018"

SRC_URI[aarch64-x11.md5sum] = "d50389f51a2be33423de48ba6e32ae56"
SRC_URI[aarch64-x11.sha256sum] = "4c0c7493bcca8ced2653b9f9170c1bba22da60e55406dd557bf5827d8a803813"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
