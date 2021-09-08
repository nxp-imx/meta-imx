SUMMARY = "JSON for Modern C++"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.MIT;md5=dd0607f896f392c8b7d0290a676efc24"

SRC_URI = "git://github.com/nlohmann/json.git;protocol=https"
SRCREV = "db78ac1d7716f56fc9f1b030b715f872f93964e4"

S = "${WORKDIR}/git"

inherit cmake

ALLOW_EMPTY_${PN} = "1"
