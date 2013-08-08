DESCRIPTION = "Freescale Image Frame Buffer Image"

IMAGE_FEATURES += "splash"

LICENSE = "MIT"

inherit core-image

## Must reset to remove x11
# Distro Features must be set in local.conf for build to work
##DISTRO_FEATURES = "alsa argp bluetooth ext2 irda largefile pcmcia usbgadget usbhost wifi xattr nfs zeroconf pci 3g ${DISTRO_FEATURES_LIBC}"

DISTRO_FEATURES += "pulseaudio "
WEB = "web-webkit"

# Add extra image features
EXTRA_IMAGE_FEATURES += " \
    nfs-server \
    tools-debug \
    tools-profile \
"

SOC_IMAGE_INSTALL = "gpu-viv-bin-mx6q gpu-viv-g2d"

IMAGE_INSTALL += " \
    ${SOC_IMAGE_INSTALL} \
    cpufrequtils \
    nano \
    "

#export IMAGE_BASENAME = "fsl-image-fb"


