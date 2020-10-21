DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=e9e880185bda059c90c541d40ceca922" 

SRC_URI[arm-fb.md5sum] = "1abe301943194c7fef7b87aa1d4cf7f8"
SRC_URI[arm-fb.sha256sum] = "995f5ce2fd7ae018e0832ad6e92fc5738bde33269a80072ac33d1fcc46116609"

SRC_URI[arm-wayland.md5sum] = "9484efc750f11a2d4a89f984fb608068"
SRC_URI[arm-wayland.sha256sum] = "85dd3e43715c9871d26d40cf16c5e496d3cdd0bbf59278acfb2254c7f233b04a"

SRC_URI[arm-x11.md5sum] = "a42215806528b4c577294d4c06c1bae1"
SRC_URI[arm-x11.sha256sum] = "b253fd1898c8a26253e600d674717b9957341ca4036f1a721f4b2d74275fe501"

SRC_URI[aarch64-fb.md5sum] = "292430177787b78869ed70ef97423e1e"
SRC_URI[aarch64-fb.sha256sum] = "5f1fbe803d7c7c973b704d3810a66bb58769143f4ff470dcc0fca9c848a684e5"

SRC_URI[aarch64-wayland.md5sum] = "4ac79e1dabb8def2592ea39d5e4bdf52"
SRC_URI[aarch64-wayland.sha256sum] = "fa0170f8c723377b9fd23aa8f57663525ac83bdf4e1a21523c33b59f408f2295"

SRC_URI[aarch64-x11.md5sum] = "e047dd4f7c2967a063e32c8e29550e5d"
SRC_URI[aarch64-x11.sha256sum] = "1c7b8ca029a046ebe54c3560cefb11a8e0965d0860f8ccc0d7e526fb854e2d57"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
