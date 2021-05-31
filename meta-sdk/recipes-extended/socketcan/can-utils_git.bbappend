FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://0001-candump-fix-epoll_wait-returning-1-errno-EINTR.patch"
