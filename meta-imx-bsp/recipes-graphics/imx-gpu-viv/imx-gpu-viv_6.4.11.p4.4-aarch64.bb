require imx-gpu-viv-6-overrides.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

IMX_SRCREV_ABBREV = "9e39e12"

SRC_URI[sha256sum] = "70b6c11f6f1f2d0fadb9c90f62fab9f50347abf0caa9b5a161ac047862e89381"

do_install:prepend() {
    if [ "${IS_MX8}" = "1" ]; then
        if [ ! -z "${PACKAGES_VULKAN}" ]; then
            mkdir -p ${S}/gpu-core/etc/vulkan/icd.d
            mv ${S}/gpu-core/usr/share/vulkan/icd.d/verisilicon_icd.json ${S}/gpu-core/etc/vulkan/icd.d/imx_icd.json
        fi
    fi
}

do_install:append() {
    if [ "${IS_MX8}" = "1" ]; then
        if [ ! -z "${PACKAGES_VULKAN}" ]; then
            mkdir -p ${D}${datadir}/vulkan/icd.d
            mv ${D}${sysconfdir}/vulkan/icd.d/imx_icd.json ${D}${datadir}/vulkan/icd.d/verisilicon_icd.json
        fi
    fi
}

COMPATIBLE_MACHINE = "(mx8-nxp-bsp)"
