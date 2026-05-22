
require tensorflow-lite-${PV}.inc

SRCBRANCH_ethosu = "master"
SRCREV_ethosu = "92b7c87b5c6c9247e4fee424c1e52803ac50b77e"
SRC_URI:remove = "file://0001-ethosu_drv.h-Fix-gcc15-build-issues.patch"

DEPENDS += "ethos-u-vela"

RDEPENDS:${PN} += "tensorflow-lite ethos-u-vela"
