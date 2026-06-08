SUMMARY = "NXP RT-SDK ARA2"
DESCRIPTION = "Runtime SDK for AI/ML acceleration with Ara240 NPU on i.MX SoCs"
HOMEPAGE = "https://github.com/nxp-imx/rt-sdk-ara2"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base"

IMX_SRCREV_ABBREV = "0c162bb"
SRC_URI[sha256sum] = "f6f7dcce48c35182831d0534cc72b94c0db44a086bc5e25cbbe1cfe65a0c174e"

inherit fsl-eula2-unpack2 fsl-eula-recent

# libaraclient_aarch64 is unversioned, so clear FILES_SOLIBSDEV
# and then explicitly set the libraries in main/dev package
FILES_SOLIBSDEV = ""

FILES:${PN} += " \
    ${libdir}/gstreamer-1.0 \
    ${libdir}/libaraclient_aarch64.so \
    ${libdir}/libara_vision_inference.so \
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
INSANE_SKIP:${PN} += "useless-rpaths rpaths buildpaths dev-deps dev-so already-stripped"
