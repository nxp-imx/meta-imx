SRC_URI_remove = " \
    file://0001-prepend-our-sysroot-path-so-that-make-finds-our-wayl.patch \
    file://0002-Avoid-finding-build-host-s-wayland-scanner.patch \
"

EXTRA_OECONF_remove = "WAYLAND_PROTOCOLS_SYSROOT_DIR=${RECIPE_SYSROOT}"
