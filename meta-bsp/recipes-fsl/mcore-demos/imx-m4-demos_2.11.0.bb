# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=17d2319de7baa686e8a755ba58a9ebf5"
LIC_FILES_CHKSUM:mx8mm = "file://COPYING;md5=dedee5689786754f61ea3a76035c8a81"

SRC_URI[imx7ulp.md5sum] = "7c6e051faff5d71923b0813da76c28b8"
SRC_URI[imx7ulp.sha256sum] = "47c48b80a05428f13f49714383a60a26d73840789e1b517aef2d199f78cceec0"

SRC_URI[imx8mm.md5sum] = "79520fa4888a60394795871f19a911d1"
SRC_URI[imx8mm.sha256sum] = "a0fb1988fdcd9c4815885aabbd3caceff2a2919437202fb462791c91b2e1fe02"

SRC_URI[imx8mq.md5sum] = "bab21c0ba1a7411074cc1e3007b8306b"
SRC_URI[imx8mq.sha256sum] = "6ad217c4d967c372a131958448fe86474dd6afdb6cd8aab8ca3e0db4dab252c3"

COMPATIBLE_MACHINE = "(mx7ulp|mx8mm|mx8mq)"
