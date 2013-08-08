DESCRPTION = "Freescale X11 SDK Image"

LICENSE = "MIT"

include recipes-fsl/images/fsl-image-x11.bb

IMAGE_FEATURES += " \
    dev-pkgs \
    tools-sdk \
"
EXTRA_IMAGE_FEATURES += " \
    tools-debug \
    tools-profile \
    tools-testapps \
    debug-tweaks \
"

IMAGE_FEATURES += "dev-pkgs tools-sdk qt4-pkgs \
	tools-debug eclipse-debug tools-profile tools-testapps debug-tweaks ssh-server-openssh"

IMAGE_INSTALL += "kernel-dev"

export IMAGE_BASENAME = "fsl-image-x11-sdk"
