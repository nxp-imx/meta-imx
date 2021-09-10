DESCRIPTION = "DeepViewRT examples"

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=e565271ec9a80ce47abbddc4bffe56fa" 

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "32e2ec5cf22992efe2fa643227617400"
SRC_URI[sha256sum] = "34fb57c717e62dbc477ad370c993964598fb1d81ea4d3dd6fd266afa18e755d9"

S = "${WORKDIR}/${BPN}-${PV}"

inherit fsl-eula-unpack pkgconfig

DEPENDS = "deepview-rt gstreamer1.0-plugins-base opencv curl"
RDEPENDS_${PN} += "deepview-rt"

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

INSANE_SKIP_${PN} += "rpaths dev-deps ldflags"
CLEANBROKEN = "1"

COMPATIBLE_MACHINE = "(mx8)"
BBCLASSEXTEND = "nativesdk"
