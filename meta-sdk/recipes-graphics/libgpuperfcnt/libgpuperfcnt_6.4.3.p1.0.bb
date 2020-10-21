DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=e9e880185bda059c90c541d40ceca922" 

SRC_URI[arm-fb.md5sum] = "87a9a0e12bd46057c0054feb45b90817"
SRC_URI[arm-fb.sha256sum] = "b4d946e05bccfd44754227bbc63d1dad201e19c5ce78e0bb2fc7967df4ec8345"

SRC_URI[arm-wayland.md5sum] = "dcbd63618265bb3870b133705b5f596f"
SRC_URI[arm-wayland.sha256sum] = "e85ee1c1a063d1d6f19c151c451af422e0737c5beed17c58582bf3c56f6acee4"

SRC_URI[arm-x11.md5sum] = "3b94352b230b32d99bc85580a5daf043"
SRC_URI[arm-x11.sha256sum] = "366c934228d119a3bc5778aa366e04d0b52f746ca7a96dc5ed89f386c9f6207d"

SRC_URI[aarch64-fb.md5sum] = "9e49e4490a4d5a57e9282c916f65dad9"
SRC_URI[aarch64-fb.sha256sum] = "a6ffa5c49158fe6add4035f31219f25d51f990a2f469751f5ba5369fe883f17d"

SRC_URI[aarch64-wayland.md5sum] = "9fb0ceaf0fc02a996a106b44789b837d"
SRC_URI[aarch64-wayland.sha256sum] = "1771d8c81d8496cc00af80802f7747d9bbdd7bed47b14d31d572f3e439039a1e"

SRC_URI[aarch64-x11.md5sum] = "2100a1fc58473c71eb74765b167911fb"
SRC_URI[aarch64-x11.sha256sum] = "ab3f8703f5cdcb6edc4d3a1f1ebb9f97b4b485ddcbc5ca3365f802b1410e0b99"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
