require mali-imx.inc

FILES:${PN}-libvulkan = " \
    ${datadir}/vulkan"

RPROVIDES:${PN}-opencl-icd = "virtual-opencl-icd"

COMPATIBLE_MACHINE = "(imxmali)"
