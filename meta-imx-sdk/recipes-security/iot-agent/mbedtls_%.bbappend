FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

PACKAGECONFIG:append:imx-nxp-bsp = " psa"

SRC_URI:append:imx-nxp-bsp = " \
    file://mbedtls_user_config.h \
    file://0001-crypto_struct-change-psa_key_attributes_t-layout.patch \
    file://0002-library-tls-disable-PSA-APIs-for-most-operations.patch \
"

# remove this option as it causes cmake to generate a non-relocatable
# package (${libdir} is an absolute path)
EXTRA_OECMAKE:remove:imx-nxp-bsp = " -DLIB_INSTALL_DIR:STRING=${libdir}"

EXTRA_OECMAKE:append:imx-nxp-bsp = " \
    -DMBEDTLS_USER_CONFIG_FILE:STRING=${WORKDIR}/mbedtls_user_config.h \
"
