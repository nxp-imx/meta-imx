# fsl-eula-package_arch.bbclass extends the package naming scheme to allow
# a single software package to create multiple archives based on the
# combinations of a) target versus native/nativesdk components, and b) the
# target or native architecture.

IMX_PACKAGE_NAME:append                 = "-${TARGET_ARCH}"
IMX_PACKAGE_NAME:class-native:append    = "-${BUILD_ARCH}"
IMX_PACKAGE_NAME:class-nativesdk:append = "-${BUILD_ARCH}"

SRC_URI:append               = ";name=${SRC_URI_NAME}"
SRC_URI_NAME                 = "${TARGET_ARCH}"
SRC_URI_NAME:class-native    = "${BUILD_ARCH}-native"
SRC_URI_NAME:class-nativesdk = "${BUILD_ARCH}-nativesdk"

INSANE_SKIP:${PN}:remove     = "arch"
INSANE_SKIP:${PN}-dbg:remove = "arch"
