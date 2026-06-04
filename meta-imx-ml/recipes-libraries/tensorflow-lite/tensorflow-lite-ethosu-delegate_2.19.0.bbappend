
require tensorflow-lite-${PV}.inc

SRCBRANCH_ethosu = "lf-6.18.20_2.0.0"
SRCREV_ethosu = "378af58b031acb6afa96c7ef1fd63c10a3e71b29"
SRC_URI:remove = "file://0001-ethosu_drv.h-Fix-gcc15-build-issues.patch"

DEPENDS += "ethos-u-vela"

RDEPENDS:${PN} += "tensorflow-lite ethos-u-vela"
