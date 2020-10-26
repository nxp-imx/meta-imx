DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a"

SRC_URI[arm-fb.md5sum] = "5aa689134df5d8a05fdf37cd45f06312"
SRC_URI[arm-fb.sha256sum] = "632b9d7d6a6b570fb67c28a27f992ec56368821a39e30326f815d82df41b121d"

SRC_URI[arm-wayland.md5sum] = "c643ff6954b819c7bc46926ac4d4e2f2"
SRC_URI[arm-wayland.sha256sum] = "c8a41155a485685846e639cca5a5e1f23ee1ae4c49443322ef8e4431ba9f66df"

SRC_URI[arm-x11.md5sum] = "2b0a3da473da8ccf8e533e128d49bbd6"
SRC_URI[arm-x11.sha256sum] = "9e81038bbcd18da16c93653b11ce17732921b2f447bd270acf81270d05912329"

SRC_URI[aarch64-fb.md5sum] = "77f3ead477f08a2c3d8f08758c24b69e"
SRC_URI[aarch64-fb.sha256sum] = "b8201dcf9efe2ba7bfe2f4761c2e3c89777f627d63ee3ec2733a842207e5f010"

SRC_URI[aarch64-wayland.md5sum] = "510221ebc27ef61f67469824cb6bb5c8"
SRC_URI[aarch64-wayland.sha256sum] = "2ddedab631ee01869f8c74a180527f7038297e7d0bf636e6ec922667783295d6"

SRC_URI[aarch64-x11.md5sum] = "429ac61d0f2d23842917fa0c1fc42307"
SRC_URI[aarch64-x11.sha256sum] = "535871fbf75455e507c80d279293c9f60d2ec354f72ea3e496d1f1845b4e4d04"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
