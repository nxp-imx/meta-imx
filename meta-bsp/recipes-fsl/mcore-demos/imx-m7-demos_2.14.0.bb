# Copyright 2019-2023 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mn-nxp-bsp = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"
LIC_FILES_CHKSUM:mx8mnul-nxp-bsp = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"
LIC_FILES_CHKSUM:mx95-nxp-bsp = "file://COPYING;md5=2827219e81f28aba7c6a569f7c437fa7" 

SRC_URI[imx8mn.md5sum] = "5ba15434b72f1eb7315e6ddb8a66a0f9"
SRC_URI[imx8mn.sha256sum] = "8fe6c76da7eb0bbebb8e18a308249ca78a1c5c1d58034cf0fd3c5028aa5740e2"

SRC_URI[imx8mnddr3l.md5sum] = "62115bc3415eac0f9a4249ed9bb94f98"
SRC_URI[imx8mnddr3l.sha256sum] = "4b405e1ae439f651c21c4d4bd88f89695974a15aabb89cba65daa2f9922b273d"

SRC_URI[imx95.md5sum] = "e8ab268b0710e0a913c3ba26d8b2ca96"
SRC_URI[imx95.sha256sum] = "f316fd58dc38276bb83fc965d18d318bec4a995da0df6f698fac18ea9abfae9d"

COMPATIBLE_MACHINE = "(mx8mn-nxp-bsp|mx8mnul-nxp-bsp|mx95-nxp-bsp)"
