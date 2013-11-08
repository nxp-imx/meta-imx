DESCRIPTION = "Freescale Image Direct Frame Buffer Image"

include recipes-graphics/images/core-image-directfb.bb
inherit distro_features_check


## Must reset to remove x11
# Distro Features must be set in local.conf for build to work
#####DISTRO_FEATURES = "alsa argp bluetooth ext2 irda largefile pcmcia usbgadget usbhost wifi xattr nfs zeroconf pci 3g directfb ${DISTRO_FEATURES_LIBC}"

REQUIRED_DISTRO_FEATURES = "directfb"
CONFLICT_DISTRO_FEATURES = "x11 wayland"

DISTRO_FEATURES += "pulseaudio "
WEB = "web-webkit"

# Add extra image features
EXTRA_IMAGE_FEATURES += " \
    nfs-server \
    tools-debug \
    tools-profile \
"

SOC_IMAGE_INSTALL = ""
SOC_IMAGE_INSTALL_mx6 = "gpu-viv-bin-mx6q libvivante-dfb-mx6 gpu-viv-g2d"

IMAGE_INSTALL += " \
    ${SOC_IMAGE_INSTALL} \
    cpufrequtils \
    nano \
    packagegroup-fsl-tools-testapps \
    packagegroup-fsl-tools-benchmark \
    "

export IMAGE_BASENAME = "fsl-image-dfb"

