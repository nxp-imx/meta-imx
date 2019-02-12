require linux-libc-headers.inc
require recipes-kernel/linux/linux-imx-src-${@d.getVar('PV').replace('-imx-sdk','')}.inc

SUMMARY = "Use i.MX-specific kernel headers"
DESCRIPTION = "\
** WARNING: This recipe is sub-optimal and not meant for general use. **\
It is provided so the custom headers can be simply included in an SDK image.\
"

SRC_URI_append_libc-musl = "\
    file://0001-libc-compat.h-fix-some-issues-arising-from-in6.h.patch \
    file://0002-libc-compat.h-prevent-redefinition-of-struct-ethhdr.patch \
    file://0003-remove-inclusion-of-sysinfo.h-in-kernel.h.patch \
    file://0001-libc-compat.h-musl-_does_-define-IFF_LOWER_UP-DORMAN.patch \
   "

do_install_append() {
    # FIXME: The ion.h is still on staging so "promote" it for now
    install -m 0644 ${B}/drivers/staging/android/uapi/ion.h ${D}${includedir}/linux
    install -m 0644 ${B}/drivers/gpu/drm/imx/imx-drm.h ${D}${includedir}/linux
}
