SUMMARY = "Wayland input"
DESCRIPTION = "Wayland input"
HOMEPAGE = "http://libinput.freedesktop.org"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=673e626420c7f859fbe2be3a9c13632d \
                    file://src/libinput.c;endline=23;md5=feca38f59a869e3c4b02d54efdeb4965"

SRC_URI = "http://www.freedesktop.org/software/libinput/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "3afaf9f66d8796323a79edb879c10ba3"
SRC_URI[sha256sum] = "30b555771e7cb921ccb9430c4a86940aa3938d05506e81d2417c03e30451bfbc"

inherit autotools pkgconfig

DEPENDS = "libevdev"

FILES_${PN} += "/opt/${PN}"
FILES_${PN}-dbg += "/opt/${PN}/*/.debug"
