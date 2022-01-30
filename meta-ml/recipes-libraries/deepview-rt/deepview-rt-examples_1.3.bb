DESCRIPTION = "DeepViewRT examples"

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=17d2319de7baa686e8a755ba58a9ebf5"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "e35394866ce1fe7e8c2e518bab5a53b2"
SRC_URI[sha256sum] = "de734ac90f4eb0b92a382b9b15637026d88f5964db5adad2c8604e6c4de16ceb"

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
