require xen.inc

SRCBRANCH = "imx_4.10"                                                          
XEN_SRC ?= "git://source.codeaurora.org/external/imx/imx-xen.git;protocol=https"
SRC_URI = "${XEN_SRC};branch=${SRCBRANCH}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "${@bb.utils.contains('MACHINE_FEATURES', 'xen', '${MACHINE}', '(^$)', d)}"
