DESCRIPTION = "Freescale Image Weston Image"

require recipes-graphics/images/core-image-weston.bb
inherit distro_features_check

REQUIRED_DISTRO_FEATURES = "wayland"
CONFLICT_DISTRO_FEATURES = "x11 directfb"

DISTRO_FEATURES += "pulseaudio "
WEB = "web-webkit"

# Add extra image features
EXTRA_IMAGE_FEATURES += " \
    nfs-server \
    tools-debug \
    tools-profile \
    ssh-server-dropbear \
"

SOC_IMAGE_INSTALL = ""
SOC_IMAGE_INSTALL_mx6 = "gpu-viv-bin-mx6q gpu-viv-g2d fsl-gpu-sdk"

IMAGE_INSTALL += " \
    ${SOC_IMAGE_INSTALL} \
    cpufrequtils \
    nano \
    packagegroup-fsl-tools-testapps \
    packagegroup-fsl-tools-benchmark \
    "

export IMAGE_BASENAME = "fsl-image-weston"
