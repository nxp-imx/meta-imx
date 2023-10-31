SYSTEMD_AUTO_ENABLE = "disable"

PACKAGECONFIG:remove = "gstreamer"
PACKAGECONFIG:class-target += "${@bb.utils.contains('DISTRO_FEATURES', 'bluetooth', 'bluez-lc3', '', d)}"
