require recipes-graphics/mali/mali-imx.inc

FILES:${PN}-libvulkan = " \
    ${datadir}/vulkan"

RPROVIDES:${PN}-libopencl = "virtual-opencl-icd"

COMPATIBLE_MACHINE = "(imxmali)"
