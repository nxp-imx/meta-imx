SRCBRANCH = "lf-6.18.20_2.0.0"
KEYCTL_CAAM_SRC ?= "git://github.com/nxp-imx/keyctl_caam.git;protocol=https"
SRC_URI = "${KEYCTL_CAAM_SRC};branch=${SRCBRANCH}"

SRCREV = "71cb18f17d766145217a5517748e37e250b055bf"

