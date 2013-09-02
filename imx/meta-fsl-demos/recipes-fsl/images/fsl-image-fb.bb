DESCRIPTION = "Freescale Image Frame Buffer Image"

IMAGE_FEATURES += "splash"

LICENSE = "MIT"

inherit core-image
inherit distro_features_check

## Must reset to remove x11
# Distro Features must be set in local.conf for build to work
##DISTRO_FEATURES = "alsa argp bluetooth ext2 irda largefile pcmcia usbgadget usbhost wifi xattr nfs zeroconf pci 3g ${DISTRO_FEATURES_LIBC}"

CONFLICT_DISTRO_FEATURES = "x11 wayland directfb"

DISTRO_FEATURES += "pulseaudio "
WEB = "web-webkit"

# Add extra image features
EXTRA_IMAGE_FEATURES += " \
    nfs-server \
    tools-debug \
    tools-profile \
"

SOC_IMAGE_INSTALL = "gpu-viv-bin-mx6q gpu-viv-g2d gst-plugins-gl-meta"

IMAGE_INSTALL += " \
    ${SOC_IMAGE_INSTALL} \
    cpufrequtils \
    nano \
    packagegroup-fsl-tools-testapps \
    packagegroup-fsl-tools-benchmark \
    "

RDEPENDS_packagegroup-fsl-gstreamer_append_mx6 = " gst-plugins-gl \
"

export IMAGE_BASENAME = "fsl-image-fb"


