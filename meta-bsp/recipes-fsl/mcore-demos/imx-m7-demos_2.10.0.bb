# Copyright 2019-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos-2.8.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

SRC_URI[imx8mnddr3l.md5sum] = "2bbc7aeae27fac1c3327c09139634ace"
SRC_URI[imx8mnddr3l.sha256sum] = "9c87e1f3409fb80f5646b04ce34eb0a1ba690dcb8ee628ea17e82396e6efa1a7"

SRC_URI[imx8mn.md5sum] = "11ee5b3f9494ba99c440b249eb99617a"
SRC_URI[imx8mn.sha256sum] = "aa4a57ed2ddbf6e27a14269be38f5ab3803889d71e8dcca76f8586a77802b010"

SRC_URI[imx8mp.md5sum] = "402ee570070c3c10fb5dec9599a88d72"
SRC_URI[imx8mp.sha256sum] = "343ecc380ab549d7d345947d360ef949f90f929e93e4bf504bd4a884756ccf72"

COMPATIBLE_MACHINE = "(mx8mnul|mx8mn|mx8mp)"
