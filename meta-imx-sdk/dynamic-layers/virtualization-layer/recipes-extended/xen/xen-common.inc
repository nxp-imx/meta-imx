SRCBRANCH = "imx-4.21.y"
XEN_SRC ?= "git://github.com/nxp-imx/imx-xen.git;protocol=https"
SRC_URI = " ${XEN_SRC};branch=${SRCBRANCH} \
            file://0001-ARM-Drop-ThumbEE-support.patch"
SRCREV = "aa2ca7a7c497a5213ca1ad9f70f1dcc7ad3c2926"
XEN_REL = "4.21.imx"
PV = "${XEN_REL}+stable"
