# Copyright 2025 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Small image to be used for Cyber Resilient Recovery Module support."

LICENSE = "MIT"

inherit mfgtool-initramfs-image

CORE_IMAGE_EXTRA_INSTALL += " \
    imx-secure-enclave \
"
