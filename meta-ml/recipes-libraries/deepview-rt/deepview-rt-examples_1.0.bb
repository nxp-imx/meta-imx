DESCRIPTION = "DeepViewRT examples"

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=417b82f17fc02b88125331ed312f6f1b"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "6056d6da5fa9f094d5803ecf73fcfce6"
SRC_URI[sha256sum] = "1dcb0ba39fd3f84954c1abf90c6f4b41d91ef4f67041beea978d59585076e0db"

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
