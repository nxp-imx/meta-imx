SECTION = "devel"
SUMMARY = "Linux Cryptodev"
DESCRIPTION = "The Cryptodev native headers for openssl"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"
RCONFLICTS_${PN} = "ocf-linux"

inherit module

SRCREV = "1c24a0aa996630518d47826a2e3fea129ea094c7"

SRC_URI = "git://repo.or.cz/cryptodev-linux.git;protocol=git"
S = "${WORKDIR}/git"


do_compile() {
    echo "do nothing just need headers"
}

do_install() {
    cd ${S}
    install -d  ${STAGING_INCDIR_NATIVE}/crypto
    install -m 0644 ${S}/crypto/*.h  ${STAGING_INCDIR_NATIVE}/crypto/
    install -d  ${STAGING_INCDIR}/crypto
    install -m 0644 ${S}/crypto/*.h  ${STAGING_INCDIR}/crypto/
}

ALLOW_EMPTY_${PN} = "1"
BBCLASSEXTEND = "native nativesdk"
