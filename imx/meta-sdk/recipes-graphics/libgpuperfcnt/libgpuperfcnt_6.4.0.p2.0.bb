DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

SRC_URI[arm-fb.md5sum] = "b64900b6c65a1c978452221948b62d95"
SRC_URI[arm-fb.sha256sum] = "02e9775c27f4f21a8940823dde3ded26acf5fcddcbc0b6ea901763bb5829b92f"

SRC_URI[arm-wayland.md5sum] = "89db4cdad223b90001ed5f5431649a13"
SRC_URI[arm-wayland.sha256sum] = "beec3fc5b1139bcb7d8dee7658e4d839ab65fb18c8a6a136873a54eba7446792"

SRC_URI[arm-x11.md5sum] = "90dc2582dc8796f7a7aff630ffbe63f2"
SRC_URI[arm-x11.sha256sum] = "c14ce200a1c6cf39da7d56ba6c25f706920d136a5fd7dc394d87eadb6f99197e"

SRC_URI[aarch64-fb.md5sum] = "1cb16eb129ad45ee95a65cdd0dfea903"
SRC_URI[aarch64-fb.sha256sum] = "bd6f52d2096f05f7e7d90d82e7ac7c34fb2364fd69728def3ca4e0d082bb4860"

SRC_URI[aarch64-wayland.md5sum] = "2910aeccdc919ed83c049eb6e82e3216"
SRC_URI[aarch64-wayland.sha256sum] = "01b8d3d4a1225c7c170ae8725e2f237892c6ed736c8d5351c4f47c08f8086f6c"

SRC_URI[aarch64-x11.md5sum] = "0037a02eb820ef29d83f40bbb411c1ee"
SRC_URI[aarch64-x11.sha256sum] = "82a2a23f7fca17482ff80aeb006d0fea9a419cbd843c8c987f2f6041019dfe04"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
