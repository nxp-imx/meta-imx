FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_mx6 = " file://0001-MGS-515-ccc-Opencv-app-can-t-run-on-imx6sx-with-cam.patch"

# Remove libav as it has LICENSE_FLAG commmerical
PACKAGECONFIG_remove = "libav"

# Camera cannot work with libv4l
EXTRA_OECMAKE += "-DWITH_LIBV4L=OFF \
"

do_install_append() {
    install -d ${D}/${datadir}/opencv/data
    cp -r ${S}/data/* ${D}/${datadir}/opencv/data
}

FILES_${PN}-apps += "${datadir}/opencv/data"
