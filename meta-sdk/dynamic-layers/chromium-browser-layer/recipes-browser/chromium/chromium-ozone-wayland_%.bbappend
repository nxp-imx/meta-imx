FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-Fixed-chromium-flicker-with-g2d-renderer.patch \
            file://0001-chromium-met-EGL-API-GetProcAddress-failures.patch \
            file://0001-Disable-dri-for-imx-gpu.patch"

GN_ARGS_DISABLE_GBM     = ""
GN_ARGS_DISABLE_GBM:mx6 = "use_system_minigbm=false use_wayland_gbm=false"
GN_ARGS_DISABLE_GBM:mx7 = "${GN_ARGS_DISABLE_GBM:mx6}"
GN_ARGS_USE_IMXGPU        = "use_imxgpu=false"
GN_ARGS_USE_IMXGPU:imxgpu = "use_imxgpu=true"
GN_ARGS += "${GN_ARGS_DISABLE_GBM} ${GN_ARGS_USE_IMXGPU}"

CHROMIUM_EXTRA_ARGS:append = " --disable-features=VizDisplayCompositor --in-process-gpu"
