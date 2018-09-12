DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[arm-fb.md5sum] = "9f370aa12ec404aafcedfa81b5b18d28"
SRC_URI[arm-fb.sha256sum] = "af5f24585b9d4a0bcd2d3a6dc09592d68b0b12bab68064db2ed703df36314854"

SRC_URI[arm-wayland.md5sum] = "25594a9585656ece223fc6fe85901e77"
SRC_URI[arm-wayland.sha256sum] = "9a945c4f8b0fd303127aa499009550e84583666fbf25d6c8273dda9bdace2d70"

SRC_URI[arm-x11.md5sum] = "02ad1b4e78cd20b03d667ec02a2a60e0"
SRC_URI[arm-x11.sha256sum] = "781c9e59555398d3c05456f90c1d25cec362c179aabeea38653f48e36b7afaa0"

SRC_URI[aarch64-fb.md5sum] = "79b327e4e33415b9fa2679054b067919"
SRC_URI[aarch64-fb.sha256sum] = "78e4a3d483502992916043ea9784b0121ae00b783a760ec6cb52ddbff64e34ed"

SRC_URI[aarch64-wayland.md5sum] = "5db039c1ffce2d11875bc94861b2feea"
SRC_URI[aarch64-wayland.sha256sum] = "00d8e8402a9d48774ab4a347a03bb65f2178e759805783bd25e5b344dc7554b6"

SRC_URI[aarch64-x11.md5sum] = "561c06b6f9b99c03f501403e9a0ebc6f"
SRC_URI[aarch64-x11.sha256sum] = "846d9fe74ae1a195eb3e0e6bc5b0000ac00a4a4bbe3c9340b2028883841b3837"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
