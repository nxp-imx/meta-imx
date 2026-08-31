
require tensorflow-lite-${PV}.inc

SRCBRANCH_ethosu = "lf-6.18.37_2.1.0"
SRCREV_ethosu = "15423a6de9ddc5866149ebab44441c006cd33f7d"
SRC_URI:remove = "file://0001-ethosu_drv.h-Fix-gcc15-build-issues.patch"

DEPENDS += "ethos-u-vela"

RDEPENDS:${PN} += "tensorflow-lite ethos-u-vela"
