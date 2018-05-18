DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d"

SRC_URI[arm-fb.md5sum] = "8f8dd9b7854fafda153da8022c30e753"
SRC_URI[arm-fb.sha256sum] = "d1073d1543050370e851b6cd24a90d1d281176f4265cae9764cff9f9520863fe"

SRC_URI[arm-wayland.md5sum] = "94685df5bb5a2c290828731fb1b22b76"
SRC_URI[arm-wayland.sha256sum] = "7db8e0fc9076e2d6bfb2b313c703bca1bf46971dd7e145d5ce3c36f0e82ea3e3"

SRC_URI[arm-x11.md5sum] = "c5bfdff9e13298438ce844760b0cbc4e"
SRC_URI[arm-x11.sha256sum] = "eb169e5d68fda4ebfaf5adc0d623132c94cdb39cd4dcdb58cdae4987b1d12190"

SRC_URI[aarch64-fb.md5sum] = "d78dd2dffb0ac1604eaf68c714dc56b2"
SRC_URI[aarch64-fb.sha256sum] = "91691597672f1693a5a07aef98051da1e7a2ca2d6d902241792c858a9463535f"

SRC_URI[aarch64-wayland.md5sum] = "30017c25b35454fbcc4e9da4dbddc4e1"
SRC_URI[aarch64-wayland.sha256sum] = "ec24bb47533d7d0092273a882bbe4b1572daeab15598f680c4838c95d1f22813"

SRC_URI[aarch64-x11.md5sum] = "88f611d7c57e6cc9582edc4030c3da24"
SRC_URI[aarch64-x11.sha256sum] = "7305dbaab11328ae201f19918b5f57bcfb3647ba9657fa3fa7fa1cd3cf7f7ce6"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
