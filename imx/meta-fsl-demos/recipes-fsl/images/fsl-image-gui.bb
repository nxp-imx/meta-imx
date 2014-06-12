DESCRIPTION = "Freescale Image"
LICENSE = "MIT"

inherit core-image
# require recipes-fsl/images/fsl-image-multimedia.bb

IMAGE_FEATURES += " splash"
IMAGE_FEATURES += "${@base_contains('DISTRO_FEATURES', 'x11', \
                            ' package-management x11-base x11-sato hwcodecs', '', d)}"
IMAGE_FEATURES += "${@base_contains('DISTRO_FEATURES', 'wayland', \
                            base_contains('DISTRO_FEATURES', 'x11', '', ' package-management hwcodecs', d), \
                            '', d)}"
 
X11_EXTRA_IMAGE_FEATURES ?= "${@base_contains('DISTRO_FEATURES', 'x11', \
    ' tools-testapps', '', d)}"

# Add extra image features
EXTRA_IMAGE_FEATURES += " \
    ${X11_EXTRA_IMAGE_FEATURES} \
    nfs-server \
    tools-debug \
    tools-profile \
    ssh-server-dropbear \
    "

PACKAGE_ARCH = "${MACHINE_ARCH}"

# Backend-specific packages
# Direct FB packages
DFB_IMAGE_INSTALL = "${@base_contains('DISTRO_FEATURES', 'directfb', \
    'packagegroup-core-full-cmdline packagegroup-core-directfb libvivante-dfb-mx6', '', d)}"

# Wayland packages
WAYLAND_IMAGE_INSTALL = "${@base_contains('DISTRO_FEATURES', 'wayland', \
    base_contains('DISTRO_FEATURES', 'x11', '', \
    ' weston weston-init weston-examples gtk+3-demo clutter-1.0-examples', d),\
    '', d)}"

# X11 packages
X11_IMAGE_INSTALL = ""
X11_IMAGE_INSTALL_mx6 = "${@base_contains('DISTRO_FEATURES', 'x11', \
    'gst-plugins-gl-meta packagegroup-fsl-pulseaudio', '', d)}"

# Add in Graphics
X11_IMAGE_INSTALL_GRAPHICS = "${@base_contains('DISTRO_FEATURES', 'x11', \
   'packagegroup-fsl-gstreamer \
    packagegroup-core-x11-sato-games \
    xorg-minimal-fonts \
    liberation-fonts', '', d)}"

# set mm image install specific to SOC
MM_IMAGE_INSTALL = ""
MM_IMAGE_INSTALL_mx6 = "packagegroup-fsl-gstreamer1.0"

IMAGE_INSTALL += " \
    ${X11_IMAGE_INSTALL} \
    ${X11_IMAGE_INSTALL_GRAPHICS} \
    ${DFB_IMAGE_INSTALL} \
    ${WAYLAND_IMAGE_INSTALL} \
    ${MM_IMAGE_INSTALL} \
    packagegroup-fsl-tools-gpu \
    packagegroup-fsl-tools-gpu-external \
    packagegroup-fsl-tools-testapps \
    packagegroup-fsl-tools-benchmark \
    "

export IMAGE_BASENAME = "fsl-image-gui"


