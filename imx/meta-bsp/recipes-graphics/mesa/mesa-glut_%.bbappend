FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_mx6 = " file://0001-mesa-glut-Remove-m32-flag-from-the-linker.patch"
