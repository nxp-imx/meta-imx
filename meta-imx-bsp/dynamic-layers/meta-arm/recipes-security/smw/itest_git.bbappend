# Copyright 2026 NXP
SRCBRANCH = "lf-6.18.37_2.1.0"
SRCREV = "cbd3ac6b7e2c17d939a5268c6bf8e9eee847ca21" 

FILESEXTRAPATHS:prepend := "${THISDIR}/itest:"
SRC_URI += "file://0001-Fix-prime_tests-typo.patch"

PACKAGECONFIG:mx937-nxp-bsp  ??= "ele ele-seco prime"
