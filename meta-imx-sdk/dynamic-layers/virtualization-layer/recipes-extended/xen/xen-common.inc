SRCBRANCH = "imx-4.21.y"
XEN_SRC ?= "git://github.com/nxp-imx/imx-xen.git;protocol=https"
SRC_URI = " ${XEN_SRC};branch=${SRCBRANCH} \
            file://0001-ARM-Drop-ThumbEE-support.patch"
SRCREV = "0b097630a49d235ed9cfde3a6746c523635a04d2"
XEN_REL = "4.21.imx"
PV = "${XEN_REL}+stable"
