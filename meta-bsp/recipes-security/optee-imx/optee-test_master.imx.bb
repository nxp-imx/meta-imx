# Copyright (C) 2021 NXP
require optee-test.imx.inc

DEPENDS:remove = "python3-pycryptodomex-native"
DEPENDS:append = " python3-cryptography-native"

SRCBRANCH = "master"
SRCREV = "01322455ed79f3c9a862a222df194d962a2093f3"