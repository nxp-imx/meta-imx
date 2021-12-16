# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=03bcadc8dc0a788f66ca9e2b89f56c6f"

SRC_URI[imx7ulp.md5sum] = "2966f4410bb9e42f989b02ca98a0ef22"
SRC_URI[imx7ulp.sha256sum] = "a469e4f322b27d54eec2a58f8e1bdfb5d096ad23272ccd7ba58dc37db49c676b"

SRC_URI[imx8mm.md5sum] = "ef31122a3cb98ac929c632fbc793bc9d"
SRC_URI[imx8mm.sha256sum] = "991c49594356a811d63d6ec5a3d2ad00612c96118390fe359687a99a671f8397"

SRC_URI[imx8mq.md5sum] = "bab21c0ba1a7411074cc1e3007b8306b"
SRC_URI[imx8mq.sha256sum] = "6ad217c4d967c372a131958448fe86474dd6afdb6cd8aab8ca3e0db4dab252c3"

COMPATIBLE_MACHINE = "(mx7ulp|mx8mm|mx8mq)"
