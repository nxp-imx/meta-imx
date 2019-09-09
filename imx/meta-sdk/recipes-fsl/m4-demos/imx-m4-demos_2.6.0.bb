# Copyright 2019 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-m4-demos-2.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3"
LIC_FILES_CHKSUM_mx8dxl-phantom = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3"

IMX_PACKAGE_NAME_mx7ulp = "${SOC}-m4-demo-${PV}-rfp"

SRC_URI[imx7ulp.md5sum] = "35fe850c3e392a814bd5f0110a6f79c0"
SRC_URI[imx7ulp.sha256sum] = "f17d55bcc8fd7f9939ad03222500ec92aebd8305d38ead73304e7c3a6c69b20e"

SRC_URI[imx8dxl-phantom.md5sum] = "2a01f41053bfd8b62d971eeec79dabc0"
SRC_URI[imx8dxl-phantom.sha256sum] = "613bd1176d29d44af96d99ab0ad85fc8f9cabd8fb56738159b5dbe2d50d31720"

COMPATIBLE_MACHINE = "(mx7ulp|mx8dxl-phantom)"
