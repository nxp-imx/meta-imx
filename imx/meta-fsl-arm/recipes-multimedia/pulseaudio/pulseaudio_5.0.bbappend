# As it can not overwrite the version in the layer meta-fsl-arm, we have to use
#   another file extension for new patch to the append in the meta-fsl-arm

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://daemon.conf \
        file://default.pa \
        file://0001-Fix-pulseaudio-mutex-issue-when-do-pause-in-gstreame.patch \
        file://0001-Fix-issue-there-is-no-sound-after-plugin-plugout-hea.patch \
"

do_install_append() {
    install -m 0644 ${WORKDIR}/daemon.conf ${D}${sysconfdir}/pulse/daemon.conf
    install -m 0644 ${WORKDIR}/default.pa ${D}${sysconfdir}/pulse/default.pa

    #Fix me: Remove the kde desktop, because there are two destop in default
    #        (pulseaudio-kde.destop, pulseaudio.destop), then the pulseaudio server
    #        will be started twice, pulseaudio will have issue to switch to default input/output.
    if [ -e ${D}${sysconfdir}/xdg/autostart/pulseaudio-kde.desktop ]
    then
        rm ${D}${sysconfdir}/xdg/autostart/pulseaudio-kde.desktop
    fi
}

