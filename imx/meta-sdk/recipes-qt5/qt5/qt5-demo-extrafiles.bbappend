# Install hellowindow demo as a default QT APP on all platforms
do_install () {
    install -d ${D}/${datadir}/pixmaps
    install -d ${D}/${datadir}/applications
    install -m 0644 ${WORKDIR}/hellowindow.png ${D}/${datadir}/pixmaps
    install -m 0644 ${WORKDIR}/hellowindow.desktop ${D}/${datadir}/applications
}

# Install other qt5 demos on SoC with GPU
# Align with former release, do not install
# hellogl_es2.desktop & qt5basket.desktop & qt5nesting.desktop & qt5solarsystem.desktop
# as they are not supported

do_install_append_imxgpu2d () {
    install -m 0644 ${WORKDIR}/cinematicexperience.png ${D}/${datadir}/pixmaps
    install -m 0644 ${WORKDIR}/cinematicexperience.desktop ${D}/${datadir}/applications
    install -m 0644 ${WORKDIR}/qt5everywheredemo.png ${D}/${datadir}/pixmaps
    install -m 0644 ${WORKDIR}/qt5everywheredemo.desktop ${D}/${datadir}/applications
    install -m 0644 ${WORKDIR}/qt5nmapcarousedemo.png ${D}/${datadir}/pixmaps
    install -m 0644 ${WORKDIR}/qt5nmapcarousedemo.desktop ${D}/${datadir}/applications
    install -m 0644 ${WORKDIR}/qt5nmapper.png ${D}/${datadir}/pixmaps
    install -m 0644 ${WORKDIR}/qt5nmapper.desktop ${D}/${datadir}/applications
    install -m 0644 ${WORKDIR}/qtledbillboard.png ${D}/${datadir}/pixmaps
    install -m 0644 ${WORKDIR}/qtledbillboard.desktop ${D}/${datadir}/applications
    install -m 0644 ${WORKDIR}/qtledcombo.png ${D}/${datadir}/pixmaps
    install -m 0644 ${WORKDIR}/qtledcombo.desktop ${D}/${datadir}/applications
    install -m 0644 ${WORKDIR}/quitbattery.png ${D}/${datadir}/pixmaps
    install -m 0644 ${WORKDIR}/quitbattery.desktop ${D}/${datadir}/applications
    install -m 0644 ${WORKDIR}/quitindicators.png ${D}/${datadir}/pixmaps
    install -m 0644 ${WORKDIR}/quitindicators.desktop ${D}/${datadir}/applications
}

