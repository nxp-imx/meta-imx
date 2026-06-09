
require tensorflow-lite-${PV}.inc

SRCBRANCH_ethosu = "master"
SRCREV_ethosu = "f8d3c61fdec5f86871da8094b77f792ee5c29053"
SRC_URI:remove = "file://0001-ethosu_drv.h-Fix-gcc15-build-issues.patch"

DEPENDS += "ethos-u-vela"

RDEPENDS:${PN} += "tensorflow-lite ethos-u-vela"
