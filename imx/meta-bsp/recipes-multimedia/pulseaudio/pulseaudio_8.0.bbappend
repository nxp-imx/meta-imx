# As it can not overwrite the version in the layer meta-fsl-arm, we have to use
#   another file extension for new patch to the append in the meta-fsl-arm

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}/imx:"

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
SRC_URI_append_mx6sll = "${IMX_PATCHES}"
SRC_URI_append_mx7 = "${IMX_PATCHES}"
SRC_URI_append_mx8 = "${IMX_PATCHES}"

# Install a i.MX6ULL specific daemon.conf to increase the rlimit-rttime
SRC_URI_append_mx6ull = " file://daemon.conf_mx6ull"
do_install_append_mx6ull () {
    if [ -e "${WORKDIR}/daemon.conf_mx6ull" ]; then
        install -m 0644 ${WORKDIR}/daemon.conf_mx6ull ${D}${sysconfdir}/pulse/daemon.conf
    fi
}

# Enable allow-autospawn-for-root as default
PACKAGECONFIG_append = " autospawn-for-root"

# This default setting should be added on all i.MX SoC,
# For now, only the setting for mx6/mx6ul/mx7 has been upstreamed
SRC_URI_append_mx6sll = " file://daemon.conf file://default.pa"
SRC_URI_append_mx8 = " file://daemon.conf file://default.pa"

# Install a new daemon.conf for all platform to increase the rlimit-rttime
SRC_URI_append = " file://daemon_new.conf"
do_install_append () {
    if [ -e "${WORKDIR}/daemon_new.conf" ]; then
        install -m 0644 ${WORKDIR}/daemon_new.conf ${D}${sysconfdir}/pulse/daemon.conf
    fi
}

PACKAGE_ARCH_mx6sll = "${MACHINE_SOCARCH}"
PACKAGE_ARCH_mx8 = "${MACHINE_SOCARCH}"
