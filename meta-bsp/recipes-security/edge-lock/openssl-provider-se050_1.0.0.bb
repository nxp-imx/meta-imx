SUMMARY = "OpenSSL Provider for SE050"
DESCRIPTION="An OpenSSL provider for NXP EdgeLock SE050 secure element product family."
SECTION = "libs"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "gitsm://github.com/NXPPlugNTrust/se05x-openssl-provider.git;protocol=https;branch=main"
SRCREV = "0f7c63e30ba379e0ed911539ffc8c6c4531fec12"

S = "${WORKDIR}/git"

inherit cmake

PACKAGECONFIG ??= "host-openssl"

PACKAGECONFIG[host-mbedtls] = "-DPTMW_HostCrypto=MBEDTLS,,mbedtls,,,host-openssl host-none"
PACKAGECONFIG[host-openssl] = "-DPTMW_HostCrypto=OPENSSL,,openssl,,,host-mbedtls host-none"
PACKAGECONFIG[host-none]    = "-DPTMW_HostCrypto=None   ,,       ,,,host-mbedtls host-openssl"

EXTRA_OECMAKE = " \
    -DPTMW_Applet=${APPLET} \
    -DPTMW_SE05X_Ver=${APPLET_VERSION} \
    -DPTMW_SE05X_Auth=${APPLET_AUTH} \
    "

APPLET         ?= "SE05X_C"
APPLET_VERSION ?= "07_02"
APPLET_AUTH    ?= "None"

SOLIBS = ".so"
FILES_SOLIBSDEV = ""
