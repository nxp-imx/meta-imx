SRCBRANCH = "lf-6.18.37_2.1.0"
XEN_SRC ?= "git://github.com/nxp-imx/imx-xen.git;protocol=https"
SRC_URI = " ${XEN_SRC};branch=${SRCBRANCH} \
            file://0001-ARM-Drop-ThumbEE-support.patch"
SRCREV = "2462d83ce368ffe0ffe747a66387868eff93053b"
XEN_REL = "4.21.imx"
PV = "${XEN_REL}+stable"
