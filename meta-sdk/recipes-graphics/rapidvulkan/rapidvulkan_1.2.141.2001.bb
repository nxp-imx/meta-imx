SUMMARY = "Low level header only C++11 RAII wrapper classes for the Vulkan API"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b98f636daed34d12d11e25f3185c0204"

DEPENDS = "vulkan-headers vulkan-loader"

SRC_URI = "git://github.com/Unarmed1000/RapidVulkan;protocol=https"
SRCREV = "095ea7b73074ca84bf499ef9c2b6924a835aedc0"

S = "${WORKDIR}/git"

inherit cmake

ALLOW_EMPTY_${PN} = "1"
