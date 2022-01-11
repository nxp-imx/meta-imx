# Copyright (C) 2021 NXP
require optee-os.imx.inc

SRCBRANCH = "master"
SRCREV = "d2c399da330b9a00c35a2d3cb91180bf8f59f0c4"

DEPENDS:remove = "python3-pycryptodomex-native"
DEPENDS:append = " python3-cryptography-native"
