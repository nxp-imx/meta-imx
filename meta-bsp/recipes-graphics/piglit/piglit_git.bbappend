SRCREV = "6126c2d4e476c7770d216ffa1932c10e2a5a7813"

# As nothing builds against Piglit we don't need to have anything in the
# sysroot, especially when this is ~2GB of test suite
SYSROOT_DIRS_remove = "${libdir}"
