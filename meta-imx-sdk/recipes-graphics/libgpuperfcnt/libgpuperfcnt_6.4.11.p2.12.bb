DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "e0a132a"

SRC_URI[arm-fb.sha256sum] = "a4282e0380ec0edfec5ba58c22eac68efdbd8b4247ff5c0eef8ee92039872e91"
SRC_URI[arm-wayland.sha256sum] = "5ce4f8a288e2c38611c6e2b61ffba5305afb172a3b7e03f54d10aff81a6dfe92"
SRC_URI[aarch64-wayland.sha256sum] = "18f86b3cd487abd93c90d6b789fe0d3500b8e958962d21df6f4a329d726b8a4d"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE                  = "(imxgpu)"
COMPATIBLE_MACHINE:mx95-generic-bsp = "(^$)"
