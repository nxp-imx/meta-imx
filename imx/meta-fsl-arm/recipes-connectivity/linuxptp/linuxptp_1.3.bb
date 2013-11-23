
DESCRIPTION = "Precision Time Protocol (PTP) according to IEEE standard 1588 for Linux"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit autotools pkgconfig

DEPENDS = "virtual/kernel"

SRC_URI = "http://sourceforge.net/projects/linuxptp/files/latest/linuxptp-1.3.tgz"

SRC_URI[md5sum] = "664706a86fe1413391d4536080548501"
SRC_URI[sha256sum] = "b1651186689ef06e56add506bd9bb55a700ca56e3f92ba71d08f3ad12fad3085"

do_configure_append () {
    find ${S} -name makefile | xargs sed -i 's,^\(CC\|CFLAGS\|prefix\|AR\)=,\1 ?=,g'
}

do_compile() {
     make PLATFORM=${PLATFORM} KBUILD_OUTPUT=${STAGING_KERNEL_DIR} CROSS_COMPILE=${TARGET_PREFIX} 
}

do_install () {
    install -d ${D}/usr/local/sbin
    install -p ${S}/ptp4l  ${D}/usr/local/sbin
    install -p ${S}/pmc  ${D}/usr/local/sbin
    install -p ${S}/phc2sys  ${D}/usr/local/sbin
    install -p ${S}/hwstamp_ctl  ${D}/usr/local/sbin
}

FILES_${PN} = "/usr/local/sbin /usr/local/sbin/ptp4l /usr/local/sbin/pmc /usr/local/sbin/phc2sys /usr/local/sbin/hwstamp_ctl "
#FILES_${PN}-dev = "${includedir}"
FILES_${PN}-dbg = "/usr/local/sbin/.debug/ptp4l /usr/local/sbin/.debug/pmc /usr/local/sbin/.debug/phc2sys /usr/local/sbin/.debug/hwstamp_ctl "
