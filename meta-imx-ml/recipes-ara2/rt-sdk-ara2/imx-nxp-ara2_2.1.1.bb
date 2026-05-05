SUMMARY = "NXP RT-SDK ARA2"
DESCRIPTION = "Runtime SDK for AI/ML acceleration with Ara240 NPU on i.MX SoCs"
HOMEPAGE = "https://github.com/nxp-imx/rt-sdk-ara2"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

DEPENDS += "glib-2.0"

IMX_SRCREV_ABBREV = "ffd778f"

SRC_URI = "${FSL_MIRROR}/${BP}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
SRC_URI += "file://install.sh"

SRC_URI[sha256sum] = "8999993d86415f492a2cfc889a502545fdee0a0edfa9ff401f8480f664e63a98"

S = "${UNPACKDIR}/${BP}-${IMX_SRCREV_ABBREV}"

inherit fsl-eula-unpack

do_install() {
    install -d ${D}/
    cp -r ${S}/* ${D}
    install -d ${D}${datadir}/${BPN}
    install -m 0755 ${UNPACKDIR}/install.sh ${D}${datadir}/${BPN}/install.sh
}


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

