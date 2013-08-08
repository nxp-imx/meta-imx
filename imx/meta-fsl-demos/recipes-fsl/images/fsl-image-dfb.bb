DESCRIPTION = "Freescale Image Direct Frame Buffer Image"

#include recipes-graphics/images/core-image-directfb.bb

LICENSE = "MIT"

inherit core-image

IMAGE_FEATURES += "splash package-management ssh-server-dropbear"
IMAGE_INSTALL += "\
	${CORE_IMAGE_BASE_INSTALL} \
	packagegroup-core-basic \
	packagegroup-core-directfb \
"


## Must reset to remove x11
# Distro Features must be set in local.conf for build to work
#####DISTRO_FEATURES = "alsa argp bluetooth ext2 irda largefile pcmcia usbgadget usbhost wifi xattr nfs zeroconf pci 3g directfb ${DISTRO_FEATURES_LIBC}"

DISTRO_FEATURES += "pulseaudio "
WEB = "web-webkit"

# Add extra image features
EXTRA_IMAGE_FEATURES += " \
    nfs-server \
    tools-debug \
    tools-profile \
"

SOC_IMAGE_INSTALL = "gpu-viv-bin-mx6q libvivante-dfb-mx6 gpu-viv-g2d"

IMAGE_INSTALL += " \
    ${SOC_IMAGE_INSTALL} \
    cpufrequtils \
    nano \
    "

# remove until alsa-tools break if fixed
#   packagegroup-fsl-tools-testapps 
#    packagegroup-fsl-tools-benchmark 

export IMAGE_BASENAME = "fsl-image-dfb"

