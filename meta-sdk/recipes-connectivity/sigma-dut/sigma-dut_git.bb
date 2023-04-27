SUMMARY = "Tools for WFA Sigma DUT/CA"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://README;md5=cb7b88c5098324bb9a20d2a79d76327e"
SECTION = "base"

SRC_URI = "git://github.com/qca/sigma-dut.git;protocol=https;branch=master; \
           file://0001-Add-handling-of-DYN_BW_SGNL-command-for-AP-mode.patch \
           file://0001-Add-handling-of-DYN_BW_SGNL-command-for-DRIVER_LINUX.patch \
"

SRCREV = "fd7359aed6aaba745e31dd0a9fed80578372d554"

S = "${WORKDIR}/git"

do_install() {
        install -d ${D}${sbindir}
        install -m 0755 ${S}/sigma_dut ${D}${sbindir}/
}
