inherit packagegroup

# Currently broken and removed from this list: packagegroup-flutter-super-dash
RDEPENDS:${PN} = " \
    flutter-wayland-client \
    packagegroup-flutter-packages \
    packagegroup-flutter-samples \
    packagegroup-google-generative-ai-dart"
