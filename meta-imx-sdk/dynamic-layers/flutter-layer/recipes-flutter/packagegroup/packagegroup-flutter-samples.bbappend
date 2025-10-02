# Not supported on Linux
RDEPENDS:${PN}:remove:imx-nxp-bsp = " \
    flutter-samples-flutter-maps-firestore \
    flutter-samples-pedometer-example"

# Build is broken
RDEPENDS:${PN}:remove:imx-nxp-bsp = " \
    flutter-samples-desktop-photo-search-fluent-ui"
