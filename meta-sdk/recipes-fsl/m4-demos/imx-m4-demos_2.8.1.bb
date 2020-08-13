# Copyright 2017-2020 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos-2.8.inc

LIC_FILES_CHKSUM_mx8qxp = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"
LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

SRC_URI[imx8dxl.md5sum] = "38727d2f44d639a12498565bf8d93d29"
SRC_URI[imx8dxl.sha256sum] = "dd759aad36f79ef21601adc1d56a3c96653143c15ce9974e28d8829ab71f8207"

SRC_URI[imx8qx.md5sum] = "5dd43abe1965db5e594083f821b38210"
SRC_URI[imx8qx.sha256sum] = "f1c136e5024d59fe8ef334861905e30c162569849b42c41bd7b53939fb5a8941"

COMPATIBLE_MACHINE = "(mx8dxl|mx8qxp)"
