DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ca53281cc0caa7e320d4945a896fb837"

IMX_SRCREV_ABBREV = "99ab423"

SRC_URI[arm-fb.md5sum] = "5476e6398b1b9068ebe4c4fdfdf19d1e"
SRC_URI[arm-fb.sha256sum] = "81151261b2e2ff63a8d73fdb9b50dda0318a4238df60e29ab577dbbe71701efa"

SRC_URI[arm-wayland.md5sum] = "a7275b7a13d318e5c4b66ca0e9602e38"
SRC_URI[arm-wayland.sha256sum] = "07334d80e692b6c228437d037ec97ca5d59af9f9b3ddf12a8503defc9bd7e1be"

SRC_URI[aarch64-wayland.md5sum] = "21479d4bb6f9f76b5cd8a88066f0eb38"
SRC_URI[aarch64-wayland.sha256sum] = "1f24a74fae88814eae2d3ca35addddace7889438500105a137265c961d1bacdd"

SRC_URI[aarch64-wayland-mali.md5sum] = "94680287f781520dac39bf0a8ddd972f"
SRC_URI[aarch64-wayland-mali.sha256sum] = "da49c2c62538dd6772e940946af6c3f146a8eeb9d1a8cf9447e7e98bf416cca4"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGECONFIG ??= "vivante"
PACKAGECONFIG:mx95-nxp-bsp = "mali"

PACKAGECONFIG[mali] = ",,,mali-imx,,vivante"
PACKAGECONFIG[vivante] = ",,,imx-gpu-viv,,mali"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
