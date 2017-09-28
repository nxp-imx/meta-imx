FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

DEPENDS_append_imxgpu2d = " virtual/libg2d"
DEPENDS_append_mx7ulp = " libdrm"

PACKAGECONFIG_GL_imxgpu2d = "${@bb.utils.contains('DISTRO_FEATURES', 'opengl x11', 'opengl', '', d)}"
PACKAGECONFIG_GL_imxgpu3d = "${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'gles2', '', d)}"

PACKAGECONFIG_append_mx6q = " opencv"
PACKAGECONFIG_append_mx6qp = " opencv"
PACKAGECONFIG_append_mx8 = " opencv"
PACKAGECONFIG_remove_mx6sl = " gles2"

#revert poky fido commit:cdc2c8aeaa96b07dfc431a4cf0bf51ef7f8802a3: move EGL to Wayland
PACKAGECONFIG[gles2]   = "--enable-gles2 --enable-egl,--disable-gles2 --disable-egl,virtual/libgles2 virtual/egl"
PACKAGECONFIG[wayland] = "--enable-wayland --disable-x11,--disable-wayland,wayland"

# Disable introspection to fix [GstGL-1.0.gir] Error 
EXTRA_OECONF_append = " --disable-introspection"

EXTRA_OECONF_remove = " --disable-sdl --disable-nas --disable-libvisual --disable-xvid --disable-mimic \
                        --disable-pvr --disable-sdltest --disable-wininet --disable-timidity \
                        --disable-linsys --disable-sndio --disable-apexsink \
"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
    file://0001-gst-plugins-bad-Correct-PKG_COFING-directory-for-WAY.patch \
    file://0001-gstreamer-gl.pc.in-Don-t-append-GL_CFLAGS-to-CFLAGS.patch \
    file://0001-mpegtsmux-Need-get-pid-when-create-streams.patch \
    file://0002-mpegvideoparse-Need-detect-picture-coding-type-when-.patch \
    file://0003-modifiy-the-videoparse-rank.patch \
    file://0004-glfilter-Lost-frame-rate-info-when-fixate-caps.patch \
    file://0005-camerabin-Add-one-property-to-set-sink-element-for-v.patch \
    file://0006-Fix-for-gl-plugin-not-built-in-wayland-backend.patch \
    file://0007-Change-wayland-default-res-to-1024x768.patch \
    file://0008-gl-wayland-fix-loop-test-hang-in-glimagesink.patch \
    file://0009-Fix-glimagesink-wayland-resize-showed-blurred-screen.patch \
    file://0010-support-video-crop-for-glimagesink.patch \
    file://0011-Add-fps-print-in-glimagesink.patch \
    file://0012-glcolorconvert-convert-YUV-to-RGB-use-directviv.patch \
    file://0013-videocompositor-Remove-output-format-alpha-check.patch \
    file://0014-Specific-patches-for-gstplayer-API.patch \
    file://0015-gstplayer-Add-gst_player_get_state-API.patch \
    file://0016-gstplayer-Add-play-stop-sync-API.patch \
    file://0018-Add-imx-physical-memory-allocator.patch \
    file://0019-Add-implement-of-interface-get_phys_addr-to-support-.patch \
    file://0020-Accelerate-gldownload-with-directviv.patch \
    file://0021-ionmemory-dmabuf-memory-allocator-based-on-ion-drive.patch \
    file://0022-ionmemory-support-get-phys-memory.patch \
    file://0023-glupload-add-crop-meta-support-in-dmafd-uploader.patch \
    file://0024-glupload-add-ion-dmabuf-support-in-glupload.patch \
    file://0025-Add-ion-dmabuf-support-in-gldownload.patch \
    file://0026-glframebuffer-check-frame-buffer-status-need-use-spe.patch \
    file://0027-qml-add-EGL-platform-support-for-x11-backend.patch \
    file://0028-kmssink-use-control-node-to-setplane-to-.patch \
    file://0029-kmssink-support-videooverlay-interface.patch \
    file://0030-kmssink-check-scaleable-when-set_caps.patch \
    file://0031-glimagesink-fix-segmentation-fault-when-.patch \
    file://0032-gl-viv-fb-fix-wrong-pos-x-y-calculate-in.patch \
    file://0033-gl-viv-fb-transform-screen-coordinate-to.patch \
    file://0034-glimagesink-expose-should-do-redisplay-a.patch \
    file://0035-videoaggregator-passthrough-interlace-mo.patch \
    file://0036-glvideomixer-need-update-output-geometry.patch \
    file://0037-gleglimage-fix-YUY2-import-error-when-up.patch \
"

# include fragment shaders
FILES_${PN}-opengl += "/usr/share/*.fs"

PACKAGE_ARCH_imxpxp = "${MACHINE_SOCARCH}"
PACKAGE_ARCH_mx8 = "${MACHINE_SOCARCH}"

# Fix libgstbadion-1.0.so.0 which is under built directory cannot be found
do_compile_prepend () {
    export GIR_EXTRA_LIBS_PATH="${B}/gst-libs/gst/ion/.libs"
}
