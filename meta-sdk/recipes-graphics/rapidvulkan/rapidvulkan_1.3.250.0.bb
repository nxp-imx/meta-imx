SUMMARY = "Low level header only C++11 RAII wrapper classes for the Vulkan API"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b98f636daed34d12d11e25f3185c0204"

DEPENDS = "vulkan-loader"

SRC_URI = "git://github.com/Unarmed1000/RapidVulkan;protocol=https;branch=master"
SRCREV = "186a85bea780414f55baec2b6c803002080b4ac8"

S = "${WORKDIR}/git"

inherit cmake

ALLOW_EMPTY:${PN} = "1"
