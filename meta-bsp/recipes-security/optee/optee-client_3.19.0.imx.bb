require recipes-security/optee/optee-client.inc

DEPENDS = "util-linux-libuuid"

SRC_URI:remove = "git://github.com/OP-TEE/optee_client.git;branch=master;protocol=https"
SRC_URI:prepend = "${OPTEE_CLIENT_SRC};branch=${SRCBRANCH} "
OPTEE_CLIENT_SRC ?= "git://github.com/nxp-imx/imx-optee-client.git;protocol=https"
SRCBRANCH = "lf-6.1.1_1.0.0"
SRCREV = "895a924ddd8e770b23442b6a45771d7e14dd6fb2" 

inherit pkgconfig
