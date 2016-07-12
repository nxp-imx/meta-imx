CFLAGS_append_mx8 = " -DLINUX \
                      ${@bb.utils.contains('DISTRO_FEATURES', 'x11', '', \
                                        bb.utils.contains('DISTRO_FEATURES', 'wayland', \
                                                      '-DEGL_API_FB -DEGL_API_WL',  '-DEGL_API_FB', d), d)}"

PACKAGECONFIG_append_mx8 = " egl glesv2"
