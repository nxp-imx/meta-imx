SUMMARY = "Qt5 technology demo"
DESCRIPTION = "Cinematic Experience collects many of the new Qt5 QtQuick 2.0 features into the same UX demo application. It uses particles, sprites, path animation, custom shaders etc. features which Qt5 introduces for QML UIs."
HOMEPAGE = "http://quitcoding.com/?page=work#cinex"
LICENSE = "CC-BY-3.0"
LIC_FILES_CHKSUM = "file://README.md;beginline=51;endline=62;md5=894ca59686d0bd2b73d1bca0faf1032f"

SRC_URI = "git://github.com/alpqr/qt5-cinematic-experience.git;protocol=https"

SRCREV = "5d44dd7d4fd563b33570a14c2274e7fa9cc7d84f"

S = "${WORKDIR}/git"

DEPENDS = "qtdeclarative qtgraphicaleffects"
RDEPENDS:${PN} = "liberation-fonts qtdeclarative-qmlplugins qtgraphicaleffects-qmlplugins"

require recipes-qt/qt5/qt5.inc

do_install() {
    install -d ${D}${datadir}/${P}
    install -m 0755 ${B}/qt5-cinematic-experience ${D}${datadir}/${P}
    cp -R --no-dereference --preserve=mode,links ${S}/content ${D}${datadir}/${P}
    cp -R --no-dereference --preserve=mode,links ${S}/hlsl ${D}${datadir}/${P}
    cp -R --no-dereference --preserve=mode,links ${S}/rhishaders ${D}${datadir}/${P}
    install -m 0644 ${S}/main.qml ${D}${datadir}/${P}

    install -d ${D}${bindir}
    echo "#!/bin/sh" > ${D}${bindir}/qt5-cinematic-experience
    echo "export QML_IMPORT_PATH=${datadir}/${P}" >> ${D}${bindir}/qt5-cinematic-experience
    echo "export QML2_IMPORT_PATH=${datadir}/${P}" >> ${D}${bindir}/qt5-cinematic-experience
    echo "${datadir}/${P}/qt5-cinematic-experience \$* " >> ${D}${bindir}/qt5-cinematic-experience
    chmod +x ${D}${bindir}/qt5-cinematic-experience
}

FILES:${PN} += "${datadir}"
