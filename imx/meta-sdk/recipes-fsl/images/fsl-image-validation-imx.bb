DESCRIPTION = "Freescale Image to validate i.MX machines. \
               This image contains everything used to test i.MX machines \
               including demos and lots of applications. This creates a \
               very large image, not suitable for production."
LICENSE = "MIT"

inherit core-image

## Select Image Features
IMAGE_FEATURES += " \
    splash \
    nfs-server \
    debug-tweaks \
    tools-debug \
    tools-profile \
    ssh-server-dropbear \
    ${@base_contains('DISTRO_FEATURES', 'x11', \
        'package-management \
        x11-base \
        x11-sato \
        tools-testapps \
        hwcodecs', \
        '', d)} \
    "

PACKAGE_ARCH = "${MACHINE_ARCH}"

## Set up installs

# Backend-specific packages
# Direct FB packages
DFB_IMAGE_INSTALL = " \
    ${@base_contains('DISTRO_FEATURES', 'directfb', \
        'packagegroup-core-full-cmdline \
        packagegroup-core-directfb', \
    '', d)} \
    "
DFB_IMAGE_INSTALL_append_mx6 = " \
    ${@base_contains('DISTRO_FEATURES', 'directfb', \
        ' libvivante-dfb-mx6', '', d)} \
    "
DFB_IMAGE_INSTALL_remove_mx6ul = " \
    packagegroup-core-full-cmdline  \
    packagegroup-core-directfb  \
    libvivante-dfb-mx6 \
    "

WAYLAND_IMAGE_INSTALL = " \
    ${@base_contains('DISTRO_FEATURES', 'wayland', \
        'acl', '', d)} \
    "
 
# X11 packages
X11_IMAGE_INSTALL = ""
X11_IMAGE_INSTALL_append = " \
    ${@base_contains('DISTRO_FEATURES', 'x11', \
        'packagegroup-core-x11-sato-games \
        xorg-minimal-fonts \
        liberation-fonts', \
    '', d)} \
    "

# set multimedia specific to SOC
MM_IMAGE_INSTALL_CONTENTS = " \
    packagegroup-fsl-gstreamer1.0 \
    packagegroup-fsl-gstreamer1.0-full \
    "
MM_IMAGE_INSTALL = ""
MM_IMAGE_INSTALL_mx6 = " ${MM_IMAGE_INSTALL_CONTENTS}"
MM_IMAGE_INSTALL_mx6ul = " ${MM_IMAGE_INSTALL_CONTENTS}"
MM_IMAGE_INSTALL_mx7 = " ${MM_IMAGE_INSTALL_CONTENTS}"

CORE_IMAGE_EXTRA_INSTALL += " \
    ${X11_IMAGE_INSTALL} \
    ${WAYLAND_IMAGE_INSTALL} \
    ${DFB_IMAGE_INSTALL} \
    ${MM_IMAGE_INSTALL} \
    packagegroup-fsl-tools-bluetooth \
    packagegroup-fsl-tools-gpu \
    packagegroup-fsl-tools-gpu-external \
    packagegroup-fsl-tools-testapps \
    packagegroup-fsl-tools-benchmark \
    packagegroup-fsl-tools-audio \
    "

export IMAGE_BASENAME = "fsl-image-validation-imx"
