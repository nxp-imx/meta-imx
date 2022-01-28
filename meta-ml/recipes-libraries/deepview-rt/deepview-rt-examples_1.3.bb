DESCRIPTION = "DeepViewRT examples"

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=17d2319de7baa686e8a755ba58a9ebf5"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "2c54c7bd421cddfcec91ed65b2baa57d"
SRC_URI[sha256sum] = "c021255fcdc7eaf3f797f7f97c6f3bfc19402121a8d6fd448baa5718a019a4d1"

S = "${WORKDIR}/${BPN}-${PV}"

inherit fsl-eula-unpack pkgconfig

DEPENDS = "deepview-rt gstreamer1.0-plugins-base opencv curl"
RDEPENDS:${PN} += "deepview-rt"

EXTRA_OEMAKE += "SDK_SYSROOT=${RECIPE_SYSROOT}"

do_install () {
    install -d ${D}${bindir}/${BPN}

    cp -fr ${S}/labelimg/labelimg  ${D}${bindir}/${BPN}
    cp -fr ${S}/labelimg/labelimg_remote  ${D}${bindir}/${BPN}
    cp -fr ${S}/detectimg/detectv4 ${D}${bindir}/${BPN}
    cp -fr ${S}/detectimg/detectv4_remote ${D}${bindir}/${BPN}
    cp -fr ${S}/ssdcam-gst/ssdcam-gst ${D}${bindir}/${BPN}
    cp -fr ${S}/labelcam-gst/labelcam-gst ${D}${bindir}/${BPN}
 
    chown -R root:root "${D}"
}

INSANE_SKIP:${PN} += "rpaths dev-deps ldflags"
CLEANBROKEN = "1"

COMPATIBLE_MACHINE = "(mx8)"
BBCLASSEXTEND = "nativesdk"
