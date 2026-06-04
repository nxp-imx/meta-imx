SUMMARY = "NXP RT-SDK ARA2"
DESCRIPTION = "Runtime SDK for AI/ML acceleration with Ara240 NPU on i.MX SoCs"
HOMEPAGE = "https://github.com/nxp-imx/rt-sdk-ara2"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base"

IMX_SRCREV_ABBREV = "5a1cf4d"
SRC_URI[sha256sum] = "3dbc8f6e8ef62aa1263333756aac2b9d91a4e847f29a55f7b6d9b851a0840482"

inherit fsl-eula2-unpack2 fsl-eula-recent

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
    kernel-module-uiodma \
    libusb1 \
    uv"
INSANE_SKIP:${PN} += "useless-rpaths rpaths buildpaths dev-deps already-stripped"

FILES:${PN}-dev += "${libdir}/libara_vision_inference.so"
