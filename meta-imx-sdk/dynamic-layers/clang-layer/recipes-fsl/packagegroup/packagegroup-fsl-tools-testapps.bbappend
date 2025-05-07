RDEPENDS_XDP_FP = ""
RDEPENDS_XDP_FP:mx95-nxp-bsp = "xdp-fp"

RDEPENDS:${PN} += " \
    ${RDEPENDS_XDP_FP} \
"
