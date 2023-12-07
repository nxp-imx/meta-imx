LIC_FILES_CHKSUM = "file://LICENSE;md5=8636bd68fc00cc6a3809b7b58b45f982"

DEPENDS = " openssl"

SRCBRANCH = "lf-6.1.36_2.1.0"
KEYCTL_CAAM_SRC ?= "git://github.com/nxp-imx/keyctl_caam.git;protocol=https"
SRC_URI = "${KEYCTL_CAAM_SRC};branch=${SRCBRANCH}"

SRCREV = "8dba6d3cac24b5a6c8daaaf1eda70fa18d488139"

EXTRA_OEMAKE = " OPENSSL_PATH=${STAGING_INCDIR}"
