require imx-gpu-viv-6-overrides.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

IMX_SRCREV_ABBREV = "8626797"

SRC_URI[sha256sum] = "491d25c0b24ffac29e671e9a1be9081bbd48a566d08b94ffd7b982cc35be7f4e"

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
