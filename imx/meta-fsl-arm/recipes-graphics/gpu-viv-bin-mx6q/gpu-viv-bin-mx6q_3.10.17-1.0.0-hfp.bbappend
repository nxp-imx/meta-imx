DEPENDS += "${@base_contains('DISTRO_FEATURES', 'wayland', 'wayland', '', d)}"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true \
           file://egl.pc \
           file://egl_x11.pc \
           file://glesv1_cm.pc \
           file://glesv1_cm_x11.pc \
           file://glesv2.pc \
           file://glesv2_x11.pc \
           file://vg.pc \
           file://vg_x11.pc \
           file://gc_wayland_protocol.pc \
           file://wayland-egl.pc \
           file://wayland-viv.pc \
           file://directfbrc \
          "

S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "19dfab8d30cc28dd0e6684bcda3c15c2"
SRC_URI[sha256sum] = "517d0a503bec9fef9ed26a91d3f4328ca531471b4a622ec0c5128ef0ff7658de"

do_install_append () {

    rm -rf ${D}${libdir}/libGLESv2*

    # update libglesv2 as backend dependent
    cp -a ${S}/usr/lib/libGLESv2-${backend}.so ${D}${libdir}/libGLESv2.so.2.0.0
    ln -sf libGLESv2.so.2.0.0 ${D}${libdir}/libGLESv2.so.2
    ln -sf libGLESv2.so.2.0.0 ${D}${libdir}/libGLESv2.so
}
