FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://0001-LF-15414-Fix-weston-fail-to-show-up-when-connecting-.patch"

SYSTEMD_AUTO_ENABLE ??= "disable"
