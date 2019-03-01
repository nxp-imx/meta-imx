DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=80c0478f4339af024519b3723023fe28"

SRC_URI[arm-fb.md5sum] = "f554464cdf034bacfa2b29b07627bc34"
SRC_URI[arm-fb.sha256sum] = "58c5e8bda097a98471421038332472a9cc4228d3cdb967a411d2ac9600d2457e"

SRC_URI[arm-wayland.md5sum] = "b38052c3b5dd43f85855c987a814005e"
SRC_URI[arm-wayland.sha256sum] = "3fd74adae155efd5c2201b6ee4dddf01313aaec413830c291f54f9965910764f"

SRC_URI[arm-x11.md5sum] = "db519d30d708477487f308cd6f73ec17"
SRC_URI[arm-x11.sha256sum] = "8c383be816d293bc29ff4c8120f23e302a3a464d046dcade482637218b343fa1"

SRC_URI[aarch64-fb.md5sum] = "55f55c2d754f7f244e765e0d07101749"
SRC_URI[aarch64-fb.sha256sum] = "318e96536651e356af8f74a554cb0b54932c6d3111803483ff096f5fd5fc209d"

SRC_URI[aarch64-wayland.md5sum] = "ebe1df980f5f3300578d93e7c07a5439"
SRC_URI[aarch64-wayland.sha256sum] = "5aeaf09e2b0bde7b04aef48ee7d2fe182d877478e1d83ad74563933c6139e393"

SRC_URI[aarch64-x11.md5sum] = "186a79367913b3df310901c537ee8f79"
SRC_URI[aarch64-x11.sha256sum] = "a3da9684a46b32ffbe4a6b0f7afcc110cdd38f43ff33c95c874a5e95e1516f69"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
