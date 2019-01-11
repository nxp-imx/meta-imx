FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# Specify the opencv_extra source. The version should match the overall opencv version.
# Recording the opencv_extra version here allows us to raise a fatal error if the
# package version is updated but this section is not.
SRC_URI += "git://github.com/opencv/opencv_extra.git;branch=3.4;destsuffix=opencv_extra;name=opencv_extra"
SRCREV_opencv_extra = "cc18e9a17c5afe034341c8c70a5aaa9ac86e5601"
OPENCV_EXTRA_VERSION = "3.4.2"

SRC_URI_remove = "file://javagen.patch"
SRC_URI += "file://fix_openvx_samples.patch"
SRC_URI += "file://fix_python_bindings.patch"
SRC_URI += "file://0001-photo-avoid-resizing-a-const-Mat-in-decolor.patch \
            file://0002-photo-Decolor-corrections.patch \
"

PACKAGECONFIG_remove_imx   = "eigen"
PACKAGECONFIG_remove_mx8   = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland x11', 'gtk', '', d)}"
PACKAGECONFIG_append_mx8   = " opencl dnn text"
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
        -DOE_QMAKE_PATH_EXTERNAL_HOST_BINS=${STAGING_BINDIR_NATIVE} \
        -DCMAKE_PREFIX_PATH=${STAGING_BINDIR_NATIVE}/cmake, \
    -DWITH_QT=OFF, \
    qtbase qtbase-native, \
    \
"
PACKAGECONFIG[test] = " \
    -DBUILD_TESTS=ON -DINSTALL_TESTS=ON -DOPENCV_TEST_DATA_PATH=${S}/../opencv_extra/testdata, \
    -DBUILD_TESTS=OFF -DINSTALL_TESTS=OFF, \
"

do_check_opencv_extra_version() {
    OPENCV_VERSION=`echo ${PV} |  cut -d '+' -f 1`
    if [ "${OPENCV_EXTRA_VERSION}" != "${OPENCV_VERSION}" ]; then
        bbfatal "The opencv_extra version ${OPENCV_EXTRA_VERSION} does not match the recipe version ${OPENCV_VERSION}."
    fi
}
addtask check_opencv_extra_version before do_fetch

do_install_append() {
    if ${@bb.utils.contains("PACKAGECONFIG", "samples", "true", "false", d)}; then
        install -d ${D}${datadir}/OpenCV/samples/data
        cp -r ${S}/samples/data/* ${D}${datadir}/OpenCV/samples/data

        install -d ${D}${datadir}/OpenCV/samples/bin/
        cp -f bin/example_* ${D}${datadir}/OpenCV/samples/bin/
    fi
}

RDEPENDS_opencv-apps += \
    "${@bb.utils.contains('PACKAGECONFIG', 'test', 'bash', '', d)}"
