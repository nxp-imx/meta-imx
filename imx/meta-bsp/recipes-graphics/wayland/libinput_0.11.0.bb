SUMMARY = "Library to handle input devices in Wayland compositors"
HOMEPAGE = "http://www.freedesktop.org/wiki/Software/libinput/"
SECTION = "libs"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=673e626420c7f859fbe2be3a9c13632d"

DEPENDS = "libevdev udev mtdev"

SRC_URI = "http://www.freedesktop.org/software/${BPN}/${BP}.tar.xz"
SRC_URI[md5sum] = "59fef57c3a3151d6f4be539469d67e37"
SRC_URI[sha256sum] = "927cd6792f95ea5e087448818cefe62c37fc5d76eed99b8c67fabee436bd0743"

inherit autotools pkgconfig

FILES_${PN} = "${libdir} /usr/src"
FILES_${PN}-dbg = "${libdir}/.debug ${libdir}/*/.debug"
