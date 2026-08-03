DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base"

# libaraclient_aarch64 is unversioned, so clear FILES_SOLIBSDEV
# and then explicitly set the libraries in main/dev package
FILES_SOLIBSDEV = ""

FILES:${PN} += " \
    ${libdir}/gstreamer-1.0 \
    ${libdir}/libaraclient_aarch64.so \
    ${libdir}/libara_vision_inference.so \
    ${systemd_system_unitdir} \
    ${datadir}/python-wheels \
    ${datadir}/ara2"

RDEPENDS:${PN} += " \
    bash \
    dbus \
    dbus-lib \
    eiq-aaf-connector \
    gstreamer1.0 \
    libusb1 \
    optimum-ara \
    python3-huggingface-hub \
    uiodma \
    uv"

INSANE_SKIP:${PN} += " \
    already-stripped \
    buildpaths \
    dev-deps \
    dev-so \
    rpaths \
    useless-rpaths"
