DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=231e11849a4331fcbb19d7f4aab4a659" 

SRC_URI[arm-fb.md5sum] = "ce6d23056b7467d2297defd7ffe22bda"
SRC_URI[arm-fb.sha256sum] = "cf5e414535b56c3345f9adbdf27c675ea9f8d6efd3cee0499491ddf4d9ccd09b"

SRC_URI[arm-wayland.md5sum] = "ab243332b03eb3273d11042373577119"
SRC_URI[arm-wayland.sha256sum] = "80c6ea6dbebc9a84c920be37125a22eabfd72980ba4b74d5438ae39f73d23513"

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
