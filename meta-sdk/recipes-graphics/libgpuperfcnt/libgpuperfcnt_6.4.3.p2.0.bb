DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=85d06b38f17b935ca11784d67075b846"

SRC_URI[arm-fb.md5sum] = "c0f5ee3f5894eb0ef1a7410a4891faf1"
SRC_URI[arm-fb.sha256sum] = "b346ef90b0f86b449636b3f99adb6d993f7dbf1f237592d349c18d89bd05b140"

SRC_URI[arm-wayland.md5sum] = "d8b9b8080f7d9ea1b4b3f51867b81d87"
SRC_URI[arm-wayland.sha256sum] = "4e68c58dc9e3b1402c4b660c41f412f9dbbb679282e5ac5518c1f5640386fd06"

SRC_URI[arm-x11.md5sum] = "dc17cf5f92d0aab4a4b1e7a3cef4f4d3"
SRC_URI[arm-x11.sha256sum] = "43aa93d9c06430a3b4171f9cd3095d3698a44631a6fd49b2435066a6ef729e55"

SRC_URI[aarch64-fb.md5sum] = "c0f6189cdef503be78e7790c31b8c53f"
SRC_URI[aarch64-fb.sha256sum] = "c7468250ca2e0ea66172d3fd4d93b422bc2e8f3a7d717b00c9f3c5acb7079f22"

SRC_URI[aarch64-wayland.md5sum] = "3ce875ff864deed9f09bc3439ea92a3f"
SRC_URI[aarch64-wayland.sha256sum] = "17d2082ea9015748f01bf589e4281678ebcc02c0daba7a200ce3088a8cb49909"

SRC_URI[aarch64-x11.md5sum] = "076ebf8b31c98536be437c212385ce21"
SRC_URI[aarch64-x11.sha256sum] = "6ae1148bf1f04433d098d03f037e346618964ff5f927dc9c303deae4b7812ac8"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
