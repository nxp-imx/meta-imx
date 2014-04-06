DESCRIPTION = "Freescale Image Direct Frame Buffer Image"

include recipes-graphics/images/core-image-directfb.bb
inherit distro_features_check

REQUIRED_DISTRO_FEATURES = "directfb"
CONFLICT_DISTRO_FEATURES = "x11 wayland"

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
SOC_IMAGE_INSTALL_mx6 = "gpu-viv-bin-mx6q libvivante-dfb-mx6 gpu-viv-g2d"

IMAGE_INSTALL += " \
    ${SOC_IMAGE_INSTALL} \
    cpufrequtils \
    nano \
    packagegroup-fsl-tools-testapps \
    "

export IMAGE_BASENAME = "fsl-image-dfb"

