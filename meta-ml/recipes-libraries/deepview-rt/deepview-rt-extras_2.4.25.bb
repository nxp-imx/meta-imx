DESCRIPTION = "The DeepView Extras provides a library of additional functions which do not have the same portability requirements as the core engine. This library links against the C++ runtime though externally offers the same C API."

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=417b82f17fc02b88125331ed312f6f1b"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "d87103c3bdb773dfe9069d3e24a0da22"
SRC_URI[sha256sum] = "f3a1ec5502a3907d3e697e1ebd274b9a7a07c81c795fc6831f6f8b81f86e4372"

S = "${WORKDIR}/${BPN}-${PV}"

inherit fsl-eula-unpack cmake

DEPENDS = "deepview-rt"
RDEPENDS_${PN} += "deepview-rt"

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
COMPATIBLE_MACHINE_mx8mm = "(^$)"
COMPATIBLE_MACHINE_mx8mnlite = "(^$)"
BBCLASSEXTEND = "nativesdk"
INSANE_SKIP_${PN} += "rpaths dev-deps"

