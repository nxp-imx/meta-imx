# Copyright 2019 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-m4-demos-2.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3"
LIC_FILES_CHKSUM_mx7ulp = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

SRC_URI[imx7ulp.md5sum] = "024d771b301343e3e4ab046c6a0c1760"
SRC_URI[imx7ulp.sha256sum] = "e4efb9646b66df867f618bd8121e14afe17ebadea4a405a4df951d45d841e681"

SRC_URI[imx8dxl-phantom.md5sum] = "1a085cea9b93223e17f30f99c97da19d"
SRC_URI[imx8dxl-phantom.sha256sum] = "1cc04f2bbad9ed72083492a59679a172c1844bcb60040f106057f380b5aedd22"

COMPATIBLE_MACHINE = "(mx7ulp|mx8dxl-phantom)"
