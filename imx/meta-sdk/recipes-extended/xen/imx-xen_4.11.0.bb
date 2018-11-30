FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
require xen.inc

SRCBRANCH = "imx_4.14.78_1.0.0_ga"
XEN_SRC ?= "git://source.codeaurora.org/external/imx/imx-xen.git;protocol=https"

SRC_URI = " \
    ${XEN_SRC};branch=${SRCBRANCH} \
    file://tools-xentop-vwprintw.patch \
    "

SRCREV = "a55884ea96df772e8b5071837d73a6d198325a0d"

S = "${WORKDIR}/git"

FILES_${PN}-scripts-common += " ${sysconfdir}/xen/*.cfg"

COMPATIBLE_MACHINE = "${@bb.utils.contains('MACHINE_FEATURES', 'xen', '${MACHINE}', '(^$)', d)}"
