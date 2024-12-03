DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=c0fb372b5d7f12181de23ef480f225f3" 

IMX_SRCREV_ABBREV = "95b9a52"

SRC_URI[arm-fb.sha256sum] = "90076a76043a61f0c047d52873de1613c6305ea256d7407aa57cfe590da2de1e"
SRC_URI[arm-wayland.sha256sum] = "de080f0ea00060235baec97c220ce419308773e693fec4e1fafc4d136175208e"
SRC_URI[aarch64-wayland.sha256sum] = "bff16f2b8a374574c5057fd5e8b66aa61fc7a9e09a2d09b852bf471f22c7b0c5"
SRC_URI[aarch64-wayland-mali.sha256sum] = "76b0a7e800bc7a615663bbee12172d69883f861dba2dfdf4c8cc4546a4cc64e4"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGECONFIG ??= "vivante"
PACKAGECONFIG:mx95-nxp-bsp = "mali"

PACKAGECONFIG[mali] = ",,,mali-imx,,vivante"
PACKAGECONFIG[vivante] = ",,,imx-gpu-viv,,mali"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
