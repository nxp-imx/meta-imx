# Copyright 2023-2025 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=a93b654673e1bc8398ed1f30e0813359"

LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=a93b654673e1bc8398ed1f30e0813359"

SRC_URI[imx8ulp.sha256sum] = "8147efc6b1da5aa9bbda8cc06c8aa0d03455f74d8c85a988db5e3f839717e190"

SRC_URI[imx93.sha256sum] = "275256ab9a7aca0b72dbd2ddb4f237f2ad9b02a83ae63242b2d9e6804a918b93"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"

