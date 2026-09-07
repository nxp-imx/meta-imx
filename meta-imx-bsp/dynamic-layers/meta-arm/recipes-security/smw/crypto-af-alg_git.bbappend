# Copyright 2026 NXP

SRCBRANCH = "lf-6.18.37_2.1.0"
CRYPTO_AF_ALG_SRC ?= "git://github.com/nxp-imx/crypto_af_alg.git;protocol=https"
SRC_URI = "${CRYPTO_AF_ALG_SRC};branch=${SRCBRANCH}"
SRCREV = "a62b3ab1718ebfe9edd6747fb7539e4b3e43ca14"
