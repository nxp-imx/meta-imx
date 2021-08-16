# This is a header-only library, so the main package will be empty.
ALLOW_EMPTY:${PN} = "1"

# Undo the main recipe override of RDEPENDS:${PN}-dev. It is not needed with
# ALLOW_EMPTY:${PN} set properly to 1
RDEPENDS:${PN}-dev = "${PN} (= ${EXTENDPKGV})"
