DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base"

# libaraclient_aarch64 is unversioned, so clear FILES_SOLIBSDEV
# and then explicitly set the libraries in main/dev package
FILES_SOLIBSDEV = ""

FILES:${PN} += " \
    ${libdir}/gstreamer-1.0 \
    ${libdir}/libaraclient_aarch64.so \
    ${libdir}/libara_vision_inference.so \
    ${datadir}/python-wheels \
    ${datadir}/rt-sdk-ara240*"
RDEPENDS:${PN} = " \
    dbus \
    dbus-lib \
    eiq-aaf-connector \
    gstreamer1.0 \
    libusb1 \
    uiodma \
    uv"
INSANE_SKIP:${PN} = " \
    already-stripped \
    buildpaths \
    dev-deps \
    dev-so \
    rpaths \
    useless-rpaths"
