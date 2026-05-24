
require tensorflow-lite-${PV}.inc

SRCBRANCH_ethosu = "lf-6.18.20_2.0.0"
SRCREV_ethosu = "295ab4500345e2da232445d80e4ea1f02d6604fb"
SRC_URI:remove = "file://0001-ethosu_drv.h-Fix-gcc15-build-issues.patch"

DEPENDS += "ethos-u-vela"

RDEPENDS:${PN} += "tensorflow-lite ethos-u-vela"
