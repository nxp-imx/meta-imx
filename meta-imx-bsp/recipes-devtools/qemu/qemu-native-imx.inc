require qemu-imx.inc

inherit_defer native

EXTRA_OEMAKE:append = " LD='${LD}' AR='${AR}' OBJCOPY='${OBJCOPY}' LDFLAGS='${LDFLAGS}'"

LDFLAGS += "-fuse-ld=bfd"

# x86_64: needed for nativesdk packages sanity checks
QEMU_TARGETS:append = " x86_64"
