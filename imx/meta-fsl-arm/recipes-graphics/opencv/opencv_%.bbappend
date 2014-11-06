FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

DEPENDS += "qtbase"

EXTRA_OECMAKE += "-DBUILD_TIFF=ON \
                  -DBUILD_opencv_ocl=OFF \
                  -DBUILD_opencv_gpu=OFF \
                  -DWITH_CUDA=OFF \
                  -DWITH_GTK=OFF \
                  -DWITH_LIBV4L=OFF \
                  -DWITH_OPENCL=OFF \
                  -DWITH_V4L=ON \
                  -DWITH_QT=ON \
                  -DOE_QMAKE_PATH_EXTERNAL_HOST_BINS=${STAGING_DIR}/${BUILD_SYS}/${bindir}/qt5 \
                  -D_qt5gui_OPENGL_INCLUDE_DIR=${STAGING_DIR_HOST} \
"
do_install_append() {
    install -d ${D}/${datadir}/opencv/data
    cp -r ${S}/data/* ${D}/${datadir}/opencv/data
}
FILES_${PN}-apps += "${datadir}/opencv/data"
