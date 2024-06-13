do_install:append() {
    install -d ${D}${libdir}/pkgconfig
    install -m 0644 ${B}/OpenCL.pc ${D}${libdir}/pkgconfig
}

FILES:${PN}-dev += " \
    ${libdir}/pkgconfig \
"

# Enable mali-imx ICD implementation
RDEPENDS:${PN}:append:mx95-nxp-bsp = " mali-imx-opencl-icd"

RDEPENDS:${PN} += "opencl-headers"
