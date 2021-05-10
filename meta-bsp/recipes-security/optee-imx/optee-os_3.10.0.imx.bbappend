SRCBRANCH = "lf_3.10.y"
OPTEE_OS_SRC ?= "git://source.codeaurora.org/external/imx/imx-optee-os.git;protocol=https"
SRC_URI = "${OPTEE_OS_SRC};branch=${SRCBRANCH}"
SRCREV = "58e81912d5ea0a3a95b57e671bb4535132596389"

PLATFORM_FLAVOR_mx8mnul = "mx8mnevk"
