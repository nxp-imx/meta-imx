DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=80c0478f4339af024519b3723023fe28"

SRC_URI[arm-fb.md5sum] = "dd1d15418f6c254f6715f693d94bf5a4"
SRC_URI[arm-fb.sha256sum] = "c86365b49e222bc2c57a8ba04386cf83beabbc803d5f431fe19510af6e6a3811"

SRC_URI[arm-wayland.md5sum] = "baa823373e4eb2e1192fd5b4cd44b050"
SRC_URI[arm-wayland.sha256sum] = "d560e294f157eb7e056e9afbee1fd3c2323ba2958e0f542a76f5adf82e315834"

SRC_URI[arm-x11.md5sum] = "378d15ddeb284804ec55f77dc766651d"
SRC_URI[arm-x11.sha256sum] = "78b025838775ea3f21276b2930cd3f21c35573f467960fb4387d2281186d09ee"

SRC_URI[aarch64-fb.md5sum] = "e9d89969997e08feb931295371f7fc92"
SRC_URI[aarch64-fb.sha256sum] = "ed3ce3a58c0b1104ef4e9c2cea9593efa17025284813922210c5e9bab09e85b4"

SRC_URI[aarch64-wayland.md5sum] = "79a27f943ae266b1f59ce4d6b6c5123c"
SRC_URI[aarch64-wayland.sha256sum] = "2ef3251abb0e8a4f548014e7477655c78b0443a924b900e89e7f0ad9a6aabef3"

SRC_URI[aarch64-x11.md5sum] = "5ddc07482ac2149665a4f0b8fac2a9c7"
SRC_URI[aarch64-x11.sha256sum] = "323cf5b047af53de91baaf6d26411c862303d39a62cc00595b1f83060a100ae7"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
