require linux-libc-headers.inc

SUMMARY = "Installs i.MX-specific kernel headers to /usr/imx"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

SRCBRANCH = "imx_4.9.y"
LOCALVERSION = "-${SRCBRANCH}"
KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/linux-imx.git;protocol=https"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"
SRC_URI += "file://Install-dma-buf-h.patch"
SRC_URI_append_libc-musl = "\
    file://0001-libc-compat.h-fix-some-issues-arising-from-in6.h.patch \
    file://0002-libc-compat.h-prevent-redefinition-of-struct-ethhdr.patch \
    file://0003-remove-inclusion-of-sysinfo.h-in-kernel.h.patch \
    file://0001-libc-compat.h-musl-_does_-define-IFF_LOWER_UP-DORMAN.patch \
   "
SRCREV = "85c6f5dc1e51a57d207d15068fd2aca5af056e83"

S = "${WORKDIR}/git"

# i.MX: Install to /usr/imx instead of /usr
exec_prefix = "/usr/imx"

do_install_append() {
    # i.MX: Add ion.h
    install -m 0644 ${B}/drivers/staging/android/uapi/ion.h ${D}${includedir}/linux
}
