# Copyright 2019 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-m4-demos-2.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3"
LIC_FILES_CHKSUM_mx7ulp = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

SRC_URI[imx7ulp.md5sum] = "024d771b301343e3e4ab046c6a0c1760"
SRC_URI[imx7ulp.sha256sum] = "e4efb9646b66df867f618bd8121e14afe17ebadea4a405a4df951d45d841e681"

SRC_URI[imx8dxl-phantom.md5sum] = "2a01f41053bfd8b62d971eeec79dabc0"
SRC_URI[imx8dxl-phantom.sha256sum] = "613bd1176d29d44af96d99ab0ad85fc8f9cabd8fb56738159b5dbe2d50d31720"

COMPATIBLE_MACHINE = "(mx7ulp|mx8dxl-phantom)"
