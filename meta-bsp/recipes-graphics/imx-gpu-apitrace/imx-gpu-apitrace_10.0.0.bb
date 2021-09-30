require recipes-graphics/imx-gpu-apitrace/imx-gpu-apitrace_9.0.0.bb

APITRACE_SRC ?= "git://source.codeaurora.org/external/imx/apitrace-imx.git;protocol=https"
SRCBRANCH = "imx_10.0"
SRC_URI = "${APITRACE_SRC};branch=${SRCBRANCH}"
SRCREV = "90a59407f1cddd31b4dac67e5a2500100eb091bc"
