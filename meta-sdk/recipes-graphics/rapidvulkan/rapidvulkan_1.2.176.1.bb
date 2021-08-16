SUMMARY = "Low level header only C++11 RAII wrapper classes for the Vulkan API"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b98f636daed34d12d11e25f3185c0204"

DEPENDS = "vulkan-headers vulkan-loader"

SRC_URI = "git://github.com/Unarmed1000/RapidVulkan;protocol=https"
SRCREV = "ec9e4945028465c63fc3ae7df403e72a1b31d6ee"

S = "${WORKDIR}/git"

inherit cmake

ALLOW_EMPTY:${PN} = "1"
