FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-pcm-direct-Propagate-error-code-from-snd_pcm_direct_.patch \
            file://0002-pcm-direct-Improved-suspend-resume-support.patch \
            file://0003-pcm-direct-Move-slave-PCM-state-checks-into-XRUN-che.patch \
            file://0004-pcm-direct-Check-xrun-suspend-before-the-slave-hwptr.patch"
SRC_URI:remove = "file://0004-pcm-Don-t-store-the-state-for-SND_PCM_STATE_SUSPENDE.patch"
