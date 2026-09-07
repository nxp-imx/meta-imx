# Copyright 2026 NXP

SRCBRANCH = "lf-6.18.2_1.0.0"
CRYPTO_AF_ALG_SRC ?= "git://github.com/nxp-imx/crypto_af_alg.git;protocol=https"
SRC_URI = "${CRYPTO_AF_ALG_SRC};branch=${SRCBRANCH}"
SRCREV = "2fb11a600af90c80b8bb23368d1d6831c5deb973"
