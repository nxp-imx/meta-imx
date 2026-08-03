SRCBRANCH = "imx-4.21.y"
XEN_SRC ?= "git://github.com/nxp-imx/imx-xen.git;protocol=https"
SRC_URI = " ${XEN_SRC};branch=${SRCBRANCH} \
            file://0001-ARM-Drop-ThumbEE-support.patch"
SRCREV = "bfe15beb5b87069d4e4aa25cbcb2bcacd000682c"
XEN_REL = "4.21.imx"
PV = "${XEN_REL}+stable"
