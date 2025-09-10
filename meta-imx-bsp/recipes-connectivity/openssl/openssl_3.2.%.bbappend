FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://openssl-3.0-add-Kernel-TLS-configuration.patch \
            file://0001-e_devcrypto-add-func-ptr-for-init-do-ctrl.patch \
            file://0002-e_devcrypto-add-support-for-TLS1.2-algorithms-offloa.patch \
            file://0003-Set-algorithm-id-before-generating-the-EC-key.patch \
            file://0004-Amend-the-design-of-AlgorithmIdentifier-parameter-pa.patch"

PACKAGECONFIG:append:imx-nxp-bsp = " cryptodev-linux"

EXTRA_OECONF:append = " enable-ktls"
