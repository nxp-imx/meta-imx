# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=dedee5689786754f61ea3a76035c8a81"

SRC_URI[imx7ulp.md5sum] = "2966f4410bb9e42f989b02ca98a0ef22"
SRC_URI[imx7ulp.sha256sum] = "a469e4f322b27d54eec2a58f8e1bdfb5d096ad23272ccd7ba58dc37db49c676b"

SRC_URI[imx8mm.md5sum] = "60da65ee89e26eb5d7e3a11e4fc08963"
SRC_URI[imx8mm.sha256sum] = "a166146924013588f40c8c9402298ce6451d2e2b75e775704e670fa9ff8f537f"

SRC_URI[imx8mq.md5sum] = "bab21c0ba1a7411074cc1e3007b8306b"
SRC_URI[imx8mq.sha256sum] = "6ad217c4d967c372a131958448fe86474dd6afdb6cd8aab8ca3e0db4dab252c3"

COMPATIBLE_MACHINE = "(mx7ulp|mx8mm|mx8mq)"
