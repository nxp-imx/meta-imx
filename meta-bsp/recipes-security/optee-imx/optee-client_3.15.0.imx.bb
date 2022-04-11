# Copyright (C) 2022 NXP
require optee-client.imx.inc

DEPENDS:remove = "python3-cryptography-native"
DEPENDS:append = " python3-pycryptodomex-native"

SRCBRANCH = "lf_3.15.y"
SRCREV = "182874320395787a389e5b0f7df02b32f3c0a1b0"
