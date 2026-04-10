FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://99-uart-console-env.sh"

do_install:append() {
    install -d ${D}${sysconfdir}/profile.d
    install -m 0644 ${UNPACKDIR}/99-uart-console-env.sh \
        ${D}${sysconfdir}/profile.d/
}
