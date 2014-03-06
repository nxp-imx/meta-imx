DESCRIPTION = "Freescale Image Frame Buffer Image QT5"

require recipes-fsl/images/fsl-image-fb.bb

IMAGE_INSTALL += " \
    qtbase \
    qtbase-fonts \
    qtbase-plugins \
    qtbase-examples \
    cinematicexperience \
    tslib \
    icu \
    gstreamer \
    cairo \
    pango \
    fontconfig \
    freetype \
"

export IMAGE_BASENAME = "fsl-image-fb-qt5"


