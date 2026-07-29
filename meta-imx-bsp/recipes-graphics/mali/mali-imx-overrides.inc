require mali-imx.inc

FILES:${PN}-libvulkan = " \
    ${datadir}/vulkan"

RPROVIDES:${PN}-opencl-icd = "virtual-opencl-icd"

# TODO: Resolve QA issues and remove these skips
INSANE_SKIP:${PN} += "ldflags"
INSANE_SKIP:${PN}-dev += "ldflags"
INSANE_SKIP:${PN}-libegl += "ldflags"
INSANE_SKIP:${PN}-libegl += "ldflags"
INSANE_SKIP:${PN}-libgbm += "ldflags"
INSANE_SKIP:${PN}-libgles1 += "ldflags"
INSANE_SKIP:${PN}-libgles2 += "ldflags"
INSANE_SKIP:${PN}-opencl-icd-dev += "ldflags"
INSANE_SKIP:${PN}-libvulkan += "ldflags"

COMPATIBLE_MACHINE = "(imxmali)"
