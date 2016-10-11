# As it can not overwrite the version in the layer meta-fsl-arm, we have to use
#   another file extension for new patch to the append in the meta-fsl-arm

# Append path for freescale layer to include alsa-state asound.conf
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_mx6 = " \
	file://asound.state \
        file://asound.conf \
"

SRC_URI_append_mx6ul = " \
        file://asound.state \
        file://asound.conf \
"

# for i.MX7D
PACKAGE_ARCH_mx7 = "${MACHINE_ARCH}"
