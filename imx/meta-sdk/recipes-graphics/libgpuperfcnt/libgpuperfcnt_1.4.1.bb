DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ab61cab9599935bfe9f700405ef00f28"

SRC_URI[arm-fb.md5sum] = "627d47ea5dcb873e4b243bac3242a4bd"
SRC_URI[arm-fb.sha256sum] = "9d2be56052c02ef5597bb247e71d5d7d96df2dc7cdfb484d67ea9548025c51d8"

SRC_URI[arm-wayland.md5sum] = "4edb4f1ae0175a1c2d47ae71440236a3"
SRC_URI[arm-wayland.sha256sum] = "ef6aeb12f3b9667437eb78307a33b0461d6a6d76e9307dd1a93857690b6e5ce8"

SRC_URI[arm-x11.md5sum] = "e3775b699b226057d1e41d211ae025de"
SRC_URI[arm-x11.sha256sum] = "d4362bd65a32269ba04f833006645ed1ebb6bf0170f5106a3401240803a2a33e"

SRC_URI[aarch64-fb.md5sum] = "5fffa536c255b28ce73bf3daade258e3"
SRC_URI[aarch64-fb.sha256sum] = "362b2772f3cdd18e9342da420a5b76234379a856df5ab07597ffdc6879329fa3"

SRC_URI[aarch64-wayland.md5sum] = "4e1470960cd31352522a316741bf0382"
SRC_URI[aarch64-wayland.sha256sum] = "a030f8f32c0443aa9cfef0a2e275ccfd62c847cf7881ca2bf6995dbf0475a7e9"

SRC_URI[aarch64-x11.md5sum] = "996d82ed9ff6fb0fb54d1d90a94d1b9a"
SRC_URI[aarch64-x11.sha256sum] = "b6f897768ed436576b48f1fac5a159a8f3bcd9768d4894f1dcc603e865e64aef"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
