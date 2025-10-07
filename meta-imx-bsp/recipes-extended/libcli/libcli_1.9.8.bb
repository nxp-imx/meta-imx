DESCRIPTION = "shared library for including a Cisco-like command-line interface into other software"
HOMEPAGE = "https://github.com/dparrish/libcli"
SECTION = "devel"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=cb8aedd3bced19bd8026d96a8b6876d7"

DEPENDS = "libxcrypt"

SRC_URI = "git://github.com/dparrish/libcli;protocol=https;branch=stable \
           file://0001-support-cross-toolchain.patch \
           file://0001-Account-for-multilib.patch \
          "
SRCREV = "96c4e40d374d67bd789ff2d9f8a2a2f87ee311ba"
S = "${WORKDIR}/git"

inherit pkgconfig

CFLAGS += " -Wno-error=calloc-transposed-args"

EXTRA_OEMAKE = "PREFIX=${prefix} DESTDIR=${D} BASELIB=${baselib}"

do_install() {
    oe_runmake install
}
