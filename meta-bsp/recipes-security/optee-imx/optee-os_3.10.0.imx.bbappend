SRCBRANCH = "lf_3.10.y"
OPTEE_OS_SRC ?= "git://source.codeaurora.org/external/imx/imx-optee-os.git;protocol=https"
SRC_URI = "${OPTEE_OS_SRC};branch=${SRCBRANCH}"
SRCREV = "de5843f308341388acb513769d65ddb29fda2dcb"

PLATFORM_FLAVOR_mx8mnlite = "mx8mnevk"
