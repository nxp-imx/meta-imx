DESCRIPTION = "Freescale Image - determines the backend automatically"
# X11 fails to build.  Wayland GUI not right
LICENSE = "MIT"

inherit core-image

IMAGE_FEATURES += " splash"
IMAGE_FEATURES += "${@base_contains('DISTRO_FEATURES', 'x11', ' package-management x11-base', '', d)}"
IMAGE_FEATURES += "${@base_contains('DISTRO_FEATURES', 'wayland', ' package-management', '', d)}"

# require recipes-fsl/images/fsl-image-multimedia.bb

# Add extra image features
EXTRA_IMAGE_FEATURES += " \
    nfs-server \
    tools-debug \
    tools-profile \
    ssh-server-dropbear \
"

SOC_TOOLS_GPU_mx6_remove = "fsl-gpu-sdk"

# Backend-specific packages
DFB_IMAGE_INSTALL = "${@base_contains('DISTRO_FEATURES', 'dfb', 'packagegroup-core-directfb libvivante-dfb-mx6', '', d)}"

WAYLAND_IMAGE_INSTALL = "${@base_contains('DISTRO_FEATURES', 'wayland', 'weston weston-init weston-examples gtk+3-demo clutter-1.0-examples', '', d)}"

X11_IMAGE_INSTALL = ""
X11_IMAGE_INSTALL_mx5 = "${@base_contains('DISTRO_FEATURES', 'x11', 'glcubes-demo', '', d)}"
X11_IMAGE_INSTALL_mx6 = "${@base_contains('DISTRO_FEATURES', 'x11', 'gpu-viv-g2d glmark2 gst-plugins-gl-meta glcompbench packagegroup-fsl-pulseaudio', '', d)}"

IMAGE_INSTALL += " \
    ${X11_IMAGE_INSTALL} \
    ${DFB_IMAGE_INSTALL} \
    ${WAYLAND_IMAGE_INSTALL} \
    cpufrequtils \
    nano \
    packagegroup-fsl-tools-testapps \
    packagegroup-fsl-gstreamer1.0 \
    packagegroup-fsl-tools-benchmark \
    "

export IMAGE_BASENAME = "fsl-image"


