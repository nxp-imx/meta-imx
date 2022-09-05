FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI_IMX:mx6-nxp-bsp:append = " \
    file://0001-bluetooth-Only-remove-cards-belonging-to-the-device.patch"
SRC_URI_IMX:mx9-nxp-bsp = " \
    ${SRC_URI_IMX:mx6-nxp-bsp}"

# Enable allow-autospawn-for-root as default
PACKAGECONFIG:append = " autospawn-for-root"

PACKAGE_ARCH:mx9-nxp-bsp = "${MACHINE_SOCARCH}"
