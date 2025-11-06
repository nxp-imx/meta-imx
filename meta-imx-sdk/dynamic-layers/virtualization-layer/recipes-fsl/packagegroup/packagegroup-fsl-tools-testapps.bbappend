# Install vhost-user back ends
# https://www.qemu.org/docs/master/system/devices/vhost-user.html

VHOST_USER_TOOLS ?= ""
VHOST_USER_TOOLS:mx95-nxp-bsp = " \
    vhost-device-vsock \
    vhost-device-gpio \
    vhost-device-i2c \
    vhost-device-scmi \
    vhost-device-spi \
    vhost-device-rng \
    vhost-device-input \
"

RDEPENDS:${PN} += " \
    ${VHOST_USER_TOOLS} \
"
