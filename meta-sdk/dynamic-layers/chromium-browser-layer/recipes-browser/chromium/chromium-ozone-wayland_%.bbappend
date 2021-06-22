
GN_ARGS_DISABLE_GBM     = ""
GN_ARGS_DISABLE_GBM_mx6 = "use_system_minigbm=false use_wayland_gbm=false"
GN_ARGS_DISABLE_GBM_mx7 = "${GN_ARGS_DISABLE_GBM_mx6}"
GN_ARGS += "${GN_ARGS_DISABLE_GBM}"

CHROMIUM_EXTRA_ARGS_append = " --disable-features=VizDisplayCompositor --in-process-gpu --disable-gpu-compositing"
