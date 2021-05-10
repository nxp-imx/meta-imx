DESCRIPTION = "DeepViewRT examples"

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=3c3fe2b904fd694f28d2f646ee16dddb"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "5e6ac35834132883acfb44dcf7ad3f07"
SRC_URI[sha256sum] = "4d42cb17fd2de6431ed99b4dbafa61c82b6a6f0e0f6667c3cb0516b17b21d44b"

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

COMPATIBLE_MACHINE = "(mx8)"
INSANE_SKIP_${PN} += "rpaths dev-deps ldflags"
CLEANBROKEN = "1"
