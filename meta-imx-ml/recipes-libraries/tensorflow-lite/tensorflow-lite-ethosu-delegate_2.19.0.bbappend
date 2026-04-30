
require tensorflow-lite-${PV}.inc

SRCBRANCH_ethosu = "master"
SRCREV_ethosu = "c69a360e252743e1a73cc58c0de4e476350e4dc3" 
SRC_URI:remove = "file://0001-ethosu_drv.h-Fix-gcc15-build-issues.patch"

DEPENDS += "ethos-u-vela"

RDEPENDS:${PN} += "tensorflow-lite ethos-u-vela"
