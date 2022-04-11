# Copyright (C) 2022 NXP
require optee-test.imx.inc

DEPENDS:remove = "python3-cryptography-native"
DEPENDS:append = " python3-pycryptodomex-native"

SRCBRANCH = "lf_3.15.y"
SRCREV = "4011d5bac5af55b342b3d38ab20412073b124fc9"
