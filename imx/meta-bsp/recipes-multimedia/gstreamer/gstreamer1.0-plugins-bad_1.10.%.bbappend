FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

DEPENDS_append_imxgpu2d = " virtual/libg2d"

PACKAGECONFIG_GL_imxgpu2d = "${@bb.utils.contains('DISTRO_FEATURES', 'opengl x11', 'opengl', '', d)}"
PACKAGECONFIG_GL_imxgpu3d = "${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'gles2', '', d)}"

PACKAGECONFIG_append_mx6q = " opencv"
PACKAGECONFIG_append_mx6qp = " opencv"
PACKAGECONFIG_append_mx8 = " opencv"
PACKAGECONFIG_remove_mx6sl = " gles2"

#revert poky fido commit:cdc2c8aeaa96b07dfc431a4cf0bf51ef7f8802a3: move EGL to Wayland
PACKAGECONFIG[gles2]   = "--enable-gles2 --enable-egl,--disable-gles2 --disable-egl,virtual/libgles2 virtual/egl"
PACKAGECONFIG[wayland] = "--enable-wayland --disable-x11,--disable-wayland,wayland"

SRC_URI_append = " \
       file://0001-gstreamer-gl.pc.in-don-t-append-GL_CFLAGS-to-CFLAGS.patch \
       file://0001-gst-plugins-bad-fix-incorrect-wayland-protocols-dir.patch \
       file://0001-mpegtsmux-Need-get-pid-when-create-streams.patch \
       file://0002-mpeg4videoparse-Need-detect-picture-coding-type-when.patch \
       file://0003-mpegvideoparse-Need-detect-picture-coding-type-when-.patch \
       file://0004-modifiy-the-videoparse-rank.patch \
       file://0005-glfilter-Lost-frame-rate-info-when-fixate-caps.patch \
       file://0006-camerabin-Add-one-property-to-set-sink-element-for-v.patch \
       file://0007-Fix-for-gl-plugin-not-built-in-wayland-backend.patch \
       file://0008-Support-fb-backend-for-gl-plugins.patch \
       file://0009-Change-wayland-default-res-to-1024x768.patch \
       file://0010-gl-wayland-fix-loop-test-hang-in-glimagesink.patch \
       file://0011-Fix-glimagesink-wayland-resize-showed-blurred-screen.patch \
       file://0012-Add-directviv-to-glimagesink-to-improve-playback-per.patch \
       file://0013-MMFMWK-6930-glplugin-Accelerate-gldownload-with.patch \
       file://0014-support-video-crop-for-glimagesink.patch \
       file://0015-Add-fps-print-in-glimagesink.patch \
       file://0016-glcolorconvert-convert-YUV-to-RGB-use-directviv.patch \
       file://0017-glwindow-work-around-for-no-frame-when-imxplayer-use.patch \
       file://0018-glcolorconvert-fix-MRT-cannot-work-in-GLES3.0.patch \
       file://0020-videocompositor-Remove-output-format-alpha-check.patch \
       file://0021-Add-ion-memory-support-for-glupload.patch \
       file://0022-Add-ion-dmabuf-support-in-gldownload.patch \
       file://0023-glwindow-use-g_thread_unref-to-release-navigation-th.patch \
       file://0024-gl-effects-use-non-PBO-GLMemory-for-internal-texture.patch \
"

# include fragment shaders
FILES_${PN}-opengl += "/usr/share/*.fs"

PACKAGE_ARCH_imxpxp = "${MACHINE_SOCARCH}"
PACKAGE_ARCH_mx8 = "${MACHINE_SOCARCH}"

# Fix libgstbadion-1.0.so.0 which is under built directory cannot be found
do_compile_prepend () {
    export GIR_EXTRA_LIBS_PATH="${B}/gst-libs/gst/ion/.libs"
}
