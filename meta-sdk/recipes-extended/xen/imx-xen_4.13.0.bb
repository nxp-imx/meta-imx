FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
require xen.inc

SRCBRANCH = "imx_5.4.47_2.2.0"
XEN_SRC ?= "git://source.codeaurora.org/external/imx/imx-xen.git;protocol=https"

SRC_URI = " \
    ${XEN_SRC};branch=${SRCBRANCH} \
    "

SRCREV = "f538d6cef34515fedb923a10774766f15487d2ab" 

S = "${WORKDIR}/git"

FILES_${PN}-scripts-common += " ${sysconfdir}/xen/*.cfg"

# provides for qemu build and runtime
PROVIDES = "xen"
RPROVIDES_${PN}-libxenstore += "xen-libxenstore"
RPROVIDES_${PN}-libxenctrl += "xen-libxenctrl"
RPROVIDES_${PN}-libxenguest += "xen-libxenguest"

COMPATIBLE_MACHINE = "(mx8qm)"
