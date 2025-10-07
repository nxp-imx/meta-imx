# Not supported on Linux
RDEPENDS:${PN}:remove:imx-nxp-bsp = " \
    flutter-packages-in-app-purchase-in-app-purchase-in-app-purchase-example \
    flutter-packages-interactive-media-ads-interactive-media-ads-example \
    flutter-packages-webview-flutter-webview-flutter-android-webview-flutter-android-example \
    flutter-packages-webview-flutter-webview-flutter-webview-flutter-example \
"

# Currently broken
RDEPENDS:${PN}:remove:imx-nxp-bsp = " \
    flutter-packages-google-adsense-google-adsense-example \
    flutter-packages-shared-preferences-shared-preferences-shared-preferences-tool \
"
