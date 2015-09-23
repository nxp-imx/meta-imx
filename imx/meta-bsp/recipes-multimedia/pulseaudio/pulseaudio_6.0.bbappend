# As it can not overwrite the version in the layer meta-fsl-arm, we have to use
#   another file extension for new patch to the append in the meta-fsl-arm

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

IMX_PATCHES = " file://0001-Fix-pulseaudio-mutex-issue-when-do-pause-in-gstreame.patch \
                file://0002-pulseaudio-enable-allow-autospawn-for-root-as-defaul.patch \
                file://pulseaudio-remove-the-control-for-speaker-headphone-widge.patch \
"

SRC_URI_append_mx6 = "${IMX_PATCHES}"
SRC_URI_append_mx6ul = "${IMX_PATCHES}"
SRC_URI_append_mx7 = "${IMX_PATCHES}"

PACKAGE_ARCH_mx6 = "${MACHINE_SOCARCH}"
PACKAGE_ARCH_mx6ul = "${MACHINE_SOCARCH}"
PACKAGE_ARCH_mx7 = "${MACHINE_SOCARCH}"
