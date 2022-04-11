# Copyright (C) 2022 NXP
require optee-os.imx.inc

DEPENDS:remove = "python3-cryptography-native"
DEPENDS:append = " python3-pycryptodomex-native"

SRCBRANCH = "lf_3.15.y"
SRCREV = "c1b2c37cb07d078c947d27448762e3f45a2896b8"
