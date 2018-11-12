SUMMARY = "Low level header only C++11 RAII wrapper classes for the Vulkan API"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b98f636daed34d12d11e25f3185c0204"

SRC_URI = "git://github.com/Unarmed1000/RapidVulkan;protocol=https;branch=v1.0.68.0 \
"
SRCREV = "d300368486fb38db4e24e1c8bb510c06840ccd95"

S = "${WORKDIR}/git"

do_install () {
    install -d ${D}${includedir}
    cp -r ${S}/include/* ${D}${includedir}
}
