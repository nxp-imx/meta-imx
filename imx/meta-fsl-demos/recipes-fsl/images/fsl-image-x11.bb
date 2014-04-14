DESCRIPTION = "Freescale X11 Image"

include recipes-sato/images/core-image-sato.bb
inherit distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"
CONFLICT_DISTRO_FEATURES = "directfb"

IMAGE_FEATURES += "debug-tweaks"
DISTRO_FEATURES += "pulseaudio"
WEB = "web-webkit"

SOC_EXTRA_IMAGE_FEATURES ?= "tools-testapps"

# Add extra image features
EXTRA_IMAGE_FEATURES += " \
    ${SOC_EXTRA_IMAGE_FEATURES} \
    nfs-server \
    tools-debug \
    tools-profile \
    qt4-pkgs \
"

SOC_IMAGE_INSTALL = ""
SOC_IMAGE_INSTALL_mx5 = "glcubes-demo"
SOC_IMAGE_INSTALL_mx6 = "gpu-viv-g2d glmark2 gst-plugins-gl-meta glcompbench packagegroup-fsl-pulseaudio"

IMAGE_INSTALL += " \
    ${SOC_IMAGE_INSTALL} \
    cpufrequtils \
    nano \
    packagegroup-fsl-gstreamer \
    packagegroup-fsl-gstreamer1.0 \
    packagegroup-fsl-tools-testapps \
    packagegroup-fsl-tools-benchmark \
    qt4-plugin-phonon-backend-gstreamer \
    qt4-demos \
    qt4-examples \
    gtkperf \
    "

#pull this out of package group since v4l-utils now is x11 dependent
# and breaks non-x11 builds
RDEPENDS_${PN}-tools-testapps += " v4l-utils "

export IMAGE_BASENAME = "fsl-image-x11"
