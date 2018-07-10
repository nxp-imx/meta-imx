DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ab61cab9599935bfe9f700405ef00f28"

SRC_URI[arm-fb.md5sum] = "63a970456e1fc9434826ab7110cd2e18"
SRC_URI[arm-fb.sha256sum] = "d56f9b0a2a0743c403289d2e4cb36ab1928303e8269e9ab628f696701b113fac"

SRC_URI[arm-wayland.md5sum] = "4f097d012cce066291adf056abb520f4"
SRC_URI[arm-wayland.sha256sum] = "697a5423323a7452cd2e7ea3ee587c2d24351ab43251fa8c809ba8fdee4e056f"

SRC_URI[arm-x11.md5sum] = "f87b188725952a94fcb43e01b00303e4"
SRC_URI[arm-x11.sha256sum] = "d803516a43ae560c1892a3c12e75fa9076fbf43c58e320ee566a516bb1fb50bf"

SRC_URI[aarch64-fb.md5sum] = "d393998281e3548d91f7a474b84fa724"
SRC_URI[aarch64-fb.sha256sum] = "fe94737e2b6a2d4aae10537cb561a14cfeb8f7833ac1147dccdeaf9578d4baf0"

SRC_URI[aarch64-wayland.md5sum] = "397fb03814ff3ced5801cbccfa67d357"
SRC_URI[aarch64-wayland.sha256sum] = "6b0bc67afd3010fb7003e978848da27ddedbedd416b3a7398306a0bccbbe005e"

SRC_URI[aarch64-x11.md5sum] = "9880c072364f132c3ac21784c1ca911d"
SRC_URI[aarch64-x11.sha256sum] = "237d0bef4eeff197932d2bf6c7d226d9724ad2bb6742fe578f3d2f9719d9b664"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
