# Copyright 2023 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374"
LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374"

SRC_URI[imx8ulp.md5sum] = "2b38f88838611991472e1f8cc4349c1a"
SRC_URI[imx8ulp.sha256sum] = "98cd47447405cd05992114ca7c803fe4a7da3aed00244c797b1683b10ffb8e31"

SRC_URI[imx93.md5sum] = "2f69f8fe88db57314d3f5b0de6e19d1f"
SRC_URI[imx93.sha256sum] = "c72c6c1a68e851e1521d749c96cc04f1a8eb38c49d8b3609d230492da5d9accb"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"
