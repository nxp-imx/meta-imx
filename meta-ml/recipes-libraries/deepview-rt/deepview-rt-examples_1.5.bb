DESCRIPTION = "DeepViewRT examples"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d3c315c6eaa43e07d8c130dc3a04a011"

DEPENDS = "deepview-rt gstreamer1.0-plugins-base opencv curl"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"
SRC_URI[md5sum] = "d0da2a7c81322e2d5d08e8f2df5afb8e"
SRC_URI[sha256sum] = "9f033cc5b9be9ad21ae60cb9a62bda6ae5ef6d11f648987449d9394b4c9cd81e"
S = "${WORKDIR}/${BPN}-${PV}"

inherit fsl-eula-unpack pkgconfig

EXTRA_OEMAKE += "SDK_SYSROOT=${RECIPE_SYSROOT}"

do_install () {
    install -d ${D}${bindir}/${BPN}

    cp -fr ${S}/labelimg/labelimg  ${D}${bindir}/${BPN}
    cp -fr ${S}/labelimg/labelimg_remote  ${D}${bindir}/${BPN}
    cp -fr ${S}/detectimg/detectv4 ${D}${bindir}/${BPN}
    cp -fr ${S}/detectimg/detectv4_remote ${D}${bindir}/${BPN}
    cp -fr ${S}/ssdcam-gst/ssdcam-gst ${D}${bindir}/${BPN}
    cp -fr ${S}/labelcam-gst/labelcam-gst ${D}${bindir}/${BPN}
    cp -fr ${S}/python-examples ${D}${bindir}/${BPN}
 
    chown -R root:root "${D}"
}

INSANE_SKIP:${PN} += "rpaths dev-deps ldflags"
CLEANBROKEN = "1"

RDEPENDS:${PN} = "deepview-rt python3-core"

BBCLASSEXTEND = "nativesdk"

COMPATIBLE_MACHINE = "(mx8-nxp-bsp|mx9-nxp-bsp)"
