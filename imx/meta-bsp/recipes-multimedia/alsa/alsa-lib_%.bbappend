FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# Remove the duplicate patch which has been uptreamed to meta-freescale layer
# This patch should be applied on all i.MX platfrom, no patch applying filter
SRC_URI_remove_mx6 = " file://0001-add-conf-for-multichannel-support-in-imx.patch"
SRC_URI_remove_mx7 = " file://0001-add-conf-for-multichannel-support-in-imx.patch"

SRC_URI_append = " file://0002-pcm-Fix-suspend-resume-regression-with-dmix-co.patch \
                   file://0003-Revert-pcm-Fix-suspend-resume-regression-with-dmix-c.patch \
                   file://0004-add-conf-for-multichannel-support-in-imx.patch \
                   file://0005-add-ak4458-conf-for-multichannel-support.patch \
"

PACKAGE_ARCH_mx8 = "${MACHINE_SOCARCH}"

