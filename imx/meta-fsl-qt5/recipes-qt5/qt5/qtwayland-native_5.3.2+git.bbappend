FILESEXTRAPATHS_prepend := "${THISDIR}/qtwayland-git"

SRC_URI = "git://gitorious.org/qt/qtwayland.git;protocol=https;branch=5.4 \
           file://0001-Install-the-qtwaylandscanner-tool-to-the-native-side.patch"
