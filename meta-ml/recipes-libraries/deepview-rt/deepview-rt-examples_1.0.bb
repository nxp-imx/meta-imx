DESCRIPTION = "DeepViewRT examples"

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a"

SRC_URI = "${FSL_MIRROR}/${BPN}.bin;fsl-eula=true"

SRC_URI[md5sum] = "32f1e03d0d35d45e48a535095658e14d"
SRC_URI[sha256sum] = "70b658da9ce77fa2417857e65f3fcf8a71372aca9e8ae7eb0c697e873d215407"

S = "${WORKDIR}/${BPN}"

inherit fsl-eula-unpack

DEPENDS = "deepview-rt deepview-rt-extras opencv"
RDEPENDS_${PN} += "deepview-rt deepview-rt-extras"

EXTRA_OEMAKE += "SDK_SYSROOT=${RECIPE_SYSROOT}"

do_install () {
    install -d ${D}${bindir}/${BPN}

    cp -fr ${S}/labelimg/labelimg  ${D}${bindir}/${BPN}
    cp -fr ${S}/labelssd/detectimg ${D}${bindir}/${BPN}
    cp -fr ${S}/ssdcam/detectcam   ${D}${bindir}/${BPN}
 
    chown -R root:root "${D}"
}

COMPATIBLE_MACHINE = "(mx8)"
INSANE_SKIP_${PN} += "rpaths dev-deps ldflags"
CLEANBROKEN = "1"
