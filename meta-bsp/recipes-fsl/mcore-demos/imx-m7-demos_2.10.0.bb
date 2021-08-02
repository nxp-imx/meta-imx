# Copyright 2019-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos-2.8.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=e565271ec9a80ce47abbddc4bffe56fa" 

SRC_URI[imx8mnddr3l.md5sum] = "f7d651d04ffc4b8fa26b19b1289f5d65"
SRC_URI[imx8mnddr3l.sha256sum] = "9377eceaddb973f1cb51ae75d8dd47c7a0bc4d82f915bf25a81cddd5d633e805"

SRC_URI[imx8mn.md5sum] = "11ee5b3f9494ba99c440b249eb99617a"
SRC_URI[imx8mn.sha256sum] = "aa4a57ed2ddbf6e27a14269be38f5ab3803889d71e8dcca76f8586a77802b010"

SRC_URI[imx8mp.md5sum] = "402ee570070c3c10fb5dec9599a88d72"
SRC_URI[imx8mp.sha256sum] = "343ecc380ab549d7d345947d360ef949f90f929e93e4bf504bd4a884756ccf72"

COMPATIBLE_MACHINE = "(mx8mnul|mx8mn|mx8mp)"
