DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"

IMX_SRCREV_ABBREV = "99ab423"

SRC_URI[arm-fb.md5sum] = "49271fbee4d31ba0636408ee46ed7e50"
SRC_URI[arm-fb.sha256sum] = "6d44cbcccde1ab5b063da62cdc53398038b6407a77ceb1f8e355423e764bcadf"

SRC_URI[arm-wayland.md5sum] = "a7275b7a13d318e5c4b66ca0e9602e38"
SRC_URI[arm-wayland.sha256sum] = "b9409764d54caff5c4ae9075ad0fc42f8c434b17d8d110f84e95b52dbfd43fb9"

SRC_URI[aarch64-wayland.md5sum] = "21479d4bb6f9f76b5cd8a88066f0eb38"
SRC_URI[aarch64-wayland.sha256sum] = "a9a9fb1a25e97bedff6c23e8df6b86241ec390dd44c7dc431f047ecd5e787498"

SRC_URI[aarch64-wayland-mali.md5sum] = "b5befdbcd32329b884a3e21f75e913da"
SRC_URI[aarch64-wayland-mali.sha256sum] = "63387deafb389acd270586992496a5130341c04b2358834859c703d839a656ae"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGECONFIG ??= "vivante"
PACKAGECONFIG:mx95-nxp-bsp = "mali"

PACKAGECONFIG[mali] = ",,,mali-imx,,vivante"
PACKAGECONFIG[vivante] = ",,,imx-gpu-viv,,mali"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
