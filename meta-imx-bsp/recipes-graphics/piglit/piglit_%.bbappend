FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-tests-Fix-cl-test-Include-Directories-error-Error-0-.patch \
            file://0001-tests-Fix-cl-test-program-execute-builtin-builtin-fl.patch \
"

PACKAGECONFIG += "${PACKAGECONFIG_VULKAN}"
PACKAGECONFIG_VULKAN ?= "${@bb.utils.filter('DISTRO_FEATURES', 'vulkan', d)}"
