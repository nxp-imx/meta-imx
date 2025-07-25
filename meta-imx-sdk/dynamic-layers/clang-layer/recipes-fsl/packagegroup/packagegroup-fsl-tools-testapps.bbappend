RDEPENDS_XDP_FP = ""
RDEPENDS_XDP_FP:mx95-nxp-bsp = "xdp-fp"
RDEPENDS_XDP_FP:mx943-nxp-bsp = "xdp-fp"

RDEPENDS_CMM = ""
RDEPENDS_CMM:mx95-nxp-bsp = "cmm"
RDEPENDS_CMM:mx943-nxp-bsp = "cmm"

RDEPENDS:${PN} += " \
    ${RDEPENDS_XDP_FP} \
    ${RDEPENDS_CMM} \
"
