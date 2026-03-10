FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " file://0001-setup.py-Remove-pkg_resources-usage-and-fallback-imp.patch"
