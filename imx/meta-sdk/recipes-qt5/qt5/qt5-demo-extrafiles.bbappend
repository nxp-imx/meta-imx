
do_install_append () {
    rm -rf ${D}/${datadir}/pixmaps/hellogl_es2.png
    rm -rf ${D}/${datadir}/applications/hellogl_es2.desktop
}
