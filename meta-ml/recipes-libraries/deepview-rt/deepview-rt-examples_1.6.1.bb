DESCRIPTION = "DeepViewRT examples"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ea25d099982d035af85d193c88a1b479"

DEPENDS = "deepview-rt" 

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"
SRC_URI[md5sum] = "540cb3aaa22ef96ee44a59bbedb004b9"
SRC_URI[sha256sum] = "333f145d7e742f2cbe08276e9eb5831973ff6520200353b2fe710b1255e63c01"
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
