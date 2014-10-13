SUMMARY = "Wayland input"
DESCRIPTION = "Wayland input"
HOMEPAGE = "http://libinput.freedesktop.org"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=75aae0d38feea6fda97ca381cb9132eb"

SRC_URI = "http://www.freedesktop.org/software/libevdev/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "ab67de8f949e84ae2abb48af09eda423"
SRC_URI[sha256sum] = "265411ce79a592b3074e9d07fb97d462745d0c7ef178254a6f720245ed253446"

inherit autotools pkgconfig

FILES_${PN} += "/opt/${PN}"
FILES_${PN}-dbg += "/opt/${PN}/*/.debug"
