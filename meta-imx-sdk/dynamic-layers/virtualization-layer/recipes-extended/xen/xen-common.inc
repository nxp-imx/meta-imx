SRCBRANCH = "imx-4.21.y"
XEN_SRC ?= "git://github.com/nxp-imx/imx-xen.git;protocol=https"
SRC_URI = " ${XEN_SRC};branch=${SRCBRANCH} \
            file://0001-ARM-Drop-ThumbEE-support.patch"
SRCREV = "90a84d3951abec9c9fcfacc24c2e59c996884804"
XEN_REL = "4.21.imx"
PV = "${XEN_REL}+stable"
