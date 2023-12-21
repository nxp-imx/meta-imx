# CMake requires protoc binary to exist in sysroot, even if it has wrong architecture.
SYSROOT_DIRS += "${bindir}"
