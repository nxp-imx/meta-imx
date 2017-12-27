FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRCREV_opencv_extra = "c41d35c0be5feeb884e7da57c201461cb9877863"

SRC_URI_append = "git://github.com/opencv/opencv_extra.git;destsuffix=opencv_extra;name=opencv_extra"

PACKAGECONFIG_remove_imx = "eigen python3"

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
    qtbase, \
    \
"
PACKAGECONFIG[test] = " \
    -DBUILD_TESTS=ON -DINSTALL_TESTS=ON -DOPENCV_TEST_DATA_PATH=${S}/../opencv_extra/testdata, \
    -DBUILD_TESTS=OFF -DINSTALL_TESTS=OFF, \
"

GTK_PACKAGECONFIG_REMOVE = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland x11', 'gtk', '', d)}"
PACKAGECONFIG_append_mx8dv = " opencl openvx test"
PACKAGECONFIG_append_mx8mq = " opencl"
PACKAGECONFIG_append_mx8qm = " opencl openvx test"
PACKAGECONFIG_append_mx8qxp = " opencl"

PACKAGECONFIG_remove_mx8dv = "${GTK_PACKAGECONFIG_REMOVE}"
PACKAGECONFIG_remove_mx8qm = "${GTK_PACKAGECONFIG_REMOVE}"

do_install_append() {
    if ${@bb.utils.contains("PACKAGECONFIG", "samples", "true", "false", d)}; then
        install -d ${D}${datadir}/OpenCV/samples/data
        cp -r ${S}/samples/data/* ${D}${datadir}/OpenCV/samples/data
    fi
}

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
