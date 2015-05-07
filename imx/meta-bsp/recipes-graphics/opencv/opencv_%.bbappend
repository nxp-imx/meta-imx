FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_mx6 = " file://0001-MGS-515-ccc-Opencv-app-can-t-run-on-imx6sx-with-cam.patch"

EXTRA_OECMAKE += "-DBUILD_TIFF=ON \
                  -DBUILD_opencv_ocl=OFF \
                  -DBUILD_opencv_gpu=OFF \
                  -DWITH_CUDA=OFF \
                  -DWITH_GTK=OFF \
                  -DWITH_LIBV4L=OFF \
                  -DWITH_OPENCL=OFF \
                  -DOE_QMAKE_PATH_EXTERNAL_HOST_BINS=${STAGING_DIR}/${BUILD_SYS}/${bindir}/qt5 \
                  -D_qt5gui_OPENGL_INCLUDE_DIR=${STAGING_DIR_HOST} \
"
PACKAGECONFIG = "eigen jpeg png tiff v4l qt"
PACKAGECONFIG[qt] = "-DWITH_QT=ON,-DWITH_QT=OFF,qtbase"

do_install_append() {
    install -d ${D}/${datadir}/opencv/data
    cp -r ${S}/data/* ${D}/${datadir}/opencv/data
}
FILES_${PN}-apps += "${datadir}/opencv/data"
