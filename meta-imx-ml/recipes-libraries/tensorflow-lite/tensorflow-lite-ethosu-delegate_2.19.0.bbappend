
require tensorflow-lite-${PV}.inc

SRCBRANCH_ethosu = "master"
SRCREV_ethosu = "1613e6836403a07def045461df6b350d08817428"
SRC_URI:remove = "file://0001-ethosu_drv.h-Fix-gcc15-build-issues.patch"

DEPENDS += "ethos-u-vela"

RDEPENDS:${PN} += "tensorflow-lite ethos-u-vela"
