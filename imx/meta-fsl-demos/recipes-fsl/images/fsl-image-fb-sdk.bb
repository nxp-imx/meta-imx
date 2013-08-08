DESCRPTION = "Freescale Image FB SDK Image"

LICENSE = "MIT"

include recipes-fsl/images/fsl-image-fb.bb


IMAGE_FEATURES += " \
    dev-pkgs \
    tools-sdk \
"
EXTRA_IMAGE_FEATURES += " \
    tools-debug \
    tools-profile \
    debug-tweaks \
"

IMAGE_FEATURES += "dev-pkgs tools-sdk  \
	tools-debug eclipse-debug tools-profile debug-tweaks ssh-server-openssh"

IMAGE_INSTALL += "kernel-dev"

export IMAGE_BASENAME = "fsl-image-fb-sdk"
