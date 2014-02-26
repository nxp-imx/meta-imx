DESCRIPTION = "Freescale Image Weston Image QT5"

require recipes-fsl/images/fsl-image-weston.bb

REQUIRED_DISTRO_FEATURES = "wayland qt5"

IMAGE_INSTALL += " \
    qtbase \
    qtwayland \
    qtwayland-plugins \
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

export IMAGE_BASENAME = "fsl-image-weston-qt5"
