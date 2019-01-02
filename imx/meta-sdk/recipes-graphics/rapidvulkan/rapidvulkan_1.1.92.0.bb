SUMMARY = "Low level header only C++11 RAII wrapper classes for the Vulkan API"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b98f636daed34d12d11e25f3185c0204"

SRC_URI = "git://github.com/Unarmed1000/RapidVulkan;protocol=https \
"
SRCREV = "4d1280027d2c5a5b2d01886504a9ab6f5aac928a"

S = "${WORKDIR}/git"

do_install () {
    install -d ${D}${includedir}
    cp -r ${S}/include/* ${D}${includedir}
}
