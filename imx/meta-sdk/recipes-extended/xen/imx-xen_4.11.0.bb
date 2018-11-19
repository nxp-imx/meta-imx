FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
require xen.inc

SRCBRANCH = "imx_4.14.78_1.0.0_ga"
XEN_SRC ?= "git://source.codeaurora.org/external/imx/imx-xen.git;protocol=https"

SRC_URI = " \
    ${XEN_SRC};branch=${SRCBRANCH} \
    file://tools-xentop-vwprintw.patch \
    "

SRCREV = "633581fd3fe94ca2f003679fcd24b3b9b35f9ebf"

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "${@bb.utils.contains('MACHINE_FEATURES', 'xen', '${MACHINE}', '(^$)', d)}"
