
require tensorflow-lite-${PV}.inc

SRCBRANCH_ethosu = "lf-6.18.37_2.1.0"
SRCREV_ethosu = "008990354415f2b12cb51f87734892e220fa1e1e"
SRC_URI:remove = "file://0001-ethosu_drv.h-Fix-gcc15-build-issues.patch"

DEPENDS += "ethos-u-vela"

RDEPENDS:${PN} += "tensorflow-lite ethos-u-vela"
