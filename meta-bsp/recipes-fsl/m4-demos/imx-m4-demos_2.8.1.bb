# Copyright 2017-2020 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos-2.8.inc

LIC_FILES_CHKSUM_mx8qxp = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"
LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143"

SRC_URI[imx8dxl.md5sum] = "7f09bb52f744f60b6301c70c43081d96"
SRC_URI[imx8dxl.sha256sum] = "63427d2ff6089b5cec2fc3cfdbaf915f371ca34fa637b856afa6c8d6957e9abf"

SRC_URI[imx8qx.md5sum] = "5dd43abe1965db5e594083f821b38210"
SRC_URI[imx8qx.sha256sum] = "f1c136e5024d59fe8ef334861905e30c162569849b42c41bd7b53939fb5a8941"

COMPATIBLE_MACHINE = "(mx8dxl|mx8qxp)"
