# As it can not overwrite the version in the layer meta-fsl-arm, we have to use
#   another file extension for new patch to the append in the meta-fsl-arm

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

IMX_PATCHES = " file://0001-Fix-pulseaudio-mutex-issue-when-do-pause-in-gstreame.patch \
"

# Revert poky's patch "pulseaudio: Fix HDMI profile selection"
#   http://git.yoctoproject.org/cgit/cgit.cgi/poky/commit/meta/recipes-multimedia/pulseaudio/pulseaudio?h=jethro&id=d2bf9fb2cafd4368e4796503c0ea3b8713efe4f3
SRC_URI_remove = "file://0001-card-add-pa_card_profile.ports.patch "
SRC_URI_remove = "file://0002-alsa-bluetooth-fail-if-user-requested-profile-doesn-.patch "
SRC_URI_remove = "file://0003-card-move-profile-selection-after-pa_card_new.patch "
SRC_URI_remove = "file://0004-alsa-set-availability-for-some-unavailable-profiles.patch "

SRC_URI_append_mx6 = "${IMX_PATCHES}"
SRC_URI_append_mx6ul = "${IMX_PATCHES}"
SRC_URI_append_mx7 = "${IMX_PATCHES}"
SRC_URI_append_mx8 = "${IMX_PATCHES}"

# Enable allow-autospawn-for-root as default
PACKAGECONFIG_append = " autospawn-for-root"

SRC_URI_append_mx8 = " file://daemon.conf file://default.pa"

# Install a new daemon.conf for all platform to increase the rlimit-rttime
SRC_URI_append = " file://daemon_new.conf"
do_install_append () {
    if [ -e "${WORKDIR}/daemon_new.conf" ]; then
        install -m 0644 ${WORKDIR}/daemon_new.conf ${D}${sysconfdir}/pulse/daemon.conf
    fi
}

PACKAGE_ARCH_mx8 = "${MACHINE_SOCARCH}"
