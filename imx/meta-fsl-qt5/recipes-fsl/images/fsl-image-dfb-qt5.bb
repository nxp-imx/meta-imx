DESCRIPTION = "Freescale Image Frame Buffer Image QT5"

require recipes-fsl/images/fsl-image-dfb.bb

IMAGE_INSTALL += " \
    qtbase \
    qtbase-fonts \
    qtbase-plugins \
    qtbase-examples \
    qtdeclarative \
    qtdeclarative-plugins \
    qtdeclarative-tools \
    qtdeclarative-examples \
    qtdeclarative-qmlplugins \
    cinematicexperience \
    tslib \
    icu \
    gstreamer \
    cairo \
    pango \
    fontconfig \
    freetype \
"

export IMAGE_BASENAME = "fsl-image-dfb-qt5"


