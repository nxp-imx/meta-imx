DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a"

SRC_URI[arm-fb.md5sum] = "1abe301943194c7fef7b87aa1d4cf7f8"
SRC_URI[arm-fb.sha256sum] = "995f5ce2fd7ae018e0832ad6e92fc5738bde33269a80072ac33d1fcc46116609"

SRC_URI[arm-wayland.md5sum] = "c643ff6954b819c7bc46926ac4d4e2f2"
SRC_URI[arm-wayland.sha256sum] = "c8a41155a485685846e639cca5a5e1f23ee1ae4c49443322ef8e4431ba9f66df"

SRC_URI[arm-x11.md5sum] = "2b0a3da473da8ccf8e533e128d49bbd6"
SRC_URI[arm-x11.sha256sum] = "9e81038bbcd18da16c93653b11ce17732921b2f447bd270acf81270d05912329"

SRC_URI[aarch64-fb.md5sum] = "292430177787b78869ed70ef97423e1e"
SRC_URI[aarch64-fb.sha256sum] = "5f1fbe803d7c7c973b704d3810a66bb58769143f4ff470dcc0fca9c848a684e5"

SRC_URI[aarch64-wayland.md5sum] = "7bf428c64eab9fb24e43d4af03630015"
SRC_URI[aarch64-wayland.sha256sum] = "576447e1fcfccf4750a85c8457038a10a76c88f7173bb60a1b170e3f7ba20e37"

SRC_URI[aarch64-x11.md5sum] = "e047dd4f7c2967a063e32c8e29550e5d"
SRC_URI[aarch64-x11.sha256sum] = "1c7b8ca029a046ebe54c3560cefb11a8e0965d0860f8ccc0d7e526fb854e2d57"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
