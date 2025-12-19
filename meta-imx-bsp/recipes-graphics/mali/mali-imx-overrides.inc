require recipes-graphics/mali/mali-imx.inc

FILES:${PN}-libvulkan = " \
    ${datadir}/vulkan"

COMPATIBLE_MACHINE = "(imxmali)"
