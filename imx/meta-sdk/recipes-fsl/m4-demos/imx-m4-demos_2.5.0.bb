# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-m4-demos-2.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6dfb32a488e5fd6bae52fbf6c7ebb086"

SRC_URI[imx7ulp.md5sum] = "0c98453649909bd5427412ac8838cd2a"
SRC_URI[imx7ulp.sha256sum] = "648b4d61919d6b1306f4ff7dab529331908b71c9ac5bff663e5c6c0194643c94"

SRC_URI[imx8mm.md5sum] = "5d35b10e47ca0afc7545bf5fea3b9b50"
SRC_URI[imx8mm.sha256sum] = "f95ef0183c74c0d5a7ab98e193e2b15e4e27cc3dfc8b75ec5f598366e95e535d"

COMPATIBLE_MACHINE = "(mx7ulp|mx8mm)"
