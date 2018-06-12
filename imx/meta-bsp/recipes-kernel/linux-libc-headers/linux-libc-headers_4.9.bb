require linux-libc-headers.inc

PV = "4.9"

SRC_URI_append_libc-musl = "\
    file://0001-libc-compat.h-fix-some-issues-arising-from-in6.h.patch \
    file://0002-libc-compat.h-prevent-redefinition-of-struct-ethhdr.patch \
    file://0003-remove-inclusion-of-sysinfo.h-in-kernel.h.patch \
   "

SRC_URI_append = " file://Install-dma-buf-h.patch"

do_install_append() {
    install -m 0644 ${B}/drivers/staging/android/uapi/ion.h ${D}${exec_prefix}/include/linux
}
