FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

IMX_PATCH_append = " file://0002-pcm-Fix-suspend-resume-regression-with-dmix-co.patch \
                     file://0003-Revert-pcm-Fix-suspend-resume-regression-with-dmix-c.patch \
                     file://0005-add-ak4458-conf-for-multichannel-support.patch \
"
