DEPENDS += " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'libxrandr', '', d)} \
"

PACKAGECONFIG:remove = "${PACKAGECONFIG_REMOVE}"
PACKAGECONFIG_REMOVE ?= \
    "${@bb.utils.contains('LICENSE_FLAGS_ACCEPTED', 'commercial', '', 'ffmpeg', d)}"
