DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=80c0478f4339af024519b3723023fe28" 

SRC_URI[arm-fb.md5sum] = "e559450fc731860bab300a1d7f30e368"
SRC_URI[arm-fb.sha256sum] = "daaa548101427f1b9cd996cea67909653aa47aaa0255c6fb8ff93bbc22c6917d"

SRC_URI[arm-wayland.md5sum] = "acff31a0a06a0348040fd97fd0f6efbc"
SRC_URI[arm-wayland.sha256sum] = "fb25a9df4ca0e840c6b17659cbdd1e47aacf564f4440bbfd28443bd6262d9c02"

SRC_URI[arm-x11.md5sum] = "3206fdeedb070a61f6252c662a4bd025"
SRC_URI[arm-x11.sha256sum] = "12aa32fa2660a4309a9ea2fbbdb0d7c2c36c166f401687108e0743a410e7dec4"

SRC_URI[aarch64-fb.md5sum] = "e0a037020b69cd69b16d5d3b4a86416e"
SRC_URI[aarch64-fb.sha256sum] = "14af2aba5b45a104430defbfb9852e4122a71bde97de0a7c60ae7062ea00ef70"

SRC_URI[aarch64-wayland.md5sum] = "e575aaa2e879b621edf99836052b7f49"
SRC_URI[aarch64-wayland.sha256sum] = "2dc4353fe574440be633d55874481136f6a81cf797b59eab5a459e27399ce488"

SRC_URI[aarch64-x11.md5sum] = "f67d62250611f0dc40deef16000e7a71"
SRC_URI[aarch64-x11.sha256sum] = "487f68c3cda46093394c6fd83aebbfbb4e8737e7ffdf414a4f01ff0d05ecd238"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
