FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://glmark2.patch"

IMX_GPU_VIV_PACKAGECONFIG = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland opengl', 'wayland-gles2', \
                                bb.utils.contains('DISTRO_FEATURES', 'x11 opengl',     'x11-gl x11-gles2', \
                                                                                       '', d), d)}"
PACKAGECONFIG_mx6q  = "${IMX_GPU_VIV_PACKAGECONFIG}"
PACKAGECONFIG_mx6dl = "${IMX_GPU_VIV_PACKAGECONFIG}"
PACKAGECONFIG_mx6sx = "${IMX_GPU_VIV_PACKAGECONFIG}"
PACKAGECONFIG_mx8   = "${IMX_GPU_VIV_PACKAGECONFIG}"
