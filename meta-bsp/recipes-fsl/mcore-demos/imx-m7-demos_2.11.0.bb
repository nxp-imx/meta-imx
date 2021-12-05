# Copyright 2019-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=03bcadc8dc0a788f66ca9e2b89f56c6f" 

SRC_URI[imx8mnddr3l.md5sum] = "26a697229e3e5abe381ea0255ea98b7d"
SRC_URI[imx8mnddr3l.sha256sum] = "7b140b534188c5b781add939511bad040139bb0809edb1f86bcdfdbc2608682d"

SRC_URI[imx8mn.md5sum] = "12d4c02883199e0dce0a288f17ad4688"
SRC_URI[imx8mn.sha256sum] = "56ef25a9f85f175bed2ad79466c5784156120aba2497ebaa8ad6c9300c6d355c"

SRC_URI[imx8mp.md5sum] = "eebe23fd5080253a0196e5f7ec4c1fe5"
SRC_URI[imx8mp.sha256sum] = "97c4f885b5765a748357f8401d4337988539bb693080d6d5af9626897b344f4a"

COMPATIBLE_MACHINE = "(mx8mnul|mx8mn|mx8mp|mx8mpul)"
