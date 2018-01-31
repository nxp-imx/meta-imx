FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0002-pcm-Fix-suspend-resume-regression-with-dmix-co.patch \
                   file://0003-Revert-pcm-Fix-suspend-resume-regression-with-dmix-c.patch \
                   file://0004-add-conf-for-multichannel-support-in-imx.patch \
                   file://0005-add-ak4458-conf-for-multichannel-support.patch \
"

PACKAGE_ARCH_mx8 = "${MACHINE_SOCARCH}"

