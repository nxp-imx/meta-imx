# Copyright 2019 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-m4-demos-2.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3"

IMX_PACKAGE_NAME_mx7ulp = "${SOC}-m4-demo-${PV}-rfp"

SRC_URI[imx7ulp.md5sum] = "d58b712ee9f181ad1533e8d1a33c39f4"
SRC_URI[imx7ulp.sha256sum] = "667680088f74142bedf52b605d868e609f919484ed0b5f430281600dfaf7efda"

SRC_URI[imx8dxl-phantom.md5sum] = "2a01f41053bfd8b62d971eeec79dabc0"
SRC_URI[imx8dxl-phantom.sha256sum] = "613bd1176d29d44af96d99ab0ad85fc8f9cabd8fb56738159b5dbe2d50d31720"

COMPATIBLE_MACHINE = "(mx7ulp|mx8dxl-phantom)"
