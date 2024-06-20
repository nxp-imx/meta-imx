# Copyright 2020-2021,2024 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Packagegroup for i.MX security packages"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS:${PN} = " \
    e2fsprogs-mke2fs \
    ${RDEPENDS_CAAM_CRYPTO_APPS} \
    keyutils \
    lvm2 \
    util-linux \
    ${@bb.utils.contains('MACHINE_FEATURES', 'optee', 'smw-tests', '', d)} \
    ${RDEPENDS_EDGE_LOCK} \
"

RDEPENDS_EDGE_LOCK ?= " \
    openssl-provider-se050 \
    plug-and-trust-ecc \
    ${RDEPENDS_EDGE_LOCK_SECURE_ENCLAVE} \
"

RDEPENDS_CAAM_CRYPTO_APPS ?= "keyctl-caam crypto-af-alg python3-requests"
RDEPENDS_CAAM_CRYPTO_APPS:mx91-nxp-bsp = ""
RDEPENDS_CAAM_CRYPTO_APPS:mx93-nxp-bsp = ""
RDEPENDS_CAAM_CRYPTO_APPS:mx95-nxp-bsp = ""

RDEPENDS_EDGE_LOCK_SECURE_ENCLAVE = ""
RDEPENDS_EDGE_LOCK_SECURE_ENCLAVE:mx8ulp-nxp-bsp = "itest python3-requests"
RDEPENDS_EDGE_LOCK_SECURE_ENCLAVE:mx91-nxp-bsp   = "itest python3-requests"
RDEPENDS_EDGE_LOCK_SECURE_ENCLAVE:mx93-nxp-bsp   = "itest python3-requests"
RDEPENDS_EDGE_LOCK_SECURE_ENCLAVE:mx95-nxp-bsp   = "itest python3-requests"
