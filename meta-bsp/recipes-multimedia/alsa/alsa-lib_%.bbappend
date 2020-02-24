FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

IMX_PATCH_append = " \
    file://0006-add-conf-for-iMX-EARC-sound-card.patch \
"
