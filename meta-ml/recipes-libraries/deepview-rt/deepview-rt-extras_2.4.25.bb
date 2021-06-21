DESCRIPTION = "The DeepView Extras provides a library of additional functions which do not have the same portability requirements as the core engine. This library links against the C++ runtime though externally offers the same C API."

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=f35df765ff17e69043ea21f350e3229c"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "7e66d73a9457b247b60e5b60251f0a13"
SRC_URI[sha256sum] = "af59b59da8543d0e3642ca911d3c88784c9b678613a3b4d62398f30a15af3cb8"

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

