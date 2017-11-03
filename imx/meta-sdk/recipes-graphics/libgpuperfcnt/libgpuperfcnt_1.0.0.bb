DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[arm-fb.md5sum] = "8b59924c4f58243fe68dba94b318cd5a"
SRC_URI[arm-fb.sha256sum] = "8e8c91a47510c3b21f5493e901ec7988185234934b621b235f2cc484c4436005"

SRC_URI[arm-wayland.md5sum] = "ab79daed2cb62cb14b577fe31520e239"
SRC_URI[arm-wayland.sha256sum] = "df33301737c1b97de748bcc1167e82eb606bd8f9377910d5d058a878b850e9f2"

SRC_URI[arm-x11.md5sum] = "ffa0fdd8633b286bf8f1d5055af49eee"
SRC_URI[arm-x11.sha256sum] = "aae293c1e558e35f0377c0c53ad00948fd3f24f2b616b829ef826ae9b53f04a8"

SRC_URI[aarch64-fb.md5sum] = "4251c6e2f10dc5726fd237de4a30d22f"
SRC_URI[aarch64-fb.sha256sum] = "7d55872c46e96efff3aecf49600f95e88debd243ea178f77facec965137c7475"

SRC_URI[aarch64-wayland.md5sum] = "58296f79b9f4ab4dd9b9e4c5ab2984e0"
SRC_URI[aarch64-wayland.sha256sum] = "956f96e879ccc3c38715ab633be378ab4f3f6eba8bb753350ad02c33689d81d7"

SRC_URI[aarch64-x11.md5sum] = "5bbb534558f779a0b4897aa9645aa9bd"
SRC_URI[aarch64-x11.sha256sum] = "4ba4d16c5a4f71fa10daad410e42e159fba10b85646f917e2397caea49a80406"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
