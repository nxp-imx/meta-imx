require recipes-graphics/mali/mali-imx.inc

do_install:append() {
    install -d ${D}${sysconfdir}/modprobe.d
    # Blacklist Mesa module for arm-ddk
    cat > ${D}${sysconfdir}/modprobe.d/mali-imx.conf << EOF
# Mali DDK configuration - blacklist Mesa Panthor driver
blacklist panthor
EOF
}

FILES:${PN}-libvulkan = " \
    ${datadir}/vulkan"

RPROVIDES:${PN}-opencl-icd = "virtual-opencl-icd"

COMPATIBLE_MACHINE = "(imxmali)"
