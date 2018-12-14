DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6dfb32a488e5fd6bae52fbf6c7ebb086"

SRC_URI[arm-fb.md5sum] = "6cf3eb2b058d4a77bf30d993e2021ad1"
SRC_URI[arm-fb.sha256sum] = "d87f73e6eba5eb48570fa4a103bdb3eb3022485d366f3866084e03d771f677f0"

SRC_URI[arm-wayland.md5sum] = "40f542cb4e8dcac0ff0cc3e73cbd344e"
SRC_URI[arm-wayland.sha256sum] = "e1d9f01df09512ba7edf2b075d6f3314ed614a06b28c21903f712c1ef85444ea"

SRC_URI[arm-x11.md5sum] = "1d7998c442ea9f4261a6394bca6fa832"
SRC_URI[arm-x11.sha256sum] = "843ebd4ab2dc5a818f0d4ed06eec3e8f8546e2dc3d7bc3107f7d49d93499c2a1"

SRC_URI[aarch64-fb.md5sum] = "76e23a8b684ad32451755e076002be08"
SRC_URI[aarch64-fb.sha256sum] = "cb0cd4ad86f8b110af0b92085f5c38b32bf7e819e33a2a69b21db7a9a8aea33f"

SRC_URI[aarch64-wayland.md5sum] = "2dd069a27a6252e8797214a5691d77ee"
SRC_URI[aarch64-wayland.sha256sum] = "3b1dd82d664e9592365127f4f8e30f46cab4bcaf5348dc66e23ec8551306b338"

SRC_URI[aarch64-x11.md5sum] = "7cfd5c3f1f066c6b2801cc8fdb0ce364"
SRC_URI[aarch64-x11.sha256sum] = "875ff565045bd40fb0220be5e5f3e9544b17cffca468c68c7d099eaa9be9d1f8"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
