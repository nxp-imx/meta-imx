DESCRIPTION = "The DeepView Extras provides a library of additional functions which do not have the same portability requirements as the core engine. This library links against the C++ runtime though externally offers the same C API."

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "f540900fe87641a602725d0de7159caa"
SRC_URI[sha256sum] = "15d4084a86c43e343a2838cb63b8c089f1aeb98ca099eca229e830ef97245b3b"

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

BBCLASSEXTEND = "nativesdk"
COMPATIBLE_MACHINE = "(mx8)"
INSANE_SKIP_${PN} += "rpaths dev-deps"
