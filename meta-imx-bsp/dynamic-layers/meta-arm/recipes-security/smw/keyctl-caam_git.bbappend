SRCBRANCH = "lf-6.18.37_2.1.0"
KEYCTL_CAAM_SRC ?= "git://github.com/nxp-imx/keyctl_caam.git;protocol=https"
SRC_URI = "${KEYCTL_CAAM_SRC};branch=${SRCBRANCH}"
SRCREV = "fc0fb26be28f645d155c69245ec0fb93d9414662"
