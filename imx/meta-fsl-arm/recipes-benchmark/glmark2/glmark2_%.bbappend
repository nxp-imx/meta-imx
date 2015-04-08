FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://glmark2.patch"

DEPENDS_remove = "virtual/libx11"

REQUIRED_DISTRO_FEATURES_remove = "x11"

REMOVE_GL = "${@base_contains('DISTRO_FEATURES', 'x11', '', \
                base_contains('DISTRO_FEATURES', 'wayland', 'gl', '', d), d)}"

PACKAGECONFIG_remove_mx6 = "${REMOVE_GL}"

python __anonymous() {

    packageconfig = (d.getVar("PACKAGECONFIG", True) or "").split()
    flavors = []
    if "gles2" in packageconfig:
        if bb.utils.contains('DISTRO_FEATURES', 'x11', True, False, d):
         flavors.append("x11-glesv2")
        elif bb.utils.contains('DISTRO_FEATURES', 'wayland', True, False, d):
         flavors.append("wayland-glesv2")
    if "gl" in packageconfig:
        if bb.utils.contains('DISTRO_FEATURES', 'x11', True, False, d):
         flavors.append("x11-gl")
        elif bb.utils.contains('DISTRO_FEATURES', 'wayland', True, False, d):
         flavors.append("wayland-gl")
    if flavors:
        d.appendVar("EXTRA_OECONF", " --with-flavors=%s" % ",".join(flavors))
}
