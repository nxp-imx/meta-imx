SUMMARY = "Qt6 technology demo"
DESCRIPTION = "Cinematic Experience collects many of the new Qt6 QtQuick 2.0 features into the same UX demo application. It uses particles, sprites, path animation, custom shaders etc. features which Qt5 introduces for QML UIs."
HOMEPAGE = "http://quitcoding.com/?page=work#cinex"
LICENSE = "CC-BY-3.0"
LIC_FILES_CHKSUM = "file://README.md;beginline=51;endline=62;md5=095fed4655dd7006b7e96051b261b1da"

SRC_URI = "git://github.com/alpqr/qt5-cinematic-experience.git;branch=master;protocol=https"

SRCREV = "fea04d7004a1608308c11189d74bb92d3decbe3d"

S = "${WORKDIR}/git"

inherit qt6-cmake

DEPENDS = "qtdeclarative qtdeclarative-native qtshadertools-native"
RDEPENDS:${PN} = "liberation-fonts qtdeclarative-qmlplugins"

require recipes-qt/qt6/qt6.inc

QT_PTEST_ENABLED = "0"

do_install() {
    install -d ${D}${datadir}/${P}
    install -m 0755 ${B}/qt5-cinematic-experience ${D}${datadir}/${P}/qt6-cinematic-experience
    cp -R --no-dereference --preserve=mode,links ${S}/content ${D}${datadir}/${P}
    install -m 0644 ${S}/main.qml ${D}${datadir}/${P}

    install -d ${D}${bindir}
    echo "#!/bin/sh" > ${D}${bindir}/qt6-cinematic-experience
    echo "export QML_IMPORT_PATH=${datadir}/${P}" >> ${D}${bindir}/qt6-cinematic-experience
    echo "export QML2_IMPORT_PATH=${datadir}/${P}" >> ${D}${bindir}/qt6-cinematic-experience
    echo "${datadir}/${P}/qt6-cinematic-experience \$* " >> ${D}${bindir}/qt6-cinematic-experience
    chmod +x ${D}${bindir}/qt6-cinematic-experience
}

FILES:${PN} += "${datadir}"
