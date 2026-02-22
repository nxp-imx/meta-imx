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
    file://0012-Fix-build-error-for-rust-1.90.patch \
    file://0013-Fix-build-error-for-clang-upgrading.patch \
    file://0014-Fixed-build-error-caused-by-rust.patch \
    file://0015-Fix-build-errors-by-rust.patch \
    file://0016-Disable-GL_ANGLE_instanced_arrays-extension.patch \
    file://0017-Fix-webgl-regression-after-angle-upgrade.patch \
    file://0018-MGS-8560-Fixed-webgl-random-failures-with-angle-gles.patch \
    file://0019-MGS-8643-Fix-chromium-fail-to-run-with-Panthor-drive.patch \
"
VDA_PATCH_SET = " \
    file://0101-V4L2VideoDecoder-Add-macro-use_linux_v4l2.patch \
    file://0102-V4L2VideoDecoder-Create-single-multi-plane-queues.patch \
    file://0103-V4L2Buffer-Allocate-correct-v4l2-buffers-for-queues.patch \
    file://0104-V4L2VideoDecoder-Create-videoframe-according-to-v4l2.patch \
    file://0105-V4L2VideoDecoder-Add-function-IsMultiQueue-for-S_FMT.patch \
    file://0106-V4L2VideoDecoder-Use-correct-plane-size-and-bytesuse.patch \
    file://0107-V4L2VideoDecoder-Add-hevc-format-support.patch \
    file://0108-display-Add-fps-in-SkiaOutputSurfaceImplOnGpu-by-VLO.patch \
    file://0109-V4L2VideoDecoder-Comment-some-unused-ioctl.patch \
    file://0110-V4L2VideoDecoder-Add-V4L2_PIX_FMT_NV12M_8L128-format.patch \
    file://0111-V4L2VideoDecoder-Support-tile-to-linear-transform-fo.patch \
    file://0112-V4L2VideoDecoder-Use-dlopen-to-dynamically-use-g2d-a.patch \
    file://0113-V4L2VideoDecoderBackend-Create-queue-according-to-qu.patch \
    file://0114-V4L2VideoDecoder-support-gpu-import-NV12-format.patch \
    file://0115-VideoDecoderPipeline-Add-resolution-change-support.patch \
    file://0116-V4L2StatefulVideoDecoderBackend-Enlarge-input-buffer.patch \
    file://0117-V4L2VideoDecoder-Fix-amphion-report-size-mismatch.patch \
    file://0118-VideoDecoderPipeline-Get-V4L2VideoDecoder-supported-.patch \
    file://0119-V4L2VideoDecoder-Fix-amphion-cannot-streamoff-after-.patch \
    file://0120-V4L2VideoDecoder-Set-OUTPUT-format-with-parsed-resol.patch \
    file://0121-V4L2VideoDecoder-Add-back-HEVC-code-for-stateful-vid.patch \
    file://0122-V4L2VideoDecoder-Disable-decoder-prioritization-acco.patch \
"
SRC_URI:remove = "file://0008-Use-the-correct-path-to-libclang_rt.builtins.a.patch"
SRC_URI:append:mx8-nxp-bsp = " ${VDA_PATCH_SET}"
SRC_URI:append:mx95-nxp-bsp = " ${VDA_PATCH_SET}"

DEPENDS:append:imxgpu2d = " virtual/libg2d"

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
GN_ARGS_USE_IMXG2D               = ""
GN_ARGS_USE_IMXG2D:mx8qm-nxp-bsp = "use_imxg2d=true"
GN_ARGS_USE_IMXG2D:mx8qxp-nxp-bsp = "use_imxg2d=true"

GN_ARGS:append:imx-nxp-bsp = " \
    ${GN_ARGS_DISABLE_GBM} \
    ${GN_ARGS_USE_IMXGPU} \
    ${GN_ARGS_ENABLE_PROPRIETARY_CODECS} \
    ${GN_ARGS_FFMPEG_BRANDING} \
    ${GN_ARGS_USE_V4L2_CODEC} \
    ${GN_ARGS_USE_LINUX_V4L2_ONLY} \
    ${GN_ARGS_USE_IMXG2D} \
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
do_copy_clang_library() {
    cp -r "${STAGING_LIBDIR_NATIVE}/clang/latest" "${STAGING_DIR_HOST}${nonarch_libdir}/clang/"
    cd "${STAGING_DIR_HOST}${nonarch_libdir}/clang" || return

    lib_files=$(find . \( -name "libclang_rt.builtins-*" -o -name "liborc_rt-*" \))
    export ARCH="${TARGET_ARCH}"

    target_dir="latest/lib/${ARCH}-unknown-linux-gnu"
    mkdir -p "$target_dir"

    for lib_file in $lib_files; do
        # Avoid copying if source and destination are the same
        dest_path="$target_dir/$(basename "$lib_file")"
        if [ "$(realpath "$lib_file")" != "$(realpath "$dest_path")" ]; then
            cp "$lib_file" "$target_dir/"
        fi
    done

    cd "$target_dir" || return

    for file in *-"${ARCH}".a; do
        new_name=$(echo "$file" | sed "s/-${ARCH}//")
        mv "$file" "$new_name"
    done

    native_arch_path="${STAGING_LIBDIR_NATIVE}/clang/latest/lib/${ARCH}-unknown-linux-gnu/"
    mkdir -p "$native_arch_path"
    cp -r * "$native_arch_path"
}

PACKAGE_ARCH:imx-nxp-bsp = "${MACHINE_SOCARCH}"
