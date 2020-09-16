FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

IMX_PATCHES = " file://0001-Fix-pulseaudio-mutex-issue-when-do-pause-in-gstreame.patch \
                file://0002-alsa-mixer-make-the-mono-mapping-a-fallback-only.patch \
"
SRC_URI_append_mx6 = "${IMX_PATCHES}"
SRC_URI_append_mx7 = "${IMX_PATCHES}"
SRC_URI_append_mx8 = "${IMX_PATCHES}"

# Enable allow-autospawn-for-root as default
PACKAGECONFIG_append = " autospawn-for-root"

# This default setting should be added on all i.MX SoC,
# For now, the setting for mx6(including mx6ul & mx6sll)/mx7 has been upstreamed
SRC_URI_append_mx8 = " file://daemon.conf file://default.pa"

PACKAGE_ARCH_mx8 = "${MACHINE_SOCARCH}"
