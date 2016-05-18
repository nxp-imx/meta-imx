FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0001-pcm_plugin-fix-appl-pointer-not-correct-when-mmap_co.patch \
                   file://0002-pcm-Fix-suspend-resume-regression-with-dmix-co.patch \
                   file://0003-Revert-pcm-Fix-suspend-resume-regression-with-dmix-c.patch \
                   file://0004-pcm-Don-t-store-the-state-for-SND_PCM_STATE_SUSPENDE.patch \
"

