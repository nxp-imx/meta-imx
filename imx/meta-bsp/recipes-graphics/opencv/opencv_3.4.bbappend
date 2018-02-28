FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "git://github.com/opencv/opencv_extra.git;destsuffix=opencv_extra;name=opencv_extra"
SRCREV_opencv_extra = "c41d35c0be5feeb884e7da57c201461cb9877863"

PACKAGECONFIG_remove_imx   = "eigen python3"
PACKAGECONFIG_remove_mx8   = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland x11', 'gtk', '', d)}"
PACKAGECONFIG_append_mx8   = " opencl"
PACKAGECONFIG_append_mx8dv = " openvx"
PACKAGECONFIG_append_mx8qm = " openvx"

PACKAGECONFIG[openvx] = " \
    -DWITH_OPENVX=ON -DOPENVX_ROOT=${STAGING_LIBDIR} -DOPENVX_LIB_CANDIDATES='OpenVX;OpenVXU', \
    -DWITH_OPENVX=OFF, \
    virtual/libopenvx, \
    \
"
PACKAGECONFIG[qt5] = " \
    -DWITH_QT=ON -DWITH_GTK=OFF \
        -DOE_QMAKE_PATH_EXTERNAL_HOST_BINS=${STAGING_BINDIR_NATIVE}/qt5 \
        -DCMAKE_PREFIX_PATH=${STAGING_BINDIR_NATIVE}/cmake, \
    -DWITH_QT=OFF, \
    qtbase qtbase-native, \
    \
"
PACKAGECONFIG[test] = " \
    -DBUILD_TESTS=ON -DINSTALL_TESTS=ON -DOPENCV_TEST_DATA_PATH=${S}/../opencv_extra/testdata, \
    -DBUILD_TESTS=OFF -DINSTALL_TESTS=OFF, \
"

do_install_append() {
    if ${@bb.utils.contains("PACKAGECONFIG", "samples", "true", "false", d)}; then
        install -d ${D}${datadir}/OpenCV/samples/data
        cp -r ${S}/samples/data/* ${D}${datadir}/OpenCV/samples/data

        install -d ${D}${datadir}/OpenCV/samples/bin/
        if [ "${MACHINE}" = "imx8qmlpddr4arm2" -o "${MACHINE}" = "imx8qmmek" ]; then
            cp -f bin/example_openvx* ${D}${datadir}/OpenCV/samples/bin/
        elif [ "${MACHINE}" = "imx8mqevk" -o "${MACHINE}" = "imx8qxpmek" -o "${MACHINE}" = "imx8qxplpddr4arm2" ]; then
            cp -f bin/opencv_perf_* ${D}${datadir}/OpenCV/samples/bin/
        fi
    fi
}

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
