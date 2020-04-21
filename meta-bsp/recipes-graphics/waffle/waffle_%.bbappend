PACKAGECONFIG_imxgpu_remove_mx6 = "gbm"
PACKAGECONFIG_imxgpu_remove_mx7 = "gbm"

# Append EGL_CFLAGS to CFLAGS
CFLAGS_append_imxgpu = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', '', '-DEGL_API_FB', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', '-DWL_EGL_PLATFORM', '', d)} \
"
