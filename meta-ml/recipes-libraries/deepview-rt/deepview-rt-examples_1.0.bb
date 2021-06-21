DESCRIPTION = "DeepViewRT examples"

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=f35df765ff17e69043ea21f350e3229c"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "5c5df9328806032652fc17a338b8b794"
SRC_URI[sha256sum] = "d4f1e11fabcb9a1ade38866298642bc6b395aa01cbf7cd818ea11ebdccec66f2"

S = "${WORKDIR}/${BPN}-${PV}"

inherit fsl-eula-unpack

DEPENDS = "deepview-rt deepview-rt-extras opencv"
RDEPENDS_${PN} += "deepview-rt deepview-rt-extras"

EXTRA_OEMAKE += "SDK_SYSROOT=${RECIPE_SYSROOT}"

do_install () {
    install -d ${D}${bindir}/${BPN}

    cp -fr ${S}/labelimg/labelimg  ${D}${bindir}/${BPN}
    cp -fr ${S}/labelssd/detectimg ${D}${bindir}/${BPN}
 
    chown -R root:root "${D}"
}

INSANE_SKIP_${PN} += "rpaths dev-deps ldflags"
CLEANBROKEN = "1"

COMPATIBLE_MACHINE = "(mx8)"
COMPATIBLE_MACHINE_mx8mm = "(^$)"
COMPATIBLE_MACHINE_mx8mnlite = "(^$)"
