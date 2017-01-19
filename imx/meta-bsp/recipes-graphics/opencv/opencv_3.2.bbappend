PACKAGECONFIG_remove_imx = "eigen"

# Disable qt for opencv for now as non-qt builds installs qt because of the dependency of imx-gpu-sdk
# and gstreamer on opencv for fb/xwayland backends.

# inherit cmake_qt5

# PACKAGECONFIG[qt5] = "-DWITH_QT=ON -DWITH_GTK=OFF,-DWITH_QT=OFF,qtbase,"

# PACKAGECONFIG_append = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', ' qt5', \
#                bb.utils.contains('DISTRO_FEATURES', 'x11', '', ' qt5', d), d)}"

# This is needed to run samples that contains images
do_install_append() {

    install -d ${D}${datadir}/OpenCV/samples/data
    cp -r ${S}/samples/data/* ${D}${datadir}/OpenCV/samples/data
}

PACKAGES_append = " ${PN}-data"
FILES_${PN}-data = "${datadir}/OpenCV/samples/data/"
