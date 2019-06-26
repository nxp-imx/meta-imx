# Copyright 2019 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-m4-demos-2.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

SRC_URI[imx7ulp.md5sum] = "024d771b301343e3e4ab046c6a0c1760"
SRC_URI[imx7ulp.sha256sum] = "e4efb9646b66df867f618bd8121e14afe17ebadea4a405a4df951d45d841e681"

SRC_URI[imx8mm.md5sum] = "47878b874aaf7be0166dca4b72152b88"
SRC_URI[imx8mm.sha256sum] = "e768ced9cf15dfd1651d9725cdbaa7a18eac97248cd197cc96f8fb7d94d106fe"

COMPATIBLE_MACHINE = "(mx7ulp|mx8mm)"
