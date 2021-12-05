# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=03bcadc8dc0a788f66ca9e2b89f56c6f"

SRC_URI[imx7ulp.md5sum] = "2966f4410bb9e42f989b02ca98a0ef22"
SRC_URI[imx7ulp.sha256sum] = "a469e4f322b27d54eec2a58f8e1bdfb5d096ad23272ccd7ba58dc37db49c676b"

SRC_URI[imx8mm.md5sum] = "1bb85794dc280f9f0843275691cb5ca9"
SRC_URI[imx8mm.sha256sum] = "a36500d12647ab92c810e9c96f921e9ef6476ac8b3764acc7fd1e0fabf8afd56"

SRC_URI[imx8mq.md5sum] = "b5034e35dca3c2b6c1b4d38b16cddaa7"
SRC_URI[imx8mq.sha256sum] = "ec44b737630c088dd23c1f855ce8478bae531d75a9c7021eb25e9268a8b9a425"

COMPATIBLE_MACHINE = "(mx7ulp|mx8mm|mx8mq)"
