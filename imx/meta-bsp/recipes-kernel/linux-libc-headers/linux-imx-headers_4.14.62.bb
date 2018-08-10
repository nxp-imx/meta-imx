require linux-libc-headers.inc
require recipes-kernel/linux/linux-imx-src-${PV}.inc

SUMMARY = "Installs i.MX-specific kernel headers to /usr/imx"

SRC_URI_append_libc-musl = "\
    file://0001-libc-compat.h-fix-some-issues-arising-from-in6.h.patch \
    file://0002-libc-compat.h-prevent-redefinition-of-struct-ethhdr.patch \
    file://0003-remove-inclusion-of-sysinfo.h-in-kernel.h.patch \
    file://0001-libc-compat.h-musl-_does_-define-IFF_LOWER_UP-DORMAN.patch \
   "

# i.MX: Install to /usr/imx instead of /usr
exec_prefix = "/usr/imx"

do_install_append() {
    # i.MX: Add ion.h
    install -m 0644 ${B}/drivers/staging/android/uapi/ion.h ${D}${includedir}/linux
}
