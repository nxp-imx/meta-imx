# Copyright 2023-2025 NXP
SUMMARY = "NXP i.MX EdgeLock 2GO IoT Agent"
DESCRIPTION = "NXP i.MX EdgeLock 2GO IoT Agent"
SECTION = "base"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=175792518e4ac015ab6696d16c4f607e"
DEPENDS = "smw el2go-agent-mbedtls"

SRC_URI = "${EL2GO_AGENT_SRC};branch=${SRCBRANCH}"
EL2GO_AGENT_SRC ?= "git://github.com/NXP/el2go-agent;protocol=https"
SRCBRANCH = "release/v6.12.49-2.2.0-yocto"
SRCREV = "deccd425cce7a3493b6bc2caf900363f09804a2a"
S = "${WORKDIR}/git"

inherit cmake

CFLAGS[unexport] = "1"
CPPFLAGS[unexport] = "1"
AS[unexport] = "1"
LD[unexport] = "1"

ASNEEDED = ""

EXTRA_OECMAKE = " \
    -DSSS_HAVE_HOSTCRYPTO_MBEDTLS=ON \
    -DNXP_IOT_AGENT_HAVE_PSA_IMPL_SMW=ON \
    -DSSS_HAVE_MBEDTLS_ALT_PSA=ON \
    -DSSS_HAVE_HOST_LINUX_LIKE=ON \
    -DCMAKE_SYSROOT=${STAGING_DIR_HOST} \
    -DMbedTLS_DIR=${STAGING_DIR_HOST}/usr/local/el2go/${baselib}/cmake/MbedTLS \
    -DNXP_SMW_DIR=${STAGING_LIBDIR}/cmake"

CFLAGS:append = " -DMBEDTLS_SSL_MAX_CONTENT_LEN=4096"
CFLAGS:append = " -DMBEDTLS_USE_PSA_CRYPTO"

COMPATIBLE_MACHINE = "(imx-nxp-bsp)"
