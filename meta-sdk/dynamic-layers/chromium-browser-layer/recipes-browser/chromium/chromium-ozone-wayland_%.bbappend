FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-Fixed-chromium-flicker-with-g2d-renderer.patch \
            file://0001-chromium-met-EGL-API-GetProcAddress-failures.patch \
            file://0001-Disable-dri-for-imx-gpu.patch \
"

APPEND_PATCH = "file://0001-FFmpeg-enable-vp8-vp9-h264-hevc-v4l2-config.patch \
                file://0002-FFmpeg-change-call-sequence-to-pass-unit-test.patch \
                file://0003-FFmpeg-add-flush-operation-and-correct-timestamp.patch \
                file://0004-FFmpeg-correctly-select-decoder-according-to-soc_id.patch \
                file://0005-Chromium-enable-proprietary-codecs-and-support-HEVC-.patch \
                file://0006-Chromium-get-video-buffer-from-ffmpeg-and-correct-pt.patch \
                file://0007-Chromium-change-stride-alignment-from-32-to-16.patch \
"
SRC_URI:append:mx8-nxp-bsp = " ${APPEND_PATCH}"

GN_ARGS_DISABLE_GBM     = ""
GN_ARGS_DISABLE_GBM:mx6-nxp-bsp = "use_system_minigbm=false use_wayland_gbm=false"
GN_ARGS_DISABLE_GBM:mx7-nxp-bsp = "${GN_ARGS_DISABLE_GBM:mx6-nxp-bsp}"
GN_ARGS_USE_IMXGPU        = "use_imxgpu=false"
GN_ARGS_USE_IMXGPU:imxgpu = "use_imxgpu=true"
GN_ARGS_ENABLE_PROPRIETARY_CODECS = ""
GN_ARGS_ENABLE_PROPRIETARY_CODECS:mx8-nxp-bsp = "proprietary_codecs=true"
GN_ARGS += "${GN_ARGS_DISABLE_GBM} ${GN_ARGS_USE_IMXGPU} ${GN_ARGS_ENABLE_PROPRIETARY_CODECS}"

CHROMIUM_EXTRA_ARGS:append = " --disable-features=VizDisplayCompositor --in-process-gpu"
