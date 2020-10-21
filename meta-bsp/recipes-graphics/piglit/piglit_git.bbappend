# As nothing builds against Piglit we don't need to have anything in the
# sysroot, especially when this is ~2GB of test suite
SYSROOT_DIRS_remove = "${libdir}"
