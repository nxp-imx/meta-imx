
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

SRC_URI[md5sum] = "3ec9b299b78fdccae2fc7a156995ff5b"
SRC_URI[sha256sum] = "d75e2d377fa90f404bf79c3ab945a57c9db6cda8256cf355c95d7b4aea98ccb1"
