DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

SRC_URI[arm-fb.md5sum] = "f6e98107bfa2f86efb2c3b653058e160"
SRC_URI[arm-fb.sha256sum] = "fe3b3188f9a25f47756e49aec73d7e483b3090829429bacb627bb9305eeae9a4"

SRC_URI[arm-wayland.md5sum] = "3a02ead9e2f7d7c8a818214bf9254b0f"
SRC_URI[arm-wayland.sha256sum] = "7774eacf6c232dce6b604f3b59c618aef645621a42b1be4028ff27d4c0f51491"

SRC_URI[arm-x11.md5sum] = "57774456acd28d070d5ecca976b5595d"
SRC_URI[arm-x11.sha256sum] = "c2e30a15e7db24894c04efa81dba8af5a06a0f2e32054a76e9bd431f0a0dd8c3"

SRC_URI[aarch64-fb.md5sum] = "ce66e8309a22eeabd110a3e1e1621796"
SRC_URI[aarch64-fb.sha256sum] = "a4b9a3f294506a0428e299fc2f943b4eee336e8d6764479ae75d9b6f2487fca0"

SRC_URI[aarch64-wayland.md5sum] = "45f75e8b3c9fde93f44139f433623b3b"
SRC_URI[aarch64-wayland.sha256sum] = "78fb8030fd50e3bd2321395495f5a8337ddaffce998133e6b34cd950a88e7078"

SRC_URI[aarch64-x11.md5sum] = "81bb86399b21a222197dc9c75f7fdacc"
SRC_URI[aarch64-x11.sha256sum] = "c34c27d7a8cafed20fc26ee407d776efd6bd89e1556ac8dab2ecaecef7417c1f"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
