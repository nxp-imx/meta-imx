DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[arm-fb.md5sum] = "7f3ad007ebb4715f6f610cb5e4149470"
SRC_URI[arm-fb.sha256sum] = "086c443a022a6fe26143f1f8fe5efcf40877255ffe2590b5178a70043b9ebdaa"

SRC_URI[arm-wayland.md5sum] = "376d34dae6bfabe0360da797cf1af4d6"
SRC_URI[arm-wayland.sha256sum] = "6c4cfe545122dd397d8eedcc89151243be24ae1bce23484510a103e1b6deb430"

SRC_URI[arm-x11.md5sum] = "2d3f7496edf89b1f851a195867febddd"
SRC_URI[arm-x11.sha256sum] = "01fe078630cd0b86e076234e0e97d2aaef8861832c6095dfca70770ccdbb976f"

SRC_URI[aarch64-fb.md5sum] = "626f89ecbd3c5a90264bb6ff818bbbf5"
SRC_URI[aarch64-fb.sha256sum] = "70f148f6b32bfd2032b58b2346efd10dea7df06e4e59c1b13feeb96f959139b9"

SRC_URI[aarch64-wayland.md5sum] = "ce9bced38d727f746874419882dcf7fe"
SRC_URI[aarch64-wayland.sha256sum] = "bf9cbc124fcb63599070a93834a51f798ff609b1d693038850ba0b142b8308cf"

SRC_URI[aarch64-x11.md5sum] = "23057f7807545102fc94f085115a1b5f"
SRC_URI[aarch64-x11.sha256sum] = "90298f80ffd3f17cacd50f6bdd641293e1dad6176fbbb5b276ee181674558fed"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
