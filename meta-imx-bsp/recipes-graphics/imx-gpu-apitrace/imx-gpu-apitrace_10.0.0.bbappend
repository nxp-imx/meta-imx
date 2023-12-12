SRC_URI = "${APITRACE_SRC};branch=${SRCBRANCH} \
           file://0001-dlsym-workaround-glibc-2.34-build-failure.patch"
APITRACE_SRC ?= "git://github.com/nxp-imx/apitrace-imx.git;protocol=https"
SRCBRANCH = "imx_10.0"
SRCREV = "522cb2981289b7ba20d6dd4b4bf75097e079815b"

DEPENDS:remove:mx95-nxp-bsp = "imx-gpu-viv"
PACKAGECONFIG_BACKEND:mx95-nxp-bsp = "waffle"
PACKAGECONFIG_GPU2D:mx95-nxp-bsp   = ""
