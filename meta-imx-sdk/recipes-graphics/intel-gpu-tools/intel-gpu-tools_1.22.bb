require ${COREBASE}/meta/recipes-graphics/xorg-app/xorg-app-common.inc

SUMMARY = "Intel GPU tools"
DESCRIPTION = "Variety of small tools for testing intel graphics."

LIC_FILES_CHKSUM = "file://COPYING;md5=e4b3dd344780e0400593b21b115a6947"

LICENSE:append = " & ISC"

inherit autotools gtk-doc

SRC_URI = "${XORG_MIRROR}/individual/app/${BP}.tar.xz"

DEPENDS += "libdrm libpciaccess cairo udev glib-2.0 libxv libx11 libxext libxrandr procps libunwind"
RDEPENDS:${PN} += "bash"
RDEPENDS:${PN}-tests += "bash"

PACKAGE_BEFORE_PN = "${PN}-benchmarks ${PN}-tests"

SRC_URI[md5sum] = "965c591b23a132084113c2a0604f537a"
SRC_URI[sha256sum] = "3d66c1dc5110712ca4d22199b3ce9853f261be1690064edf87e69e5392e39a5c"

EXTRA_OECONF = "--disable-nouveau --disable-shader-debugger"
COMPATIBLE_HOST = "(x86_64.*|i.86.*)-linux"
COMPATIBLE_HOST:libc-musl:class-target = "null"

PACKAGECONFIG ??= ""
PACKAGECONFIG[audio] = "--enable-audio,--disable-audio,alsa-lib gsl"

gputools_sysroot_preprocess() {
	rm -f ${SYSROOT_DESTDIR}${libdir}/pkgconfig/intel-gen4asm.pc
}
SYSROOT_PREPROCESS_FUNCS += "gputools_sysroot_preprocess"

FILES:${PN} += "${libdir}/intel_aubdump.so"
FILES:${PN}-benchmarks += "${libexecdir}/intel-gpu-tools/benchmarks"
FILES:${PN}-tests += "\
		${libexecdir}/intel-gpu-tools/*\
		${datadir}/intel-gpu-tools/1080p-right.png\
		${datadir}/intel-gpu-tools/1080p-left.png\
		${datadir}/intel-gpu-tools/pass.png\
		${datadir}/intel-gpu-tools/test-list.txt"
