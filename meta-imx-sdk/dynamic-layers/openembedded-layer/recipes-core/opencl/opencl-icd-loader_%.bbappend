# Enable mali-imx ICD implementation
RDEPENDS:${PN}:append:mx95-nxp-bsp = " mali-imx-opencl-icd"

RDEPENDS:${PN} += "opencl-headers"
