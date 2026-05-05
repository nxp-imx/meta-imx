SUMMARY = "NXP RT-SDK ARA2"
DESCRIPTION = "Runtime SDK for AI/ML acceleration with Ara240 NPU on i.MX SoCs"
HOMEPAGE = "https://github.com/nxp-imx/rt-sdk-ara2"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

IMX_SRCREV_ABBREV = "5985b9f7"

SRC_URI = "${FSL_MIRROR}/${BP}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
SRC_URI += "file://postinst.sh"

SRC_URI[md5sum] = "0becef351717e92c2ad55d9c3a649a96"
SRC_URI[sha256sum] = "498c64379af79fef9f489c6960f11641adc1fe6e16afcd0384197a554333be2c"

S = "${UNPACKDIR}/${BP}-AUTOINC"

inherit fsl-eula-unpack

do_install() {
    install -d ${D}/
    cp -r ${S}/* ${D}
    install -d ${D}${datadir}/${BPN}
    install -m 0755 ${UNPACKDIR}/postinst.sh ${D}${datadir}/${BPN}/postinst.sh
}

DEPENDS += "glib-2.0"

RDEPENDS:${PN} += " \
	uv \
    dbus \
    dbus-lib \
    libusb1 \
	gstreamer1.0 \
	uiodma-driver \
	eiq-aaf-connector \
"

FILES_SOLIBSDEV = ""
FILES:${PN} += " /* "

# Skip QA warning about .so files in non-dev package
INSANE_SKIP:${PN} += " dev-so already-stripped useless-rpaths"

pkg_postinst_ontarget:${PN}() {
    ${datadir}/${BPN}/postinst.sh
}

