# Copyright 2019-2020 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos-2.8.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

SRC_URI[imx8mn.md5sum] = "01e35c2ee79d9a7a5524507a667f2e74"
SRC_URI[imx8mn.sha256sum] = "39f95e4c6278944d23c7507bb44c0a8b0b85cf7eefe14a51f281719b6af148c6"

SRC_URI[imx8mp.md5sum] = "032b1b63e51c9e49df9b2d1839e0e932"
SRC_URI[imx8mp.sha256sum] = "e42fa252c310df3824973fb3cd0573aa0c09c5cd08c3aad843f709fb4e5af25d"

COMPATIBLE_MACHINE = "(mx8mn|mx8mp)"
