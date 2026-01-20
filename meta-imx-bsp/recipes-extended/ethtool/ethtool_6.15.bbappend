FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI:append = " file://0001-netlink-fix-missing-headers-in-text-output.patch"
CFLAGS += "-Wno-error=format-security"

