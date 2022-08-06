DESCRIPTION = "DeepViewRT examples"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=65c483bb431ccd9a1820e6872c604771"

DEPENDS = "deepview-rt" 

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"
SRC_URI[md5sum] = "b25bc6aa20e59a14fb234c6b86f548df"
SRC_URI[sha256sum] = "175b83a8693b2030cf7852c5e580c4b312b30224272bbc939c7e76132b7788ef"
S = "${WORKDIR}/${BPN}-${PV}"

inherit fsl-eula-unpack pkgconfig

EXTRA_OEMAKE += "SDK_SYSROOT=${RECIPE_SYSROOT}"

do_install () {
    install -d ${D}${bindir}/${BPN}

    cp -fr ${S}/labelimg/labelimg  ${D}${bindir}/${BPN}
    cp -fr ${S}/detect_ssd/detect_ssd ${D}${bindir}/${BPN}
    cp -fr ${S}/python-examples ${D}${bindir}/${BPN}
 
    chown -R root:root "${D}"
}

INSANE_SKIP:${PN} += "rpaths dev-deps ldflags"
CLEANBROKEN = "1"

RDEPENDS:${PN} = "deepview-rt python3-core"

BBCLASSEXTEND = "nativesdk"

COMPATIBLE_MACHINE = "(mx8-nxp-bsp|mx9-nxp-bsp)"
