SRCBRANCH = "imx-4.21.y"
XEN_SRC ?= "git://github.com/nxp-imx/imx-xen.git;protocol=https"
SRC_URI = " ${XEN_SRC};branch=${SRCBRANCH} \
            file://0001-ARM-Drop-ThumbEE-support.patch"
SRCREV = "6e4e9a731302144044dbf540c6cbba08b88c4378"
XEN_REL = "4.21.imx"
PV = "${XEN_REL}+stable"
