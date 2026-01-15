require imx-gpu-viv-6-overrides.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

IMX_SRCREV_ABBREV = "534042c"

SRC_URI[sha256sum] = "2d775038e2e888184c0f6a602de0d1d5432d2fe133e04432aaabef81628a9919"

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
