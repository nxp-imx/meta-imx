FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
require xen.inc
require xen-hypervisor.inc

SRCBRANCH = "lf-5.10.y_4.13"
XEN_SRC ?= "git://github.com/nxp-imx/imx-xen.git;protocol=https"

LIC_FILES_CHKSUM ?= "file://COPYING;md5=4295d895d4b5ce9d070263d52f030e49"

SRC_URI = " \
    ${XEN_SRC};branch=${SRCBRANCH} \
    file://xen-arm64-implement-atomic-fetch-add.patch \                         
    "

SRCREV = "f538d6cef34515fedb923a10774766f15487d2ab" 

S = "${WORKDIR}/git"

FILES_${PN}-scripts-common += " ${sysconfdir}/xen/*.cfg"

COMPATIBLE_MACHINE = "(mx8qm)"

