# multilib

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append = " \
    file://0001-CMakeLists.txt-Fix-lib-path-to-work-in-multilib-env.patch \
"
