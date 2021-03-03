DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a"

SRC_URI[arm-fb.md5sum] = "d743b84421307d88140e05367db848d1"
SRC_URI[arm-fb.sha256sum] = "488558842ee12ed3c4eca9961c3a8fc4e52b20735089d36d986b77f3b35914ca"

SRC_URI[arm-wayland.md5sum] = "5b58c2f91a2b653fe89fde5259de41cb"
SRC_URI[arm-wayland.sha256sum] = "053373be57e529fe841b2041d33951ee84fdcb250147ec5a5b49e7bd5d9170d8"

SRC_URI[arm-x11.md5sum] = "d28439180e6cade50f0081fad6adb1ea"
SRC_URI[arm-x11.sha256sum] = "c0507abd84a1d9235fe32a35d6f9817e7122af523b9e62f4575feb1c389e9587"

SRC_URI[aarch64-fb.md5sum] = "3dacf1002d95ad6934009a6c0f720221"
SRC_URI[aarch64-fb.sha256sum] = "529d7e851b8db828e4909000385d276a3a7c1e7df4e8f93ed38448b98c2a791d"

SRC_URI[aarch64-wayland.md5sum] = "f5f6748501e8a7dbe0d19cf5c70c6a0f"
SRC_URI[aarch64-wayland.sha256sum] = "6f3fd81c15c9fdb5706a056ebd621fc35e849397bffda22ae7b422d835bf599c"

SRC_URI[aarch64-x11.md5sum] = "c6a7ea6ea5f4641d6c63e6f8e879ae2f"
SRC_URI[aarch64-x11.sha256sum] = "4296614e0525c55631ef867a8968bc2dd996377c8cf72f2f742d0368231ee1e1"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
