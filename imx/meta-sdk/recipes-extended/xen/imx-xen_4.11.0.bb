FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
require xen.inc

SRCBRANCH = "imx_4.11.y"
XEN_SRC ?= "git://source.codeaurora.org/external/imx/imx-xen.git;protocol=https"

SRC_URI = " \
    ${XEN_SRC};branch=${SRCBRANCH} \
    file://tools-xentop-vwprintw.patch \
    file://xen-4.11-arm-acpi-fix-string-lengths.patch \
    "

SRCREV = "9ea5b6d1bda24fa4fd7f6d64b579126af1499c40"

S = "${WORKDIR}/git"

FILES_${PN}-scripts-common += " ${sysconfdir}/xen/*.cfg"

# provides for qemu build and runtime
PROVIDES = "xen"
RPROVIDES_${PN}-libxenstore += "xen-libxenstore"
RPROVIDES_${PN}-libxenctrl += "xen-libxenctrl"
RPROVIDES_${PN}-libxenguest += "xen-libxenguest"
