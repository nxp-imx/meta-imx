FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append:imx-nxp-bsp = " \
    file://0001-Fixed-chromium-flicker-with-g2d-renderer.patch \
    file://0002-Disable-dri-for-imx-gpu.patch \
    file://0003-Fix-chromium-build-failure.patch \
    file://0004-Fixed-chromium-crash-after-upgrading.patch \
    file://0005-MGS-7765-Blacklist-MSAA-for-GPU-Raster-on-Vivante-GP.patch \
    file://0006-LF-12406-Fixed-webgl-test-fail-for-GL_MAX_SAMPLES-ch.patch \
    file://0007-Enable-native-GLES2-for-Ozone-wayland.patch \
    file://0008-Fix-build-fail-after-clang-llvm-upgrade.patch \
    file://0009-Fix-chromium-crash-when-run-webgl-2.0.0-cts.patch \
    file://0010-Fix-canvas-test-fail-for-webgl.patch \
    file://0011-LF-12406-1-Blacklist-disable-program_caching_for_tra.patch \
"
VDA_PATCH_SET = " \
    file://0101-V4L2Device-Correct-v4l2-codec-device-path.patch \
    file://0102-V4L2VideoDecoder-Add-macro-use_linux_v4l2.patch \
    file://0103-V4L2VideoDecoder-Create-single-multi-plane-queues.patch \
    file://0104-V4L2Buffer-Allocate-correct-v4l2-buffers-for-queues.patch \
    file://0105-V4L2VideoDecoder-Create-videoframe-according-to-v4l2.patch \
    file://0106-V4L2VideoDecoder-Add-function-IsMultiQueue-for-S_FMT.patch \
    file://0107-V4L2VideoDecoder-Use-correct-plane-size-and-bytesuse.patch \
    file://0108-V4L2VideoDecoder-Add-hevc-format-support.patch \
    file://0109-display-Add-fps-in-SkiaOutputSurfaceImplOnGpu-by-VLO.patch \
    file://0110-V4L2VideoDecoder-Comment-some-unused-ioctl.patch \
    file://0111-V4L2VideoDecoder-Add-V4L2_PIX_FMT_NV12M_8L128-format.patch \
    file://0112-V4L2VideoDecoder-Support-tile-to-linear-transform-fo.patch \
    file://0113-V4L2VideoDecoder-Use-dlopen-to-dynamically-use-g2d-a.patch \
    file://0114-V4L2VideoDecoderBackend-Create-queue-according-to-qu.patch \
    file://0115-V4L2VideoDecoder-support-gpu-import-NV12-format.patch \
    file://0116-VideoDecoderPipeline-Add-resolution-change-support.patch \
    file://0117-V4L2StatefulVideoDecoderBackend-Enlarge-input-buffer.patch \
    file://0118-V4L2VideoDecoder-Fix-amphion-report-size-mismatch.patch \
    file://0119-VideoDecoderPipeline-Get-V4L2VideoDecoder-supported-.patch \
    file://0120-V4L2VideoDecoder-Fix-amphion-cannot-streamoff-after-.patch \
    file://0121-V4L2VideoDecoder-Set-OUTPUT-format-with-parsed-resol.patch \
"
SRC_URI:append:mx8-nxp-bsp = " ${VDA_PATCH_SET}"
SRC_URI:append:mx95-nxp-bsp = " ${VDA_PATCH_SET}"

