DESCRIPTION = "Freescale Image to validate i.MX machines. \
               This image contains everything used to test i.MX machines \
               including GUI, demos and lots of applications. This creates a \
               very large image, not suitable for production."
LICENSE = "MIT"

inherit core-image

## Select Image Features
IMAGE_FEATURES += " \
    debug-tweaks \
    tools-profile \
    splash \
    nfs-server \
    tools-debug \
    ssh-server-dropbear \
    tools-testapps \
    hwcodecs \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', \
        'x11-base x11-sato', '', d)} \
    "

PACKAGE_ARCH = "${MACHINE_ARCH}"

CORE_IMAGE_EXTRA_INSTALL += " \
    packagegroup-core-full-cmdline \
    packagegroup-fsl-tools-bluetooth \
    packagegroup-fsl-tools-audio \
    packagegroup-fsl-tools-gpu \
    packagegroup-fsl-tools-gpu-external \
    packagegroup-fsl-tools-testapps \
    packagegroup-fsl-tools-benchmark \
    packagegroup-fsl-gstreamer1.0 \
    packagegroup-fsl-gstreamer1.0-full \
    ${@bb.utils.contains('DISTRO_FEATURES', 'directfb', \
        'packagegroup-core-directfb', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', \
        'weston-init', '', d)} \
    "

export IMAGE_BASENAME = "fsl-image-validation-imx"
