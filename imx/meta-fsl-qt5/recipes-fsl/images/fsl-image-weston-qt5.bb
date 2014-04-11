DESCRIPTION = "Freescale Image Weston Image QT5"

require recipes-fsl/images/fsl-image-weston.bb

IMAGE_INSTALL += " \
    qtbase \
    qtwayland \
    qtwayland-plugins \
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

export IMAGE_BASENAME = "fsl-image-weston-qt5"
