DESCRIPTION = "The DeepView Extras provides a library of additional functions which do not have the same portability requirements as the core engine. This library links against the C++ runtime though externally offers the same C API."

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=3c3fe2b904fd694f28d2f646ee16dddb"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "5083f2c0e46ecc1a8f539f73ecd4efd8"
SRC_URI[sha256sum] = "17872264d13cdd12ae2fbeea0a1c918862c3259fac4abbce6a1fb9517eb32894"

S = "${WORKDIR}/${BPN}-${PV}"

inherit fsl-eula-unpack cmake

DEPENDS = "deepview-rt"
RDEPENDS_${PN} += "deepview-rt nn-imx"

OECMAKE_GENERATOR = "Unix Makefiles"

do_install () {
    install -d ${D}${bindir}
    install -d ${D}${libdir}/cmake/DeepViewExtras
    install -d ${D}${includedir}

    cp -fr   ${B}/bin/* ${D}${bindir}
    cp -frP  ${B}/lib/* ${D}${libdir}
    cp -fr   ${S}/include/* ${D}${includedir}
    cp -fr   ${S}/cmake/DeepViewExtrasConfig*.cmake ${D}${libdir}/cmake/DeepViewExtras
 
    chown -R root:root "${D}"
}

COMPATIBLE_MACHINE = "(mx8)"
BBCLASSEXTEND = "nativesdk"
INSANE_SKIP_${PN} += "rpaths dev-deps"

