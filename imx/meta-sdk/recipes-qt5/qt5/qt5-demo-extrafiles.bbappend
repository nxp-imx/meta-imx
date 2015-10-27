
do_install_append () {
    rm -rf ${D}/${datadir}/pixmaps/hellogl_es2.png
    rm -rf ${D}/${datadir}/applications/hellogl_es2.desktop
    rm -rf ${D}/${datadir}/pixmaps/qt5basket.png
    rm -rf ${D}/${datadir}/applications/qt5basket.desktop
    rm -rf ${D}/${datadir}/pixmaps/qt5nesting.png
    rm -rf ${D}/${datadir}/applications/qt5nesting.desktop
    rm -rf ${D}/${datadir}/pixmaps/qt5solarsystem.png
    rm -rf ${D}/${datadir}/applications/qt5solarsystem.desktop
}
