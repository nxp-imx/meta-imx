SUMMARY = "nl80211 userspace tool"
DESCRIPTION = "nl80211 userspace tool"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=878618a5c4af25e9b93ef0be1a93f774"

inherit pkgconfig

SRC_URI = "https://www.kernel.org/pub/software/network/iw/${PN}-${PV}.tar.xz"

do_compile () {
    oe_runmake CFLAGS="-DCONFIG_LIBNL30 -I${STAGING_INCDIR}/libnl3 " all
}
