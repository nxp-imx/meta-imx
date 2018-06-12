DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ab61cab9599935bfe9f700405ef00f28"

SRC_URI[arm-fb.md5sum] = "63a970456e1fc9434826ab7110cd2e18"
SRC_URI[arm-fb.sha256sum] = "d56f9b0a2a0743c403289d2e4cb36ab1928303e8269e9ab628f696701b113fac"

SRC_URI[arm-wayland.md5sum] = "64291bd6bfb1db823f4d6a392f95ef1e"
SRC_URI[arm-wayland.sha256sum] = "4429d78d5b2c92f21e51b35fe428d044835fe22bbe545a7c309cd9f3d61e7755"

SRC_URI[arm-x11.md5sum] = "f87b188725952a94fcb43e01b00303e4"
SRC_URI[arm-x11.sha256sum] = "d803516a43ae560c1892a3c12e75fa9076fbf43c58e320ee566a516bb1fb50bf"

SRC_URI[aarch64-fb.md5sum] = "ee2e13a208ee36d245a81fb59c55d6f2"
SRC_URI[aarch64-fb.sha256sum] = "8eea766befde4069ec9f98fc9a9778308fb4e2595f2fc6fc30cb567824b7f2ec"

SRC_URI[aarch64-wayland.md5sum] = "edfcaaee636b01c934c3601a15906382"
SRC_URI[aarch64-wayland.sha256sum] = "8ce9eccb866b4f70f880b589314f886b7968764fa0ff05b4b64b0e5976c88eb0"

SRC_URI[aarch64-x11.md5sum] = "2181c057dc9885bc289db83c3bdf045a"
SRC_URI[aarch64-x11.sha256sum] = "f1f661f6f33d9ddd02f8059e69f9652c5c6bfc4e220f8230513626ad5cd1f644"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
