# glibc is machine-specific, so this package must be as well.
# Without this setting, the build system can't tell that the
# tasks in sstate for one machine are not valid for another machine.
# This failed particularly for us because the cached run.do_configure
# was using the sysroots for a different machine.
PACKAGE_ARCH = "${MACHINE_ARCH}"
