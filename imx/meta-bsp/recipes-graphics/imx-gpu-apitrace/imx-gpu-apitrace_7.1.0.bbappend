
APITRACE_SRC ?= "git://source.codeaurora.org/external/imx/apitrace-imx.git;protocol=https"
SRCBRANCH = "imx_7.1"
SRC_URI = "${APITRACE_SRC};branch=${SRCBRANCH}"
SRCREV = "013499c63d9eddd8c792bd8b136991caa3b8a100"

PACKAGECONFIG[x11] = "-DENABLE_X11=ON,-DENABLE_X11=OFF"
