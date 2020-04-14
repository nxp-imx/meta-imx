# Copyright 2019-2020 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos-2.8.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

SRC_URI[imx8mn.md5sum] = "bfed8dd48c3e116c144508d92bfed7e8"
SRC_URI[imx8mn.sha256sum] = "e8cff203d501fb1ad2fb992d5303328711cc5863fc8076b4f0d6b48f675b4009"

SRC_URI[imx8mp.md5sum] = "75dfee8cc2663057ec04908c0316b173"
SRC_URI[imx8mp.sha256sum] = "ec1537a44dc0345e6d26dc2880ea3cb86c50fc148f20dab5d98cf596558b63ae"

COMPATIBLE_MACHINE = "(mx8mn|mx8mp)"
