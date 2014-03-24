
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

SRC_URI[md5sum] = "275e62c587632876f95f858dd4f1b01e"
SRC_URI[sha256sum] = "340095f18b12eeb70a46dc06d763940b1da06d3c5023b54afe0147d02d484a52"
