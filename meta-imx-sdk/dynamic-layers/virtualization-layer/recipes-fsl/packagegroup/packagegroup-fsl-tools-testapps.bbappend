# Install vhost-user back ends
# https://www.qemu.org/docs/master/system/devices/vhost-user.html

VHOST_USER_TOOLS ?= ""
VHOST_USER_TOOLS:mx95-nxp-bsp = "vhost-device-vsock"

RDEPENDS:${PN} += " \
    ${VHOST_USER_TOOLS} \
"
