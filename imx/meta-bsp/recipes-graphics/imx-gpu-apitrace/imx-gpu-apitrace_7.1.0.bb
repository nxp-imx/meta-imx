SUMMARY = "Samples for OpenGL ES"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aeb969185a143c3c25130bc2c3ef9a50"
DEPENDS = "virtual/libg2d imx-gpu-viv zlib libpng procps"

SRC_URI = "git://github.com/apitrace/apitrace.git;nobranch=1;tag=7.1 \
          file://0001-add-docs-HOWTO.markdown.patch \
          file://0002-add-docs-Freescale_apitrace_user_guide.markdown.patch \
          file://0003-add-docs-Freescale_apitrace.markdown.patch \
          file://0004-add-docs-apitrace_test.markdown.patch \
          file://0005-add-apitrace_dalvik.sh.patch \
          file://0006-add-test_android.sh.patch \
          file://0007-add-test_yocto.sh.patch \
          file://0009-add-retrace-glws_nonx.cpp.patch \
          file://0010-cmake-use-glws_nonx-for-Vivante.patch \
          file://0011-cli_trace-export-ENABLE_API_TRACE-1.patch \
          file://0012-use-dlsym-to-get-function-pointers.patch \
          file://0013-Vivante-driver-does-not-support-GL_RGB-in-openGL-dri.patch \
          file://0014-MGS-469-GPU-hangs-when-retracing-OGLESParticles-on-m.patch \
          file://0015-egl-define-egl-native-types-for-non-x11.patch \
          file://0016-don-t-recreate-the-EGL-surface-on-resize.patch \
          file://0017-add-Image-getMD5.patch \
          file://0018-retrace-use-Image-getMD5-for-image-comparison.patch \
          file://0019-egltrace-don-t-use-dlsym-on-aliased-functions.patch \
          file://0020-egl-glx-trace-add-ApiTraceEnabled.patch \
          file://0021-LocalWriter-make-a-writer-ignorable.patch \
          file://0022-MGS-309-ccc-retrace-tutorial3-is-different-with-trac.patch \
          file://0023-add-support-for-Vivante-extensions.patch \
          file://0024-MGS-470-ccc-cannot-trace-mesa-demos-vertexrate.patch \
          file://0025-MGS-1271-ccc-disable-X-debug-function.patch \
          file://0026-MGS-1721-ccc-fix-broken-build-on-AArch64.patch \
          file://0027-MGS-1859-ccc-blank-screen-when-retracing-es20-sdk-ap.patch \
          file://0028-MGS-2254-ccc-add-the-TOT-commit-SHA1-inside-the-bina.patch \
          file://0029-MGS-815-ccc-avoid-memcpy-in-glTexDirectInvalidateVIV.patch \
          file://0030-MGS-814-ccc-retrace-support-eglCreatePixmapSurface-o.patch \
          file://0031-libbacktrace-define-HAVE_STDINT_H-in-config.h.patch \
          file://0032-changed-disable-X11-mechanism.patch \
          file://0033-MGS-2963-ccc-Miss-usr-bin-eglretrace-file-in-FB-and-.patch \
          file://0034-MGS-make-multiarch-optional.patch \
          file://0035-dlopen-don-t-override-symbols-in-Vivante-libs.patch \
"

S = "${WORKDIR}/git"

inherit cmake lib_package pkgconfig perlnative pythonnative

EXTRA_OECMAKE += "-DENABLE_VIVANTE=ON -DENABLE_MULTIARCH=OFF"
EXTRA_OECMAKE += \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', '-DDISABLE_X11=ON', \
        bb.utils.contains('DISTRO_FEATURES',     'x11', '', \
                                                        '-DDISABLE_X11=ON', d), d)}"

FILES_${PN} = "${bindir} ${libdir}"
FILES_${PN}-dbg += "${libdir}/*/*/.debug"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl|mx7ulp|mx8)"
