SRCBRANCH = "master"
OPTEE_CLIENT_SRC ?= "git://source.codeaurora.org/external/imx/imx-optee-client.git;protocol=https"
SRC_URI = " \
    ${OPTEE_CLIENT_SRC};branch=${SRCBRANCH} \
    file://tee-supplicant.service \
"
SRCREV = "2c812c5b4f81a97687fb42196c1225545cbeb7e8"
