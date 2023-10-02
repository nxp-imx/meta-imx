require recipes-security/optee/optee-client.inc

FILESEXTRAPATHS:prepend := "${THISDIR}/optee-client:"

DEPENDS = "util-linux-libuuid"

SRC_URI:remove = "git://github.com/OP-TEE/optee_client.git;branch=master;protocol=https"
SRC_URI:prepend = "${OPTEE_CLIENT_SRC};branch=${SRCBRANCH} "

OPTEE_CLIENT_SRC ?= "git://github.com/nxp-imx/imx-optee-client.git;protocol=https"

inherit pkgconfig

EXTRA_OECMAKE += "-DCFG_TEE_CLIENT_LOAD_PATH=${nonarch_base_libdir}"
