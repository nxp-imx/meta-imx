FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://0001-util.c-Fix-cryptodev-build-failure.patch"

ERROR_QA:remove = "buildpaths"
WARN_QA:append = " buildpaths"
