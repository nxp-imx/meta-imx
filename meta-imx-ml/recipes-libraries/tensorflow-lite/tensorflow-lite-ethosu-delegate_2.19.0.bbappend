
require tensorflow-lite-${PV}.inc

SRCBRANCH_ethosu = "master"
SRCREV_ethosu = "f0d1d86e895e455d00068f2d3af02b1f6bb8b9dd"
SRC_URI:remove = "file://0001-ethosu_drv.h-Fix-gcc15-build-issues.patch"

DEPENDS += "ethos-u-vela"

RDEPENDS:${PN} += "tensorflow-lite ethos-u-vela"
