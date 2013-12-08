SECTION = "devel"
SUMMARY = "Linux Cryptodev KERNEL MODULE"
DESCRIPTION = "The Cryptodev package contains the kernel /dev/crypto module"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"
RCONFLICTS_${PN} = "ocf-linux"

inherit module

PR = "r1"
DEPENDS += "virtual/kernel openssl"

SRCREV = "1c24a0aa996630518d47826a2e3fea129ea094c7"

SRC_URI = "git://repo.or.cz/cryptodev-linux.git;protocol=git \
           file://makefile-fixup.patch \
           file://Add-the-compile-and-install-rules-for-cryptodev-test.patch"

EXTRA_OEMAKE='KERNEL_DIR="${STAGING_KERNEL_DIR}" PREFIX="${D}"'

S = "${WORKDIR}/git"
python () {
    ma = d.getVar("DISTRO_FEATURES", True)
    arch = d.getVar("OVERRIDES", True)
    error_qa = d.getVar('ERROR_QA', True)
    if 'arch' in error_qa:
        d.setVar('ERROR_QA', error_qa.replace(' arch', ''))
}

do_compile_append() {
    oe_runmake testprogs
}

do_install_append() {
    oe_runmake install_tests
}

PACKAGES += "${PN}-tests"
FILES_${PN}-dbg += "${bindir}/tests_cryptodev/.debug"
FILES_${PN}-tests = "${bindir}/tests_cryptodev/*"
