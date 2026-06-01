
require tensorflow-lite-${PV}.inc

SRCBRANCH_ethosu = "lf-6.18.20_2.0.0"
SRCREV_ethosu = "4d37207ae98aea8dc7414e00148cb7bf9421cd87"
SRC_URI:remove = "file://0001-ethosu_drv.h-Fix-gcc15-build-issues.patch"

DEPENDS += "ethos-u-vela"

RDEPENDS:${PN} += "tensorflow-lite ethos-u-vela"
