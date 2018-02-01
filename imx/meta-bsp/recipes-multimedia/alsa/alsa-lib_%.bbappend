FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

IMX_PATCH_append = " file://0002-pcm-Fix-suspend-resume-regression-with-dmix-co.patch \
                     file://0003-Revert-pcm-Fix-suspend-resume-regression-with-dmix-c.patch \
                     file://0005-add-ak4458-conf-for-multichannel-support.patch \
"

SRC_URI_append_mx8 = "${IMX_PATCH}"

SRC_URI_remove_mx8 = " file://0004-pcm-Don-t-store-the-state-for-SND_PCM_STATE_SUSPENDE.patch"

PACKAGE_ARCH_mx8 = "${MACHINE_SOCARCH}"

