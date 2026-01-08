LIC_FILES_CHKSUM = "file://LICENSE;md5=8636bd68fc00cc6a3809b7b58b45f982"

DEPENDS = " openssl"

SRCBRANCH = "lf-6.18.2_1.0.0"
KEYCTL_CAAM_SRC ?= "git://github.com/nxp-imx/keyctl_caam.git;protocol=https"
SRC_URI = "${KEYCTL_CAAM_SRC};branch=${SRCBRANCH}"

SRCREV = "71cb18f17d766145217a5517748e37e250b055bf"

EXTRA_OEMAKE = " OPENSSL_PATH=${STAGING_INCDIR}"
