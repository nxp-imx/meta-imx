SUMMARY = "NXP RT-SDK ARA2"
DESCRIPTION = "Runtime SDK for AI/ML acceleration with Ara240 NPU on i.MX SoCs"
HOMEPAGE = "https://github.com/nxp-imx/rt-sdk-ara2"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base"

IMX_SRCREV_ABBREV = "496726b"
SRC_URI:append = " file://install.sh"
SRC_URI[sha256sum] = "ae402d52fa77bfe763139a1d608297941e7d0c0fc60d211b11cd4b7a2a49eb3e"

inherit fsl-eula2-unpack2 fsl-eula-recent

do_install:append() {
    for dest in ${D}${datadir}/rt-sdk-ara240_*; do
        install -m 0755 ${UNPACKDIR}/install.sh $dest/install.sh
    done
}

# libaraclient_aarch64 is unversioned, so clear FILES_SOLIBSDEV
# and then explicitly set the libraries in main/dev package
FILES_SOLIBSDEV = ""

FILES:${PN} += " \
    ${libdir}/gstreamer-1.0 \
    ${libdir}/libaraclient_aarch64.so \
    ${datadir}/python-wheels \
    ${datadir}/rt-sdk-ara240*"
RDEPENDS:${PN} += " \
    dbus \
    dbus-lib \
    eiq-aaf-connector \
    gstreamer1.0 \
    uiodma \
    libusb1 \
    uv"
INSANE_SKIP:${PN} += "useless-rpaths rpaths buildpaths dev-deps already-stripped"

FILES:${PN}-dev += "${libdir}/libara_vision_inference.so"
