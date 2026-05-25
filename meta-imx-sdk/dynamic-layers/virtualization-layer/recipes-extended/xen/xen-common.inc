SRCBRANCH = "lf-6.18.20_2.0.0"
XEN_SRC ?= "git://github.com/nxp-imx/imx-xen.git;protocol=https"
SRC_URI = " ${XEN_SRC};branch=${SRCBRANCH} \
            file://0001-ARM-Drop-ThumbEE-support.patch"
SRCREV = "7cbfe70d1d303ba06e4d3f1632c72cd3710d9ee2"
XEN_REL = "4.21.imx"
PV = "${XEN_REL}+stable"
