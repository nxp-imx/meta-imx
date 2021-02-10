# This is a header-only library, so the main package will be empty.
ALLOW_EMPTY_${PN} = "1"

# Undo the main recipe override of RDEPENDS_${PN}-dev. It is not needed with
# ALLOW_EMPTY_${PN} set properly to 1
RDEPENDS_${PN}-dev = "${PN} (= ${EXTENDPKGV})"
