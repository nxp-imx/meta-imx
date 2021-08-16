FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-STDIO-844-No-need-to-change-the-App-s-apiVersion-to-.patch"

# libvulkan.so is loaded dynamically, so put it in the main package
FILES_SOLIBSDEV = ""
FILES:${PN} += "${libdir}/lib*${SOLIBSDEV}"
INSANE_SKIP:${PN} += "dev-so"
