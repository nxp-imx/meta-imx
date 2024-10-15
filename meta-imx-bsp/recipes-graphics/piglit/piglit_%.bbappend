FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-tests-Fix-cl-test-Include-Directories-error-Error-0-.patch"

PACKAGECONFIG:append = " \
    ${PACKAGECONFIG_GBM} \
    ${PACKAGECONFIG_VULKAN}"

PACKAGECONFIG_GBM                    ?= "gbm"
PACKAGECONFIG_GBM:imxgpu:mx6-nxp-bsp  = ""
PACKAGECONFIG_GBM:imxgpu:mx7-nxp-bsp  = ""

PACKAGECONFIG_VULKAN ?= "${@bb.utils.filter('DISTRO_FEATURES', 'vulkan', d)}"

PACKAGECONFIG[gbm] = "-DPIGLIT_USE_GBM=1,-DPIGLIT_USE_GBM=0,virtual/libgbm"
