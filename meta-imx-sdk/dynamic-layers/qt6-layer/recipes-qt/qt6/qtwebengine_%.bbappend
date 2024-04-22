DEPENDS += " \
    libdrm \
    virtual/libgl \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'xdamage', '', d)}"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://0001-Disable-Intel-backend-by-default.patch;patchdir=src/3rdparty"
