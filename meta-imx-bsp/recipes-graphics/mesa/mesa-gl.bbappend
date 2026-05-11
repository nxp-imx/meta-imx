DEPENDS:append:imxgpu = " virtual/egl"

do_install:append:imxgpu() {
    if [ "${IMX_MALI_DUAL_DRIVER}" != "1" ]; then
        # imx-gpu-viv and mali-imx both provide /usr/include/KHR, so drop the mesa-gl one
        rm -rf ${D}${includedir}/KHR
    fi
}

COMPATIBLE_MACHINE:imxgpu = "(imxgpu)"
