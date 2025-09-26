FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += " file://0001-permute_vector.h-Fix-GCC-15-build-issue.patch"
SRCBRANCH = "imx-main"
SRCREV = "5395e0d6932594b614f53d4edfc5d13a43ae2ef0" 

COMPATIBLE_MACHINE               = "(^$)"
COMPATIBLE_MACHINE:mx8-nxp-bsp   = "(imxviv)"
COMPATIBLE_MACHINE:mx8mm-nxp-bsp = "(^$)"
