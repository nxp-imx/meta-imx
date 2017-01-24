FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
    file://Avoid-segmentation-fault.patch \
"

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

QT5_PACKAGECONFIG_APPEND = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'qt5', \
       bb.utils.contains('DISTRO_FEATURES',     'x11',    '', \
                                                       'qt5', d), d)}"
GTK_PACKAGECONFIG_REMOVE = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland x11', 'gtk', '', d)}"
PACKAGECONFIG_append_mx8dv = " opencl openvx ${QT5_PACKAGECONFIG_APPEND}"
PACKAGECONFIG_append_mx8qm = " opencl openvx ${QT5_PACKAGECONFIG_APPEND}"
PACKAGECONFIG_remove_mx8dv = "${GTK_PACKAGECONFIG_REMOVE}"
PACKAGECONFIG_remove_mx8qm = "${GTK_PACKAGECONFIG_REMOVE}"



# This is needed to run samples that contains images
do_install_append() {

    install -d ${D}${datadir}/OpenCV/samples/data
    cp -r ${S}/samples/data/* ${D}${datadir}/OpenCV/samples/data
}

PACKAGES_append = " ${PN}-data"
FILES_${PN}-data = "${datadir}/OpenCV/samples/data/"