GN_ARGS_DISABLE_GBM             = ""
GN_ARGS_DISABLE_GBM:mx6-nxp-bsp = "use_system_minigbm=false use_wayland_gbm=false"
GN_ARGS_DISABLE_GBM:mx7-nxp-bsp = "${GN_ARGS_DISABLE_GBM:mx6-nxp-bsp}"
GN_ARGS_USE_IMXGPU        = "use_imxgpu=false"
GN_ARGS_USE_IMXGPU:imxgpu = "use_imxgpu=true"
GN_ARGS_ENABLE_PROPRIETARY_CODECS             = ""
GN_ARGS_ENABLE_PROPRIETARY_CODECS:mx8-nxp-bsp = "proprietary_codecs=true"
GN_ARGS_ENABLE_PROPRIETARY_CODECS:mx95-nxp-bsp = "proprietary_codecs=true"
GN_ARGS_FFMPEG_BRANDING             = ""
GN_ARGS_FFMPEG_BRANDING:mx8-nxp-bsp = "ffmpeg_branding="Chrome""
GN_ARGS_FFMPEG_BRANDING:mx95-nxp-bsp = "ffmpeg_branding="Chrome""
GN_ARGS_USE_V4L2_CODEC             = ""
GN_ARGS_USE_V4L2_CODEC:mx8-nxp-bsp = "use_v4l2_codec=true"
GN_ARGS_USE_V4L2_CODEC:mx95-nxp-bsp = "use_v4l2_codec=true"
GN_ARGS_USE_LINUX_V4L2_ONLY             = ""
GN_ARGS_USE_LINUX_V4L2_ONLY:mx8-nxp-bsp = "use_linux_v4l2_only=true"
GN_ARGS_USE_LINUX_V4L2_ONLY:mx95-nxp-bsp = "use_linux_v4l2_only=true"

GN_ARGS:append:imx-nxp-bsp = " \
    ${GN_ARGS_DISABLE_GBM} \
    ${GN_ARGS_USE_IMXGPU} \
    ${GN_ARGS_ENABLE_PROPRIETARY_CODECS} \
    ${GN_ARGS_FFMPEG_BRANDING} \
    ${GN_ARGS_USE_V4L2_CODEC} \
    ${GN_ARGS_USE_LINUX_V4L2_ONLY} \
    use_pulseaudio=true \
"
DEPENDS:append = " pulseaudio"

CHROMIUM_EXTRA_ARGS_ENABLE_ANGLE = ""
CHROMIUM_EXTRA_ARGS_ENABLE_ANGLE:mx93-nxp-bsp = "--use-gl=angle --use-angle=gles-egl"
CHROMIUM_EXTRA_ARGS_ENABLE_ANGLE:mx943-nxp-bsp = "--use-gl=angle --use-angle=gles-egl"

CHROMIUM_EXTRA_ARGS:remove:mx93-nxp-bsp = "--use-gl=egl"
CHROMIUM_EXTRA_ARGS:remove:mx943-nxp-bsp = "--use-gl=egl"

CHROMIUM_EXTRA_ARGS:append = " \
    --disable-features=VizDisplayCompositor \
    --in-process-gpu \
    --disable-gpu-rasterization \
    ${CHROMIUM_EXTRA_ARGS_ENABLE_ANGLE} \
"

#Remove installed ANGLE libraries
do_install:append:mx6-nxp-bsp() {
        rm -rf ${D}${libdir}/chromium/libEGL.so
        rm -rf ${D}${libdir}/chromium/libGLESv2.so
        rm -rf ${D}${libdir}/chromium/libvulkan.so.1
}

do_install:append:mx7-nxp-bsp() {
        rm -rf ${D}${libdir}/chromium/libEGL.so
        rm -rf ${D}${libdir}/chromium/libGLESv2.so
        rm -rf ${D}${libdir}/chromium/libvulkan.so.1
}

do_install:append:mx8-nxp-bsp() {
        rm -rf ${D}${libdir}/chromium/libEGL.so
        rm -rf ${D}${libdir}/chromium/libGLESv2.so
        rm -rf ${D}${libdir}/chromium/libvulkan.so.1
}

do_install:append:mx95-nxp-bsp() {
        rm -rf ${D}${libdir}/chromium/libEGL.so
        rm -rf ${D}${libdir}/chromium/libGLESv2.so
        rm -rf ${D}${libdir}/chromium/libvulkan.so.1
}
