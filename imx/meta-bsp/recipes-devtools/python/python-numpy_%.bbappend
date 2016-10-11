FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_mx8 = " ${CONFIGFILESURI}"

CONFIGFILESURI_aarch64 = " \
    file://config.h \
    file://_numpyconfig.h \
"
