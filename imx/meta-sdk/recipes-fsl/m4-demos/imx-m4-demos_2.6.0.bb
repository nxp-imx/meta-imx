# Copyright 2019 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-m4-demos-2.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3"

IMX_PACKAGE_NAME_mx7ulp = "${SOC}-m4-demo-${PV}-rfp"

SRC_URI[imx7ulp.md5sum] = "ce0a9cdb8b27a1cc17392aa57602959f"
SRC_URI[imx7ulp.sha256sum] = "b4667d68f564586e0d1153245739cb06c16b809fb8921ee61ea6d8a4dc486771"

SRC_URI[imx8dxl-phantom.md5sum] = "2a01f41053bfd8b62d971eeec79dabc0"
SRC_URI[imx8dxl-phantom.sha256sum] = "613bd1176d29d44af96d99ab0ad85fc8f9cabd8fb56738159b5dbe2d50d31720"

COMPATIBLE_MACHINE = "(mx7ulp|mx8dxl-phantom)"
