FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://0001-openssl-3.0-add-Kernel-TLS-configuration.patch \
    file://0002-e_devcrypto-add-func-ptr-for-init-do-ctrl.patch \
    file://0003-e_devcrypto-add-support-for-TLS1.2-algorithms-offloa.patch \
    file://0004-Set-algorithm-id-before-generating-the-EC-key.patch"
SRC_URI:remove = " \
    file://0002-e_devcrypto-add-func-ptr-for-init-do-ctrl.patch \
    file://0003-e_devcrypto-add-support-for-TLS1.2-algorithms-offloa.patch"

PACKAGECONFIG:append:imx-nxp-bsp = " cryptodev-linux"

EXTRA_OECONF:append = " enable-ktls"
