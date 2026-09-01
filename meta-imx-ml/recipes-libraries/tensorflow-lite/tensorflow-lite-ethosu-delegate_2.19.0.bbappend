
require tensorflow-lite-${PV}.inc

SRCBRANCH_ethosu = "lf-6.18.37_2.1.0"
SRCREV_ethosu = "2e5857712719b9cf3e94d70a0685e26c0273ca06"
SRC_URI:remove = "file://0001-ethosu_drv.h-Fix-gcc15-build-issues.patch"

DEPENDS += "ethos-u-vela"

RDEPENDS:${PN} += "tensorflow-lite ethos-u-vela"
