FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://qt-${IMX_BACKEND}.sh"

IMX_BACKEND = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland',\
        bb.utils.contains('DISTRO_FEATURES',     'x11',     'x11', \
                                                             'fb', d), d)}"

do_install:append () {
    install -d ${D}${sysconfdir}/profile.d/
    install -m 0755 ${WORKDIR}/qt-${IMX_BACKEND}.sh ${D}${sysconfdir}/profile.d/qt.sh
}
