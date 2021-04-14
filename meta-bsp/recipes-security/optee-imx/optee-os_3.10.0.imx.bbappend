SRCBRANCH = "master"
OPTEE_OS_SRC ?= "git://source.codeaurora.org/external/imx/imx-optee-os.git;protocol=https"
SRC_URI = "${OPTEE_OS_SRC};branch=${SRCBRANCH}"
SRCREV = "409c619b3e989ae8b24eca782cad1090aa1ca0de"

PLATFORM_FLAVOR_mx8mnlite = "mx8mnevk"
