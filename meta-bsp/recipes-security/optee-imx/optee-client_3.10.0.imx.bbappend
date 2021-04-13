SRCBRANCH = "lf-5.10.y_1.0.0"
OPTEE_CLIENT_SRC ?= "git://source.codeaurora.org/external/imx/imx-optee-client.git;protocol=https"
SRC_URI = " \
    ${OPTEE_CLIENT_SRC};branch=${SRCBRANCH} \
    file://tee-supplicant.service \
"
