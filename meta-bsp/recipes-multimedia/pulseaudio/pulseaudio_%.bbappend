SRC_URI_IMX:mx9-nxp-bsp = " \
    ${SRC_URI_IMX:mx6-nxp-bsp}"

EXTRA_OEMESON += "-Denable-smoother-2=false"

PACKAGE_ARCH:mx9-nxp-bsp = "${MACHINE_SOCARCH}"
