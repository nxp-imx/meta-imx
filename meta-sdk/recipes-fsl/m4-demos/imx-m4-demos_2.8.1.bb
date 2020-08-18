# Copyright 2017-2020 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos-2.8.inc

LIC_FILES_CHKSUM_mx8qxp = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"
LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

SRC_URI[imx8dxl.md5sum] = "6b273d61cf6001d42d9fa13a6a635391"
SRC_URI[imx8dxl.sha256sum] = "1563e876440041615f2f35f2ceaca7ece55b4550a5a9ccd6234e4ba8f41afc35"

SRC_URI[imx8qx.md5sum] = "5dd43abe1965db5e594083f821b38210"
SRC_URI[imx8qx.sha256sum] = "f1c136e5024d59fe8ef334861905e30c162569849b42c41bd7b53939fb5a8941"

COMPATIBLE_MACHINE = "(mx8dxl|mx8qxp)"
