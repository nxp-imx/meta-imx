DESCRIPTION = "DeepViewRT examples"

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=e4098ac4459cb81b07d3f0c22b3e8370"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "b33ab0f358ad1ec83892811cee2b62bd"
SRC_URI[sha256sum] = "eeac3b7d65cbde0c52bad9cde494cbe4af7ddd23864ac3aaf32ed1344b782be4"

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
