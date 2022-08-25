require recipes-graphics/imx-gpu-apitrace/imx-gpu-apitrace_10.0.0.bb

APITRACE_SRC ?= "git://github.com/nxp-imx/apitrace-imx.git;protocol=https"
SRCBRANCH = "imx_10.0"
SRC_URI = "${APITRACE_SRC};branch=${SRCBRANCH} \
           file://0001-dlsym-workaround-glibc-2.34-build-failure.patch"
SRCREV = "90a59407f1cddd31b4dac67e5a2500100eb091bc" 
