# fsl-eula-package_arch.bbclass extends the package naming scheme to allow
# a single software package to create multiple archives based on the
# combinations of a) target versus native/nativesdk components, and b) the
# target or native architecture.

IMX_PACKAGE_NAME_append                 = "-${TARGET_ARCH}"
IMX_PACKAGE_NAME_class-native_append    = "-${BUILD_ARCH}"
IMX_PACKAGE_NAME_class-nativesdk_append = "-${BUILD_ARCH}"

SRC_URI_append               = ";name=${SRC_URI_NAME}"
SRC_URI_NAME                 = "${TARGET_ARCH}"
SRC_URI_NAME_class-native    = "${BUILD_ARCH}-native"
SRC_URI_NAME_class-nativesdk = "${BUILD_ARCH}-nativesdk"

INSANE_SKIP_${PN}_remove     = "arch"
INSANE_SKIP_${PN}-dbg_remove = "arch"
