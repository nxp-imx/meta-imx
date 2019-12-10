require recipes-support/opencv/opencv_4.1.0.bb

SRCREV_opencv = "c5bf3ec2e791e0817ab1d5880e78711b6fe08206"

SRCREV_contrib = "83e98d2424bbe3854d4686dc6c9cf9a15812e8d7"
SRCREV_extra = "cff02b5f48d3431daa04397321c46e0bbb1bde53"
SRC_URI[tinydnn.md5sum] = "adb1c512e09ca2c7a6faef36f9c53e59"
SRC_URI[tinydnn.sha256sum] = "e2c61ce8c5debaa644121179e9dbdcf83f497f39de853f8dd5175846505aa18b"
SRCREV_FORMAT_append = "_extra"
OPENCV_SRC ?= "git://source.codeaurora.org/external/imx/opencv-imx.git;protocol=https"
SRCBRANCH = "4.1.2_imx"
SRC_URI_remove = "git://github.com/opencv/opencv.git;name=opencv \
           file://0002-Make-opencv-ts-create-share-library-intead-of-static.patch \
           "
SRC_URI_prepend = "${OPENCV_SRC};branch=${SRCBRANCH};name=opencv "
SRC_URI_append = " \
           git://github.com/opencv/opencv_extra.git;destsuffix=extra;name=extra \
           https://github.com/tiny-dnn/tiny-dnn/archive/v1.0.0a3.tar.gz;destsuffix=git/3rdparty/tinydnn/tiny-dnn-1.0.0a3;name=tinydnn;unpack=false \
           file://uselocalxfeatures.patch;patchdir=../contrib/ \
           "
PV = "4.1.2.imx"

do_unpack_extra_append() {
    mkdir -p ${S}/3rdparty/tinydnn/
    tar xzf ${WORKDIR}/v1.0.0a3.tar.gz -C ${S}/3rdparty/tinydnn/
}

PACKAGECONFIG_remove        = "eigen"
PACKAGECONFIG_append_mx8    = " dnn text"
PACKAGECONFIG_OPENCL        = ""
PACKAGECONFIG_OPENCL_mx8    = "opencl"
PACKAGECONFIG_OPENCL_mx8dxl = ""
PACKAGECONFIG_OPENCL_mx8mm  = ""
PACKAGECONFIG_append        = " ${PACKAGECONFIG_OPENCL}"

PACKAGECONFIG[openvx] = "-DWITH_OPENVX=ON -DOPENVX_ROOT=${STAGING_LIBDIR} -DOPENVX_LIB_CANDIDATES='OpenVX;OpenVXU',-DWITH_OPENVX=OFF,virtual/libopenvx,"
PACKAGECONFIG[qt5] = "-DWITH_QT=ON -DOE_QMAKE_PATH_EXTERNAL_HOST_BINS=${STAGING_BINDIR_NATIVE} -DCMAKE_PREFIX_PATH=${STAGING_BINDIR_NATIVE}/cmake,-DWITH_QT=OFF,qtbase qtbase-native,"
PACKAGECONFIG[test] = "-DBUILD_TESTS=ON -DINSTALL_TESTS=ON -DOPENCV_TEST_DATA_PATH=${S}/../extra/testdata, -DBUILD_TESTS=OFF -DINSTALL_TESTS=OFF,"

FILES_${PN}-samples += "${datadir}/OpenCV/samples"

do_install_append() {
    ln -sf opencv4/opencv2 ${D}${includedir}/opencv2
    install -d ${D}${datadir}/OpenCV/samples/data
    cp -r ${S}/samples/data/* ${D}${datadir}/OpenCV/samples/data
    install -d ${D}${datadir}/OpenCV/samples/bin/
    cp -f bin/example_* ${D}${datadir}/OpenCV/samples/bin/
}
