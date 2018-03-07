DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[arm-fb.md5sum] = "167e974602e9393a8895c5c2cf8b5be3"
SRC_URI[arm-fb.sha256sum] = "14dc192917fda5c3a0b5dad5f3604ac1205704631d0ea0b6ae79720e6404e28d"

SRC_URI[arm-wayland.md5sum] = "29280849b133e13a26f1c54e57ee9150"
SRC_URI[arm-wayland.sha256sum] = "b8b581a1d9d94fb1724efb9b1f6cdbb388daa04c118173050908fc94c6b55bea"

SRC_URI[arm-x11.md5sum] = "3c65cb9aef37c08d7ee61ad3108ae5e3"
SRC_URI[arm-x11.sha256sum] = "281f18b4485cb84c957bb60daaae78c0af59acfb2bad269148fb2dbaf9aebf7f"

SRC_URI[aarch64-fb.md5sum] = "72c679c4c7fd62ba0befbe3c1ffa2518"
SRC_URI[aarch64-fb.sha256sum] = "c5f2abe51cb4273eee8888d8e70bbd57b355a8861b93e38c5c2bb2004315b79d"

SRC_URI[aarch64-wayland.md5sum] = "09957b96bb158401053782b8b0451dc3"
SRC_URI[aarch64-wayland.sha256sum] = "339420956f937b676270680bf863d8bd0a2633692b14c409629d679c80f9adc8"

SRC_URI[aarch64-x11.md5sum] = "4e298d52cbe1b0dda92521180da16ae6"
SRC_URI[aarch64-x11.sha256sum] = "cfbfc7211c29de63ceed24802ec6c2a2934210a81702fcf188533d6d8af3599a"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
