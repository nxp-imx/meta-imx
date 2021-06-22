
GN_ARGS += ' \
        use_lld=false \
'
# gbm is availiable only for mx8, but still drop it for 8MQ in 2020 Q4 release
GN_ARGS_append_mx6 = " use_system_minigbm=false use_wayland_gbm=false"
GN_ARGS_append_mx7 = " use_system_minigbm=false use_wayland_gbm=false"
GN_ARGS_append_mx8 = " use_system_minigbm=false use_wayland_gbm=false"

CHROMIUM_EXTRA_ARGS_append = " --disable-features=VizDisplayCompositor --in-process-gpu --disable-gpu-compositing"
