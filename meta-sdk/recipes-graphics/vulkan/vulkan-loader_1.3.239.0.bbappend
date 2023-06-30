# libvulkan.so is loaded dynamically, so put it in the main package
FILES_SOLIBSDEV = ""
FILES:${PN} += "${libdir}/lib*${SOLIBSDEV}"
INSANE_SKIP:${PN} += "dev-so"
